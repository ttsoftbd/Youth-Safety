package com.tutorialspoint.myapplicationd.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorialspoint.myapplicationd.R;


public class DomesticFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_domestic, container, false);

        ImageView d1 = (ImageView) rootView.findViewById(R.id.d1);
        ImageView d2 = (ImageView) rootView.findViewById(R.id.d2);
        ImageView d3 = (ImageView) rootView.findViewById(R.id.d3);
        ImageView d4 = (ImageView) rootView.findViewById(R.id.d4);
        ImageView d5 = (ImageView) rootView.findViewById(R.id.d5);
        ImageView d6 = (ImageView) rootView.findViewById(R.id.d6);


        TextView td1 = (TextView) rootView.findViewById(R.id.td1);
        TextView td2 = (TextView) rootView.findViewById(R.id.td2);
        TextView td3 = (TextView) rootView.findViewById(R.id.td3);
        TextView td4 = (TextView) rootView.findViewById(R.id.td4);
        TextView td5 = (TextView) rootView.findViewById(R.id.td5);
        TextView td6 = (TextView) rootView.findViewById(R.id.td6);

        d1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                td1.setVisibility(View.VISIBLE);
                td2.setVisibility(View.GONE);
                td3.setVisibility(View.GONE);
                td4.setVisibility(View.GONE);
                td5.setVisibility(View.GONE);
                td6.setVisibility(View.GONE);

            }
        });


        d2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                td1.setVisibility(View.GONE);
                td2.setVisibility(View.VISIBLE);
                td3.setVisibility(View.GONE);
                td4.setVisibility(View.GONE);
                td5.setVisibility(View.GONE);
                td6.setVisibility(View.GONE);

            }
        });



        d3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                td1.setVisibility(View.GONE);
                td2.setVisibility(View.GONE);
                td3.setVisibility(View.VISIBLE);
                td4.setVisibility(View.GONE);
                td5.setVisibility(View.GONE);
                td6.setVisibility(View.GONE);

            }
        });



        d4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                td1.setVisibility(View.GONE);
                td2.setVisibility(View.GONE);
                td3.setVisibility(View.GONE);
                td4.setVisibility(View.VISIBLE);
                td5.setVisibility(View.GONE);
                td6.setVisibility(View.GONE);

            }
        });



        d5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                td1.setVisibility(View.GONE);
                td2.setVisibility(View.GONE);
                td3.setVisibility(View.GONE);
                td4.setVisibility(View.GONE);
                td5.setVisibility(View.VISIBLE);
                td6.setVisibility(View.GONE);

            }
        });



        d6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                td1.setVisibility(View.GONE);
                td2.setVisibility(View.GONE);
                td3.setVisibility(View.GONE);
                td4.setVisibility(View.GONE);
                td5.setVisibility(View.GONE);
                td6.setVisibility(View.VISIBLE);

            }
        });



        return rootView;
    }
}