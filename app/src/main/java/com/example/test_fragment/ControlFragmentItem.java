package com.example.test_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ControlFragmentItem extends Fragment {

    ImageView img;
    TextView txtTen,txtTuoi;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_list,container,false);

         img=view.findViewById(R.id.imgHinh);
         txtTen=view.findViewById(R.id.txtTen);
         txtTuoi=view.findViewById(R.id.txtTuoi);


        return view;
    }
}
