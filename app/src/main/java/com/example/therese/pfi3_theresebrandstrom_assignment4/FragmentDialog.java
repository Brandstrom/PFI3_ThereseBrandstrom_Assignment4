package com.example.therese.pfi3_theresebrandstrom_assignment4;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Therese on 15-04-22.
 */
public class FragmentDialog extends DialogFragment implements View.OnClickListener {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment__dialog, container, false);

        return v;
    }



    @Override
    public void onClick(View v) {
        FragmentDialog.this.dismiss();
    }
}
