package com.tutorialspoint.myapplicationd.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorialspoint.myapplicationd.R;

public class EarlyFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_early, container, false);



        ImageView b1 = (ImageView) rootView.findViewById(R.id.b1);
        ImageView b2 = (ImageView) rootView.findViewById(R.id.b2);
        ImageView b3 = (ImageView) rootView.findViewById(R.id.b3);
        ImageView b4 = (ImageView) rootView.findViewById(R.id.b4);
        ImageView b5 = (ImageView) rootView.findViewById(R.id.b5);
        ImageView b6 = (ImageView) rootView.findViewById(R.id.b6);


        TextView tb1 = (TextView) rootView.findViewById(R.id.tb1);
        TextView tb2 = (TextView) rootView.findViewById(R.id.tb2);
        TextView tb3 = (TextView) rootView.findViewById(R.id.tb3);
        TextView tb4 = (TextView) rootView.findViewById(R.id.tb4);
        TextView tb5 = (TextView) rootView.findViewById(R.id.tb5);
        TextView tb6 = (TextView) rootView.findViewById(R.id.tb6);



        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tb1.setVisibility(View.VISIBLE);
                tb2.setVisibility(View.GONE);
                tb3.setVisibility(View.GONE);
                tb4.setVisibility(View.GONE);
                tb5.setVisibility(View.GONE);
                tb6.setVisibility(View.GONE);

            }
        });

        tb1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tb1.setVisibility(View.GONE);


            }
        });


        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tb1.setVisibility(View.GONE);
                tb2.setVisibility(View.VISIBLE);
                tb3.setVisibility(View.GONE);
                tb4.setVisibility(View.GONE);
                tb5.setVisibility(View.GONE);
                tb6.setVisibility(View.GONE);

            }
        });

        tb2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tb2.setVisibility(View.GONE);


            }
        });




        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tb1.setVisibility(View.GONE);
                tb2.setVisibility(View.GONE);
                tb3.setVisibility(View.VISIBLE);
                tb4.setVisibility(View.GONE);
                tb5.setVisibility(View.GONE);
                tb6.setVisibility(View.GONE);

            }
        });

        tb3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tb3.setVisibility(View.GONE);


            }
        });


        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tb1.setVisibility(View.GONE);
                tb2.setVisibility(View.GONE);
                tb3.setVisibility(View.GONE);
                tb4.setVisibility(View.VISIBLE);
                tb5.setVisibility(View.GONE);
                tb6.setVisibility(View.GONE);

            }
        });

        tb4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tb4.setVisibility(View.GONE);


            }
        });


        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tb1.setVisibility(View.GONE);
                tb2.setVisibility(View.GONE);
                tb3.setVisibility(View.GONE);
                tb4.setVisibility(View.GONE);
                tb5.setVisibility(View.VISIBLE);
                tb6.setVisibility(View.GONE);

            }
        });

        tb5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tb5.setVisibility(View.GONE);


            }
        });


        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tb1.setVisibility(View.GONE);
                tb2.setVisibility(View.GONE);
                tb3.setVisibility(View.GONE);
                tb4.setVisibility(View.GONE);
                tb5.setVisibility(View.GONE);
                tb6.setVisibility(View.VISIBLE);

            }
        });


        tb6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tb6.setVisibility(View.GONE);


            }
        });




        return rootView;
    }
}