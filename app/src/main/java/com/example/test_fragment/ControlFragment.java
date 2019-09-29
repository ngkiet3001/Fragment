package com.example.test_fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ControlFragment extends Fragment {
    ArrayList<SinhVien> listSV;
    ListView listViewSV;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_list,container,false);
        listViewSV=view.findViewById(R.id.listSV);
        listSV=new ArrayList<>();

        listSV.add(new SinhVien(R.drawable.icon,"Kiet",19));
        listSV.add(new SinhVien(R.drawable.icon,"Huy",20));
        listSV.add(new SinhVien(R.drawable.icon,"Viet",21));
        listSV.add(new SinhVien(R.drawable.icon,"Hoang",22));
        listSV.add(new SinhVien(R.drawable.icon,"Hieu",23));

        listViewSV.setAdapter(new CustomAdapter(getActivity(),R.layout.custom_list_item,listSV));
        listViewSV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE)
                        {
                            SinhVien a=listSV.get(i);
                            ControlFragmentItem controlFragmentItem = (ControlFragmentItem)getFragmentManager().findFragmentById(R.id.fragment2);
                            controlFragmentItem.txtTen.setText(a.getTen());
                            controlFragmentItem.txtTuoi.setText(a.getTuoi());
                            controlFragmentItem.img.setImageResource(a.getHinh());


                        }else {
                            SinhVien a=listSV.get(i);
                            Bundle bundle=new Bundle();
                            bundle.putString("ten",a.getTen());
                            bundle.putInt("tuoi",a.getTuoi());
                            bundle.putInt("hinh",a.getHinh());

                            Intent intent=new Intent(getActivity(),MainActivity_ThongTin.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }

            }
        });
        return view;
    }
}
