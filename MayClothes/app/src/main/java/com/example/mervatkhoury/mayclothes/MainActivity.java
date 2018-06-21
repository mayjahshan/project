package com.example.mervatkhoury.mayclothes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ok;

    public static String name;
    public static String country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = (ImageView) findViewById(R.id.ok);
        addListenerOnButton();

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            String country = extras.getString("country");
        }
    }

    public void addListenerOnButton() {

        ok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                name= ((EditText)findViewById(R.id.input1)).getText().toString();
                country= ((EditText)findViewById(R.id.input3)).getText().toString();
                String town=((EditText)findViewById(R.id.input2)).getText().toString();
                if(name.isEmpty()||country.isEmpty()||town.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter your details!",Toast.LENGTH_LONG).show();
                }else{
                    Intent i = new Intent(getApplicationContext(),com.example.mervatkhoury.mayclothes.ClothesScreen.class);
                    startActivity(i);
                }


            }

        });

    }

}
