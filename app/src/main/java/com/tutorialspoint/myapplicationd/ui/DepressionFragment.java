package com.tutorialspoint.myapplicationd.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorialspoint.myapplicationd.R;

public class DepressionFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_depression, container, false);

        ImageView p1 = (ImageView) rootView.findViewById(R.id.p1);
        ImageView p2 = (ImageView) rootView.findViewById(R.id.p2);
        ImageView p3 = (ImageView) rootView.findViewById(R.id.p3);
        ImageView p4 = (ImageView) rootView.findViewById(R.id.p4);
        ImageView p5 = (ImageView) rootView.findViewById(R.id.p5);
        ImageView p6 = (ImageView) rootView.findViewById(R.id.p6);
        ImageView p7 = (ImageView) rootView.findViewById(R.id.p7);
        ImageView p8 = (ImageView) rootView.findViewById(R.id.p8);
        ImageView p9 = (ImageView) rootView.findViewById(R.id.p9);
        ImageView p10 = (ImageView) rootView.findViewById(R.id.p10);
        ImageView p11 = (ImageView) rootView.findViewById(R.id.p11);
        ImageView p12 = (ImageView) rootView.findViewById(R.id.p12);
        ImageView p13 = (ImageView) rootView.findViewById(R.id.p13);
        ImageView p14 = (ImageView) rootView.findViewById(R.id.p14);
        ImageView p15 = (ImageView) rootView.findViewById(R.id.p15);

        TextView px1 = (TextView) rootView.findViewById(R.id.px1);
        TextView px2 = (TextView) rootView.findViewById(R.id.px2);
        TextView px3 = (TextView) rootView.findViewById(R.id.px3);
        TextView px4 = (TextView) rootView.findViewById(R.id.px4);
        TextView px5 = (TextView) rootView.findViewById(R.id.px5);
        TextView px6 = (TextView) rootView.findViewById(R.id.px6);
        TextView px7 = (TextView) rootView.findViewById(R.id.px7);
        TextView px8 = (TextView) rootView.findViewById(R.id.px8);
        TextView px9 = (TextView) rootView.findViewById(R.id.px9);
        TextView px10 = (TextView) rootView.findViewById(R.id.px10);
        TextView px11 = (TextView) rootView.findViewById(R.id.px11);
        TextView px12 = (TextView) rootView.findViewById(R.id.px12);
        TextView px13 = (TextView) rootView.findViewById(R.id.px13);
        TextView px14 = (TextView) rootView.findViewById(R.id.px14);
        TextView px15 = (TextView) rootView.findViewById(R.id.px15);


        p1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.VISIBLE);
                px2.setVisibility(View.GONE);
                px3.setVisibility(View.GONE);
                px4.setVisibility(View.GONE);
                px5.setVisibility(View.GONE);
                px6.setVisibility(View.GONE);
                px7.setVisibility(View.GONE);
                px8.setVisibility(View.GONE);
                px9.setVisibility(View.GONE);
                px10.setVisibility(View.GONE);
                px11.setVisibility(View.GONE);
                px12.setVisibility(View.GONE);
                px13.setVisibility(View.GONE);
                px14.setVisibility(View.GONE);
                px15.setVisibility(View.GONE);



            }
        });

        p2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.GONE);
                px2.setVisibility(View.VISIBLE);
                px3.setVisibility(View.GONE);
                px4.setVisibility(View.GONE);
                px5.setVisibility(View.GONE);
                px6.setVisibility(View.GONE);
                px7.setVisibility(View.GONE);
                px8.setVisibility(View.GONE);
                px9.setVisibility(View.GONE);
                px10.setVisibility(View.GONE);
                px11.setVisibility(View.GONE);
                px12.setVisibility(View.GONE);
                px13.setVisibility(View.GONE);
                px14.setVisibility(View.GONE);
                px15.setVisibility(View.GONE);



            }
        });



        p3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.GONE);
                px2.setVisibility(View.GONE);
                px3.setVisibility(View.VISIBLE);
                px4.setVisibility(View.GONE);
                px5.setVisibility(View.GONE);
                px6.setVisibility(View.GONE);
                px7.setVisibility(View.GONE);
                px8.setVisibility(View.GONE);
                px9.setVisibility(View.GONE);
                px10.setVisibility(View.GONE);
                px11.setVisibility(View.GONE);
                px12.setVisibility(View.GONE);
                px13.setVisibility(View.GONE);
                px14.setVisibility(View.GONE);
                px15.setVisibility(View.GONE);



            }
        });



        p4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.GONE);
                px2.setVisibility(View.GONE);
                px3.setVisibility(View.GONE);
                px4.setVisibility(View.VISIBLE);
                px5.setVisibility(View.GONE);
                px6.setVisibility(View.GONE);
                px7.setVisibility(View.GONE);
                px8.setVisibility(View.GONE);
                px9.setVisibility(View.GONE);
                px10.setVisibility(View.GONE);
                px11.setVisibility(View.GONE);
                px12.setVisibility(View.GONE);
                px13.setVisibility(View.GONE);
                px14.setVisibility(View.GONE);
                px15.setVisibility(View.GONE);



            }
        });


        p5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.GONE);
                px2.setVisibility(View.GONE);
                px3.setVisibility(View.GONE);
                px4.setVisibility(View.GONE);
                px5.setVisibility(View.VISIBLE);
                px6.setVisibility(View.GONE);
                px7.setVisibility(View.GONE);
                px8.setVisibility(View.GONE);
                px9.setVisibility(View.GONE);
                px10.setVisibility(View.GONE);
                px11.setVisibility(View.GONE);
                px12.setVisibility(View.GONE);
                px13.setVisibility(View.GONE);
                px14.setVisibility(View.GONE);
                px15.setVisibility(View.GONE);



            }
        });


        p6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.GONE);
                px2.setVisibility(View.GONE);
                px3.setVisibility(View.GONE);
                px4.setVisibility(View.GONE);
                px5.setVisibility(View.GONE);
                px6.setVisibility(View.VISIBLE);
                px7.setVisibility(View.GONE);
                px8.setVisibility(View.GONE);
                px9.setVisibility(View.GONE);
                px10.setVisibility(View.GONE);
                px11.setVisibility(View.GONE);
                px12.setVisibility(View.GONE);
                px13.setVisibility(View.GONE);
                px14.setVisibility(View.GONE);
                px15.setVisibility(View.GONE);



            }
        });


        p7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.GONE);
                px2.setVisibility(View.GONE);
                px3.setVisibility(View.GONE);
                px4.setVisibility(View.GONE);
                px5.setVisibility(View.GONE);
                px6.setVisibility(View.GONE);
                px7.setVisibility(View.VISIBLE);
                px8.setVisibility(View.GONE);
                px9.setVisibility(View.GONE);
                px10.setVisibility(View.GONE);
                px11.setVisibility(View.GONE);
                px12.setVisibility(View.GONE);
                px13.setVisibility(View.GONE);
                px14.setVisibility(View.GONE);
                px15.setVisibility(View.GONE);



            }
        });


        p8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.GONE);
                px2.setVisibility(View.GONE);
                px3.setVisibility(View.GONE);
                px4.setVisibility(View.GONE);
                px5.setVisibility(View.GONE);
                px6.setVisibility(View.GONE);
                px7.setVisibility(View.GONE);
                px8.setVisibility(View.VISIBLE);
                px9.setVisibility(View.GONE);
                px10.setVisibility(View.GONE);
                px11.setVisibility(View.GONE);
                px12.setVisibility(View.GONE);
                px13.setVisibility(View.GONE);
                px14.setVisibility(View.GONE);
                px15.setVisibility(View.GONE);



            }
        });


        p9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.GONE);
                px2.setVisibility(View.GONE);
                px3.setVisibility(View.GONE);
                px4.setVisibility(View.GONE);
                px5.setVisibility(View.GONE);
                px6.setVisibility(View.GONE);
                px7.setVisibility(View.GONE);
                px8.setVisibility(View.GONE);
                px9.setVisibility(View.VISIBLE);
                px10.setVisibility(View.GONE);
                px11.setVisibility(View.GONE);
                px12.setVisibility(View.GONE);
                px13.setVisibility(View.GONE);
                px14.setVisibility(View.GONE);
                px15.setVisibility(View.GONE);



            }
        });


        p10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.GONE);
                px2.setVisibility(View.GONE);
                px3.setVisibility(View.GONE);
                px4.setVisibility(View.GONE);
                px5.setVisibility(View.GONE);
                px6.setVisibility(View.GONE);
                px7.setVisibility(View.GONE);
                px8.setVisibility(View.GONE);
                px9.setVisibility(View.GONE);
                px10.setVisibility(View.VISIBLE);
                px11.setVisibility(View.GONE);
                px12.setVisibility(View.GONE);
                px13.setVisibility(View.GONE);
                px14.setVisibility(View.GONE);
                px15.setVisibility(View.GONE);



            }
        });


        p11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.GONE);
                px2.setVisibility(View.GONE);
                px3.setVisibility(View.GONE);
                px4.setVisibility(View.GONE);
                px5.setVisibility(View.GONE);
                px6.setVisibility(View.GONE);
                px7.setVisibility(View.GONE);
                px8.setVisibility(View.GONE);
                px9.setVisibility(View.GONE);
                px10.setVisibility(View.GONE);
                px11.setVisibility(View.VISIBLE);
                px12.setVisibility(View.GONE);
                px13.setVisibility(View.GONE);
                px14.setVisibility(View.GONE);
                px15.setVisibility(View.GONE);



            }
        });


        p12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.GONE);
                px2.setVisibility(View.GONE);
                px3.setVisibility(View.GONE);
                px4.setVisibility(View.GONE);
                px5.setVisibility(View.GONE);
                px6.setVisibility(View.GONE);
                px7.setVisibility(View.GONE);
                px8.setVisibility(View.GONE);
                px9.setVisibility(View.GONE);
                px10.setVisibility(View.GONE);
                px11.setVisibility(View.GONE);
                px12.setVisibility(View.VISIBLE);
                px13.setVisibility(View.GONE);
                px14.setVisibility(View.GONE);
                px15.setVisibility(View.GONE);



            }
        });



        p13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.GONE);
                px2.setVisibility(View.GONE);
                px3.setVisibility(View.GONE);
                px4.setVisibility(View.GONE);
                px5.setVisibility(View.GONE);
                px6.setVisibility(View.GONE);
                px7.setVisibility(View.GONE);
                px8.setVisibility(View.GONE);
                px9.setVisibility(View.GONE);
                px10.setVisibility(View.GONE);
                px11.setVisibility(View.GONE);
                px12.setVisibility(View.GONE);
                px13.setVisibility(View.VISIBLE);
                px14.setVisibility(View.GONE);
                px15.setVisibility(View.GONE);



            }
        });


        p14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.GONE);
                px2.setVisibility(View.GONE);
                px3.setVisibility(View.GONE);
                px4.setVisibility(View.GONE);
                px5.setVisibility(View.GONE);
                px6.setVisibility(View.GONE);
                px7.setVisibility(View.GONE);
                px8.setVisibility(View.GONE);
                px9.setVisibility(View.GONE);
                px10.setVisibility(View.GONE);
                px11.setVisibility(View.GONE);
                px12.setVisibility(View.GONE);
                px13.setVisibility(View.GONE);
                px14.setVisibility(View.VISIBLE);
                px15.setVisibility(View.GONE);



            }
        });


        p15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                px1.setVisibility(View.GONE);
                px2.setVisibility(View.GONE);
                px3.setVisibility(View.GONE);
                px4.setVisibility(View.GONE);
                px5.setVisibility(View.GONE);
                px6.setVisibility(View.GONE);
                px7.setVisibility(View.GONE);
                px8.setVisibility(View.GONE);
                px9.setVisibility(View.GONE);
                px10.setVisibility(View.GONE);
                px11.setVisibility(View.GONE);
                px12.setVisibility(View.GONE);
                px13.setVisibility(View.GONE);
                px14.setVisibility(View.GONE);
                px15.setVisibility(View.VISIBLE);



            }
        });


        return rootView;
    }
}