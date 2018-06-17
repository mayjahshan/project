package com.example.mervatkhoury.mayclothes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ClothesScreen extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes_screen);

        for(int i=1;i<1;i++){
            String l= getString(i);
            int imgID = getResources().getIdentifier(l, "id", getPackageName());
            img = (ImageView)findViewById(imgID);
        }
    }

}
