package com.example.pdm_labo2_00229017_e2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private GridLayout grid;
    private ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = findViewById(R.id.grid);

        i1 = findViewById(R.id.i1_id);
        i2 = findViewById(R.id.i2_id);
        i3 = findViewById(R.id.i3_id);
        i4 = findViewById(R.id.i4_id);
        i5 = findViewById(R.id.i5_id);
        i6 = findViewById(R.id.i6_id);
        i7 = findViewById(R.id.i7_id);
        i8 = findViewById(R.id.i8_id);
        i9 = findViewById(R.id.i9_id);

        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        i3.setOnClickListener(this);
        i4.setOnClickListener(this);
        i5.setOnClickListener(this);
        i6.setOnClickListener(this);
        i7.setOnClickListener(this);
        i8.setOnClickListener(this);
        i9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewID=v.getId();
        Log.i("id",viewID+"");

        switch (viewID) {
            case R.id.i1_id:
                i1.setImageResource(R.drawable.kisspng_logo_business_brand_publishing_android_marshmallow_5b1e0c3d655af9);
                break;
            case R.id.i2_id:
                i2.setImageResource(R.drawable.android_2_3_gingerbread_logo);
                break;
            case R.id.i3_id:
                i3.setImageResource(R.drawable.Android_Kitkat);
                break;
            case R.id.i4_id:
                i4.setImageResource(R.drawable.CB3DA6374);
                break;
            case R.id.i5_id:
                i5.setImageResource(R.drawable.contador);
                break;
            case R.id.i6_id:
                i6.setImageResource(R.drawable.Cover_678x452);
                break;
            case R.id.i7_id:
                i7.setImageResource(R.drawable.descarga);
                break;
            case R.id.i8_id:
                i8.setImageResource(R.drawable.ic_launcher_background);
                break;
            case R.id.i9_id:
                i9.setImageResource(R.drawable.ic_launcher_foreground);
                break;
            default:
                break;
        }
    }
}
