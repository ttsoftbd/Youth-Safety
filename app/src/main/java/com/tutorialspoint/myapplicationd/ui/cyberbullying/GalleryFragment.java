package com.tutorialspoint.myapplicationd.ui.cyberbullying;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.tutorialspoint.myapplicationd.Child_MarrigeActivity;
import com.tutorialspoint.myapplicationd.R;
import com.tutorialspoint.myapplicationd.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);

        ImageView cy1 = (ImageView) rootView.findViewById(R.id.cy1);
        ImageView cy2 = (ImageView) rootView.findViewById(R.id.cy2);
        ImageView cy3 = (ImageView) rootView.findViewById(R.id.cy3);
        ImageView cy4 = (ImageView) rootView.findViewById(R.id.cy4);
        ImageView cy5 = (ImageView) rootView.findViewById(R.id.cy5);
        ImageView cy6 = (ImageView) rootView.findViewById(R.id.cy6);
        ImageView cy7 = (ImageView) rootView.findViewById(R.id.cy7);

        TextView tx1 = (TextView) rootView.findViewById(R.id.tx1);
        TextView tx2 = (TextView) rootView.findViewById(R.id.tx2);
        TextView tx3 = (TextView) rootView.findViewById(R.id.tx3);
        TextView tx4 = (TextView) rootView.findViewById(R.id.tx4);
        TextView tx5 = (TextView) rootView.findViewById(R.id.tx5);
        TextView tx6 = (TextView) rootView.findViewById(R.id.tx6);
        TextView tx7 = (TextView) rootView.findViewById(R.id.tx7);






        cy1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tx1.setVisibility(View.VISIBLE);
                tx2.setVisibility(View.GONE);
                tx3.setVisibility(View.GONE);
                tx4.setVisibility(View.GONE);
                tx5.setVisibility(View.GONE);
                tx6.setVisibility(View.GONE);
                tx7.setVisibility(View.GONE);
            }
        });




        cy2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tx1.setVisibility(View.GONE);
                tx2.setVisibility(View.VISIBLE);
                tx3.setVisibility(View.GONE);
                tx4.setVisibility(View.GONE);
                tx5.setVisibility(View.GONE);
                tx6.setVisibility(View.GONE);
                tx7.setVisibility(View.GONE);
            }
        });






        cy3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tx1.setVisibility(View.GONE);
                tx2.setVisibility(View.GONE);
                tx3.setVisibility(View.VISIBLE);
                tx4.setVisibility(View.GONE);
                tx5.setVisibility(View.GONE);
                tx6.setVisibility(View.GONE);
                tx7.setVisibility(View.GONE);
            }
        });






        cy4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tx1.setVisibility(View.GONE);
                tx2.setVisibility(View.GONE);
                tx3.setVisibility(View.GONE);
                tx4.setVisibility(View.VISIBLE);
                tx5.setVisibility(View.GONE);
                tx6.setVisibility(View.GONE);
                tx7.setVisibility(View.GONE);
            }
        });






        cy5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tx1.setVisibility(View.GONE);
                tx2.setVisibility(View.GONE);
                tx3.setVisibility(View.GONE);
                tx4.setVisibility(View.GONE);
                tx5.setVisibility(View.VISIBLE);
                tx6.setVisibility(View.GONE);
                tx7.setVisibility(View.GONE);
            }
        });





        cy6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tx1.setVisibility(View.GONE);
                tx2.setVisibility(View.GONE);
                tx3.setVisibility(View.GONE);
                tx4.setVisibility(View.GONE);
                tx5.setVisibility(View.GONE);
                tx6.setVisibility(View.VISIBLE);
                tx7.setVisibility(View.GONE);
            }
        });






        cy7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tx1.setVisibility(View.GONE);
                tx2.setVisibility(View.GONE);
                tx3.setVisibility(View.GONE);
                tx4.setVisibility(View.GONE);
                tx5.setVisibility(View.GONE);
                tx6.setVisibility(View.GONE);
                tx7.setVisibility(View.VISIBLE);
            }
        });

















        return rootView;
    }
}