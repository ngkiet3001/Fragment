package com.example.test_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity_ThongTin extends AppCompatActivity {


    ImageView img;
    TextView txtTen;
    TextView txtTuoi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__thong_tin);
        img=findViewById(R.id.imgHinh);
        txtTen=findViewById(R.id.txtTen);
        txtTuoi=findViewById(R.id.txtTuoi);

        Bundle iten=getIntent().getExtras();
        img.setImageResource(iten.getInt("hinh"));
        txtTen.setText(iten.getString("ten"));
        txtTuoi.setText(iten.getInt("tuoi")+"");
    }
}
