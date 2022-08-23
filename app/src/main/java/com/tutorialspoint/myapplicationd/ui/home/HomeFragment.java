package com.tutorialspoint.myapplicationd.ui.home;

import android.content.Intent;
import android.net.Uri;
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
import com.tutorialspoint.myapplicationd.Cyber_BullyingActivity;
import com.tutorialspoint.myapplicationd.DipressionActivity;
import com.tutorialspoint.myapplicationd.DomesticActivity;
import com.tutorialspoint.myapplicationd.Eve_TeasingActivity;
import com.tutorialspoint.myapplicationd.HackingActivity;
import com.tutorialspoint.myapplicationd.PlagiarismActivity;
import com.tutorialspoint.myapplicationd.R;
import com.tutorialspoint.myapplicationd.SafeActivity;
import com.tutorialspoint.myapplicationd.WebActivity;
import com.tutorialspoint.myapplicationd.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private ImageView ImageView;
    String[] urls = new String[2];

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);


        ImageView btnopen = (ImageView) rootView.findViewById(R.id.btnopen);
        ImageView eveteasingbtn = (ImageView) rootView.findViewById(R.id.eveteasingbtn);
        ImageView Cyber = (ImageView) rootView.findViewById(R.id.Cyber);
        ImageView DomesticBtn = (ImageView) rootView.findViewById(R.id.DomesticBtn);
        ImageView HackingBtn = (ImageView) rootView.findViewById(R.id.HackingBtn);
        ImageView PlagiarismBtn = (ImageView) rootView.findViewById(R.id.PlagiarismBtn);
        ImageView DipretionBtn = (ImageView) rootView.findViewById(R.id.DipretionBtn);
        ImageView SafeBtn = (ImageView) rootView.findViewById(R.id.SafeBtn);
        ImageView ImageView = (ImageView) rootView.findViewById(R.id.ImageView);
        urls[0] = "https://youthsafetybangladesh.blogspot.com/";


        ImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), WebActivity.class);
                intent.putExtra("links",urls[0]);
                getActivity().startActivity(intent);
            }
        });



        btnopen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), Child_MarrigeActivity.class);
                getActivity().startActivity(intent);
            }
        });


        eveteasingbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), Eve_TeasingActivity.class);
                getActivity().startActivity(intent);
            }
        });


        Cyber.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), Cyber_BullyingActivity.class);
                getActivity().startActivity(intent);
            }
        });


        DomesticBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), DomesticActivity.class);
                getActivity().startActivity(intent);
            }
        });



        HackingBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), HackingActivity.class);
                getActivity().startActivity(intent);
            }
        });



        PlagiarismBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), PlagiarismActivity.class);
                getActivity().startActivity(intent);
            }
        });



        DipretionBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), DipressionActivity.class);
                getActivity().startActivity(intent);
            }
        });




        SafeBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), SafeActivity.class);
                getActivity().startActivity(intent);
            }
        });






        return rootView;

    }
}

