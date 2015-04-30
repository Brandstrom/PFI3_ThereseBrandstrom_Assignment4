package com.example.therese.pfi3_theresebrandstrom_assignment4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Therese on 15-04-22.
 */


public class FragmentInfoDialog extends FragmentDialog implements View.OnClickListener {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment__dialog, container, false);
        TextView tv_title = (TextView) v.findViewById(R.id.tv_dialog_title);
        TextView tv_description = (TextView) v.findViewById(R.id.tv_dialog_description);
        //tv_description.setText(R.string.presentation);
        ImageView iv = (ImageView) v.findViewById(R.id.iv_dialog);
        v.setOnClickListener(this);
        tv_description.setOnClickListener(this);
        iv.setOnClickListener(this);
        tv_title.setOnClickListener(this);
        tv_title.setText("Therese Brandstrom");
        return v;
    }



    @Override
    public void onClick(View v) {
        FragmentInfoDialog.this.dismiss();
    }
}
