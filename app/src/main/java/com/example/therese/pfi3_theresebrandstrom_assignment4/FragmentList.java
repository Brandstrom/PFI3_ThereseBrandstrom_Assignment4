package com.example.therese.pfi3_theresebrandstrom_assignment4;

/**
 * Created by Therese on 15-04-22.
 */

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link android.app.Fragment} subclass.
 */
public class FragmentList extends Fragment {

 // Create an arraylist of planets.
    public static ArrayList<Drawable> d= new ArrayList<Drawable>();
    public static ArrayList<Planet> planets = new ArrayList<Planet>();
public static int currentPlanet;
    //This method comes first so lets create the books here
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Clear arraylist and add desired planets, giving them a the following values; "name", "radius" and "avarage temperature" and a drawable image

        planets.clear();
        planets.add(new Planet(getResources().getString(R.string.earth),
                getResources().getString(R.string.earthInfo),
                getResources().getString(R.string.earthRadius),
                getResources().getString(R.string.earthT),
                getResources().getDrawable(R.drawable.earth)));


        planets.add(new Planet(getResources().getString(R.string.venus),
                getResources().getString(R.string.venusinfo),
                getResources().getString(R.string.venusRadius),
                getResources().getString(R.string.venusT),
                getResources().getDrawable(R.drawable.venus)));

        planets.add(new Planet(getResources().getString(R.string.mars),
                getResources().getString(R.string.marsInfo),
                getResources().getString(R.string.marsRadius),
                getResources().getString(R.string.marsT),
                getResources().getDrawable(R.drawable.mars)));


        planets.add(new Planet(getResources().getString(R.string.jupiter),
                getResources().getString(R.string.jupiterinfo),
                getResources().getString(R.string.jupiterRadius),
                getResources().getString(R.string.jupiterT),
                getResources().getDrawable( R.drawable.jupiter)));

        planets.add(new Planet(getResources().getString(R.string.neptunus),
                getResources().getString(R.string.neptunusinfo),
                getResources().getString(R.string.neptunusRadius),
                getResources().getString(R.string.neptunusT),
                getResources().getDrawable(R.drawable.neptunus)));

        planets.add(new Planet(getResources().getString(R.string.uranus),
                getResources().getString(R.string.uranusinfo),
                getResources().getString(R.string.uranusRadius),
                getResources().getString(R.string.uranusT),
                getResources().getDrawable(R.drawable.uranus)));

        planets.add(new Planet(getResources().getString(R.string.merkurius),
                getResources().getString(R.string.merkuriusinfo),
                getResources().getString(R.string.merkuriusRadius),
                getResources().getString(R.string.merkuriusT),
                getResources().getDrawable(R.drawable.merkurius)));

        planets.add(new Planet(getResources().getString(R.string.mars),
                getResources().getString(R.string.marsInfo),
                getResources().getString(R.string.marsRadius),
                getResources().getString(R.string.marsT),
                getResources().getDrawable(R.drawable.mars)));

        //En till lista pga planets har imaget som hade en int

       d.add(getResources().getDrawable(R.drawable.earth));
       // planets.add(new Planet(getResources().getString(R.string.earth),getResources().getString(R.string.earthInfo),getResources().getString(R.string.earthRadius),getResources().getString(R.string.earthT) ,d));
        d.add(getResources().getDrawable(R.drawable.venus));
      //  planets.add(new Planet(getResources().getString(R.string.venus),getResources().getString(R.string.venusinfo),getResources().getString(R.string.venusRadius),getResources().getString(R.string.venusT) ,d));
        d.add(getResources().getDrawable(R.drawable.merkurius));
      //  planets.add(new Planet(getResources().getString(R.string.merkurius),getResources().getString(R.string.merkuriusinfo),getResources().getString(R.string.merkuriusRadius),getResources().getString(R.string.merkuriusT) ,d));
        d.add(getResources().getDrawable(R.drawable.saturnus));
      //  planets.add(new Planet(getResources().getString(R.string.saturnus),getResources().getString(R.string.saturnusinfo),getResources().getString(R.string.saturnusRadius),getResources().getString(R.string.saturnusT) ,d));
        d.add( getResources().getDrawable(R.drawable.neptunus));
      //  planets.add(new Planet(getResources().getString(R.string.neptunus),getResources().getString(R.string.neptunusinfo),getResources().getString(R.string.neptunusRadius),getResources().getString(R.string.neptunusT) ,d));
        d.add(getResources().getDrawable(R.drawable.jupiter));
     //  planets.add(new Planet(getResources().getString(R.string.jupiter),getResources().getString(R.string.jupiterinfo),getResources().getString(R.string.jupiterRadius),getResources().getString(R.string.jupiterT) ,d));
        d.add(getResources().getDrawable(R.drawable.uranus));
      //  planets.add(new Planet(getResources().getString(R.string.uranus),getResources().getString(R.string.uranusinfo),getResources().getString(R.string.uranusRadius),getResources().getString(R.string.uranusT) ,d));
        d.add( getResources().getDrawable(R.drawable.earth));
       // planets.add(new Planet(getResources().getString(R.string.earth),getResources().getString(R.string.mars),getResources().getString(R.string.earthRadius),getResources().getString(R.string.earthT) ,d));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment_with_list, container, false);
        Log.i("FragmentList", "Number of planets added: " + planets.size());
        MyListAdapter la = new MyListAdapter(getActivity(),planets);
        GridView lv = (GridView) v.findViewById(R.id.gridView);
        lv.setAdapter(la);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                currentPlanet = position;

                // Log and toast on list interaction
                Log.i("FragmentList", "Clicked on position: " + position +"/ " + planets.get(position).getName());
                //display in short period of time
                Toast.makeText(getActivity(), planets.get(position).getName(),
                        Toast.LENGTH_SHORT).show();

                // Fragment transaction on list interaction

                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                FragmentPlanet bf = new FragmentPlanet();
                // byt layout till fragment2
                ft.replace(R.id.main_layout,bf);
                ft.commit();

            }

        });
        return v;
    }

    // Methods to use in order to get desired info for the fragment_planet fragment

    public String getName(){
        return planets.get(currentPlanet).getName();
    }

    public String getFacts(){
        return planets.get(currentPlanet).getInfo();

}
    public String getStats(){
        return planets.get(currentPlanet).getSummary();

    }
    public Drawable getImage(){
        return planets.get(currentPlanet).getImage();
       // return d.get(planets.get(currentPlanet).getImageIndex());
    }

}
