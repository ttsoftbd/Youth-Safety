package com.tutorialspoint.myapplicationd.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorialspoint.myapplicationd.R;


public class Safe_InternetFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_safe__internet, container, false);

        ImageView e1 = (ImageView) rootView.findViewById(R.id.e1);
        ImageView e2 = (ImageView) rootView.findViewById(R.id.e2);
        ImageView e3 = (ImageView) rootView.findViewById(R.id.e3);
        ImageView e4 = (ImageView) rootView.findViewById(R.id.e4);
        ImageView e5 = (ImageView) rootView.findViewById(R.id.e5);
        ImageView e6 = (ImageView) rootView.findViewById(R.id.e6);
        ImageView e7 = (ImageView) rootView.findViewById(R.id.e7);
        ImageView e8 = (ImageView) rootView.findViewById(R.id.e8);

        TextView te1 = (TextView) rootView.findViewById(R.id.te1);
        TextView te2 = (TextView) rootView.findViewById(R.id.te2);
        TextView te3 = (TextView) rootView.findViewById(R.id.te3);
        TextView te4 = (TextView) rootView.findViewById(R.id.te4);
        TextView te5 = (TextView) rootView.findViewById(R.id.te5);
        TextView te6 = (TextView) rootView.findViewById(R.id.te6);
        TextView te7 = (TextView) rootView.findViewById(R.id.te7);
        TextView te8 = (TextView) rootView.findViewById(R.id.te8);


        e1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                te1.setVisibility(View.VISIBLE);
                te2.setVisibility(View.GONE);
                te3.setVisibility(View.GONE);
                te4.setVisibility(View.GONE);
                te5.setVisibility(View.GONE);
                te6.setVisibility(View.GONE);
                te7.setVisibility(View.GONE);
                te8.setVisibility(View.GONE);
            }
        });

        e2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                te1.setVisibility(View.GONE);
                te2.setVisibility(View.VISIBLE);
                te3.setVisibility(View.GONE);
                te4.setVisibility(View.GONE);
                te5.setVisibility(View.GONE);
                te6.setVisibility(View.GONE);
                te7.setVisibility(View.GONE);
                te8.setVisibility(View.GONE);
            }
        });


        e3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                te1.setVisibility(View.GONE);
                te2.setVisibility(View.GONE);
                te3.setVisibility(View.VISIBLE);
                te4.setVisibility(View.GONE);
                te5.setVisibility(View.GONE);
                te6.setVisibility(View.GONE);
                te7.setVisibility(View.GONE);
                te8.setVisibility(View.GONE);
            }
        });


        e4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                te1.setVisibility(View.GONE);
                te2.setVisibility(View.GONE);
                te3.setVisibility(View.GONE);
                te4.setVisibility(View.VISIBLE);
                te5.setVisibility(View.GONE);
                te6.setVisibility(View.GONE);
                te7.setVisibility(View.GONE);
                te8.setVisibility(View.GONE);
            }
        });


        e5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                te1.setVisibility(View.GONE);
                te2.setVisibility(View.GONE);
                te3.setVisibility(View.GONE);
                te4.setVisibility(View.GONE);
                te5.setVisibility(View.VISIBLE);
                te6.setVisibility(View.GONE);
                te7.setVisibility(View.GONE);
                te8.setVisibility(View.GONE);
            }
        });


        e6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                te1.setVisibility(View.GONE);
                te2.setVisibility(View.GONE);
                te3.setVisibility(View.GONE);
                te4.setVisibility(View.GONE);
                te5.setVisibility(View.GONE);
                te6.setVisibility(View.VISIBLE);
                te7.setVisibility(View.GONE);
                te8.setVisibility(View.GONE);
            }
        });


        e7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                te1.setVisibility(View.GONE);
                te2.setVisibility(View.GONE);
                te3.setVisibility(View.GONE);
                te4.setVisibility(View.GONE);
                te5.setVisibility(View.GONE);
                te6.setVisibility(View.GONE);
                te7.setVisibility(View.VISIBLE);
                te8.setVisibility(View.GONE);
            }
        });

        e8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                te1.setVisibility(View.GONE);
                te2.setVisibility(View.GONE);
                te3.setVisibility(View.GONE);
                te4.setVisibility(View.GONE);
                te5.setVisibility(View.GONE);
                te6.setVisibility(View.GONE);
                te7.setVisibility(View.GONE);
                te8.setVisibility(View.VISIBLE);
            }
        });

        return rootView;
    }
}