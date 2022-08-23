package com.tutorialspoint.myapplicationd.ui.hacking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.tutorialspoint.myapplicationd.R;
import com.tutorialspoint.myapplicationd.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_slideshow, container, false);


        ImageView h1 = (ImageView) rootView.findViewById(R.id.h1);
        ImageView h2 = (ImageView) rootView.findViewById(R.id.h2);
        ImageView h4 = (ImageView) rootView.findViewById(R.id.h4);

        ImageView h5 = (ImageView) rootView.findViewById(R.id.h5);
        ImageView h6 = (ImageView) rootView.findViewById(R.id.h6);
        ImageView h7 = (ImageView) rootView.findViewById(R.id.h7);
        ImageView h8 = (ImageView) rootView.findViewById(R.id.h8);


        ImageView h9 = (ImageView) rootView.findViewById(R.id.h9);
        ImageView h10 = (ImageView) rootView.findViewById(R.id.h10);
        ImageView h12 = (ImageView) rootView.findViewById(R.id.h12);


        ImageView h13 = (ImageView) rootView.findViewById(R.id.h13);
        ImageView h14 = (ImageView) rootView.findViewById(R.id.h14);
        ImageView h15 = (ImageView) rootView.findViewById(R.id.h15);
        ImageView h16 = (ImageView) rootView.findViewById(R.id.h16);



        TextView th1 = (TextView) rootView.findViewById(R.id.th1);
        TextView th2 = (TextView) rootView.findViewById(R.id.th2);
        TextView th4 = (TextView) rootView.findViewById(R.id.th4);

        TextView th5 = (TextView) rootView.findViewById(R.id.th5);
        TextView th6 = (TextView) rootView.findViewById(R.id.th6);
        TextView th7 = (TextView) rootView.findViewById(R.id.th7);
        TextView th8 = (TextView) rootView.findViewById(R.id.th8);

        TextView th9 = (TextView) rootView.findViewById(R.id.th9);
        TextView th10 = (TextView) rootView.findViewById(R.id.th10);
        TextView th12 = (TextView) rootView.findViewById(R.id.th12);

        TextView th13 = (TextView) rootView.findViewById(R.id.th13);
        TextView th14 = (TextView) rootView.findViewById(R.id.th14);
        TextView th15 = (TextView) rootView.findViewById(R.id.th15);
        TextView th16 = (TextView) rootView.findViewById(R.id.th16);


        h1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                th1.setVisibility(View.VISIBLE);
                th2.setVisibility(View.GONE);
                th4.setVisibility(View.GONE);
                th5.setVisibility(View.GONE);
                th6.setVisibility(View.GONE);
                th7.setVisibility(View.GONE);
                th8.setVisibility(View.GONE);
                th9.setVisibility(View.GONE);
                th10.setVisibility(View.GONE);
                th12.setVisibility(View.GONE);
                th13.setVisibility(View.GONE);
                th14.setVisibility(View.GONE);
                th15.setVisibility(View.GONE);
                th16.setVisibility(View.GONE);
            }
        });


        h2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                th1.setVisibility(View.GONE);
                th2.setVisibility(View.VISIBLE);
                th4.setVisibility(View.GONE);
                th5.setVisibility(View.GONE);
                th6.setVisibility(View.GONE);
                th7.setVisibility(View.GONE);
                th8.setVisibility(View.GONE);
                th9.setVisibility(View.GONE);
                th10.setVisibility(View.GONE);
                th12.setVisibility(View.GONE);
                th13.setVisibility(View.GONE);
                th14.setVisibility(View.GONE);
                th15.setVisibility(View.GONE);
                th16.setVisibility(View.GONE);
            }
        });





        h4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                th1.setVisibility(View.GONE);
                th2.setVisibility(View.GONE);
                th4.setVisibility(View.VISIBLE);
                th5.setVisibility(View.GONE);
                th6.setVisibility(View.GONE);
                th7.setVisibility(View.GONE);
                th8.setVisibility(View.GONE);
                th9.setVisibility(View.GONE);
                th10.setVisibility(View.GONE);
                th12.setVisibility(View.GONE);
                th13.setVisibility(View.GONE);
                th14.setVisibility(View.GONE);
                th15.setVisibility(View.GONE);
                th16.setVisibility(View.GONE);
            }
        });



        h5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                th1.setVisibility(View.GONE);
                th2.setVisibility(View.GONE);
                th4.setVisibility(View.GONE);
                th5.setVisibility(View.VISIBLE);
                th6.setVisibility(View.GONE);
                th7.setVisibility(View.GONE);
                th8.setVisibility(View.GONE);
                th9.setVisibility(View.GONE);
                th10.setVisibility(View.GONE);
                th12.setVisibility(View.GONE);
                th13.setVisibility(View.GONE);
                th14.setVisibility(View.GONE);
                th15.setVisibility(View.GONE);
                th16.setVisibility(View.GONE);
            }
        });


        h6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                th1.setVisibility(View.GONE);
                th2.setVisibility(View.GONE);
                th4.setVisibility(View.GONE);
                th5.setVisibility(View.GONE);
                th6.setVisibility(View.VISIBLE);
                th7.setVisibility(View.GONE);
                th8.setVisibility(View.GONE);
                th9.setVisibility(View.GONE);
                th10.setVisibility(View.GONE);
                th12.setVisibility(View.GONE);
                th13.setVisibility(View.GONE);
                th14.setVisibility(View.GONE);
                th15.setVisibility(View.GONE);
                th16.setVisibility(View.GONE);
            }
        });



        h7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                th1.setVisibility(View.GONE);
                th2.setVisibility(View.GONE);
                th4.setVisibility(View.GONE);
                th5.setVisibility(View.GONE);
                th6.setVisibility(View.GONE);
                th7.setVisibility(View.VISIBLE);
                th8.setVisibility(View.GONE);
                th9.setVisibility(View.GONE);
                th10.setVisibility(View.GONE);
                th12.setVisibility(View.GONE);
                th13.setVisibility(View.GONE);
                th14.setVisibility(View.GONE);
                th15.setVisibility(View.GONE);
                th16.setVisibility(View.GONE);
            }
        });



        h8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                th1.setVisibility(View.GONE);
                th2.setVisibility(View.GONE);
                th4.setVisibility(View.GONE);
                th5.setVisibility(View.GONE);
                th6.setVisibility(View.GONE);
                th7.setVisibility(View.GONE);
                th8.setVisibility(View.VISIBLE);
                th9.setVisibility(View.GONE);
                th10.setVisibility(View.GONE);
                th12.setVisibility(View.GONE);
                th13.setVisibility(View.GONE);
                th14.setVisibility(View.GONE);
                th15.setVisibility(View.GONE);
                th16.setVisibility(View.GONE);
            }
        });



        h9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                th1.setVisibility(View.GONE);
                th2.setVisibility(View.GONE);
                th4.setVisibility(View.GONE);
                th5.setVisibility(View.GONE);
                th6.setVisibility(View.GONE);
                th7.setVisibility(View.GONE);
                th8.setVisibility(View.GONE);
                th9.setVisibility(View.VISIBLE);
                th10.setVisibility(View.GONE);
                th12.setVisibility(View.GONE);
                th13.setVisibility(View.GONE);
                th14.setVisibility(View.GONE);
                th15.setVisibility(View.GONE);
                th16.setVisibility(View.GONE);
            }
        });



        h10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                th1.setVisibility(View.GONE);
                th2.setVisibility(View.GONE);

                th4.setVisibility(View.GONE);
                th5.setVisibility(View.GONE);
                th6.setVisibility(View.GONE);
                th7.setVisibility(View.GONE);
                th8.setVisibility(View.GONE);
                th9.setVisibility(View.GONE);
                th10.setVisibility(View.VISIBLE);
                th12.setVisibility(View.GONE);
                th13.setVisibility(View.GONE);
                th14.setVisibility(View.GONE);
                th15.setVisibility(View.GONE);
                th16.setVisibility(View.GONE);
            }
        });



        h12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                th1.setVisibility(View.GONE);
                th2.setVisibility(View.GONE);
                th4.setVisibility(View.GONE);
                th5.setVisibility(View.GONE);
                th6.setVisibility(View.GONE);
                th7.setVisibility(View.GONE);
                th8.setVisibility(View.GONE);
                th9.setVisibility(View.GONE);
                th10.setVisibility(View.GONE);
                th12.setVisibility(View.VISIBLE);
                th13.setVisibility(View.GONE);
                th14.setVisibility(View.GONE);
                th15.setVisibility(View.GONE);
                th16.setVisibility(View.GONE);
            }
        });


        h13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                th1.setVisibility(View.GONE);
                th2.setVisibility(View.GONE);
                th4.setVisibility(View.GONE);
                th5.setVisibility(View.GONE);
                th6.setVisibility(View.GONE);
                th7.setVisibility(View.GONE);
                th8.setVisibility(View.GONE);
                th9.setVisibility(View.GONE);
                th10.setVisibility(View.GONE);
                th12.setVisibility(View.GONE);
                th13.setVisibility(View.VISIBLE);
                th14.setVisibility(View.GONE);
                th15.setVisibility(View.GONE);
                th16.setVisibility(View.GONE);
            }
        });



        h14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                th1.setVisibility(View.GONE);
                th2.setVisibility(View.GONE);
                th4.setVisibility(View.GONE);
                th5.setVisibility(View.GONE);
                th6.setVisibility(View.GONE);
                th7.setVisibility(View.GONE);
                th8.setVisibility(View.GONE);
                th9.setVisibility(View.GONE);
                th10.setVisibility(View.GONE);
                th12.setVisibility(View.GONE);
                th13.setVisibility(View.GONE);
                th14.setVisibility(View.VISIBLE);
                th15.setVisibility(View.GONE);
                th16.setVisibility(View.GONE);
            }
        });


        h15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                th1.setVisibility(View.GONE);
                th2.setVisibility(View.GONE);
                th4.setVisibility(View.GONE);
                th5.setVisibility(View.GONE);
                th6.setVisibility(View.GONE);
                th7.setVisibility(View.GONE);
                th8.setVisibility(View.GONE);
                th9.setVisibility(View.GONE);
                th10.setVisibility(View.GONE);
                th12.setVisibility(View.GONE);
                th13.setVisibility(View.GONE);
                th14.setVisibility(View.GONE);
                th15.setVisibility(View.VISIBLE);
                th16.setVisibility(View.GONE);
            }
        });


        h16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                th1.setVisibility(View.GONE);
                th2.setVisibility(View.GONE);
                th4.setVisibility(View.GONE);
                th5.setVisibility(View.GONE);
                th6.setVisibility(View.GONE);
                th7.setVisibility(View.GONE);
                th8.setVisibility(View.GONE);
                th9.setVisibility(View.GONE);
                th10.setVisibility(View.GONE);
                th12.setVisibility(View.GONE);
                th13.setVisibility(View.GONE);
                th14.setVisibility(View.GONE);
                th15.setVisibility(View.GONE);
                th16.setVisibility(View.VISIBLE);
            }
        });








        return rootView;

    }
}