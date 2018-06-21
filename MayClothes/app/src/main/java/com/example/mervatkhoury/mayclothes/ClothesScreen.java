package com.example.mervatkhoury.mayclothes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.mervatkhoury.mayclothes.MainActivity.name;
import static com.example.mervatkhoury.mayclothes.MainActivity.country;

public class ClothesScreen extends AppCompatActivity {

    TextView cName;

    String clientName,clientCountry;

    public static String itemsN,price;
    private static int this_itemsN,this_price;

    ImageView add1,add2,add3,add4,add5,add6,add7,cart;
    ImageView delete1,delete2,delete3,delete4,delete5,delete6,delete7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes_screen);

        clientName=name;
        clientCountry=country;

        TextView cName = (TextView) findViewById(R.id.userN);
        TextView cCountry = (TextView) findViewById(R.id.userCC);

        cName.setText(clientName.toString());
        cCountry.setText(clientCountry.toString());

        this_itemsN=0;
        this_price=0;

        //=====Add to cart=======================================
        add1 = (ImageView) findViewById(R.id.buy1);
        add2 = (ImageView) findViewById(R.id.buy2);
        add3 = (ImageView) findViewById(R.id.buy3);
        add4 = (ImageView) findViewById(R.id.buy4);
        add5 = (ImageView) findViewById(R.id.buy5);
        add6 = (ImageView) findViewById(R.id.buy6);
        add7 = (ImageView) findViewById(R.id.buy7);

        delete1 = (ImageView) findViewById(R.id.d1);
        delete2 = (ImageView) findViewById(R.id.d2);
        delete3 = (ImageView) findViewById(R.id.d3);
        delete4 = (ImageView) findViewById(R.id.d4);
        delete5 = (ImageView) findViewById(R.id.d5);
        delete6 = (ImageView) findViewById(R.id.d6);
        delete7 = (ImageView) findViewById(R.id.d7);

        cart = (ImageView) findViewById(R.id.buy);

        //=======================================================
        addListenerOnButton();

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String itemsN = extras.getString("itemsN");
            String price = extras.getString("price");
        }

        delete1.setVisibility(View.GONE);
        delete2.setVisibility(View.GONE);
        delete3.setVisibility(View.GONE);
        delete4.setVisibility(View.GONE);
        delete5.setVisibility(View.GONE);
        delete6.setVisibility(View.GONE);
        delete7.setVisibility(View.GONE);

    }

    public void addListenerOnButton() {

        //Add Buttons --------------------------------------
        add1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
            this_itemsN = this_itemsN+1;
            this_price = this_price + 50;
            add1.setVisibility(View.GONE);
            delete1.setVisibility(View.VISIBLE);

            }

        });

        add2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                this_itemsN = this_itemsN+1;
                this_price = this_price + 85;
                add2.setVisibility(View.GONE);
                delete2.setVisibility(View.VISIBLE);
            }

        });

        add3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                this_itemsN = this_itemsN+1;
                this_price = this_price + 100;
                add3.setVisibility(View.GONE);
                delete3.setVisibility(View.VISIBLE);
            }

        });

        add4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                this_itemsN = this_itemsN+1;
                this_price = this_price + 75;
                add4.setVisibility(View.GONE);
                delete4.setVisibility(View.VISIBLE);
            }

        });

        add5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                this_itemsN = this_itemsN+1;
                this_price = this_price + 60;
                add5.setVisibility(View.GONE);
                delete5.setVisibility(View.VISIBLE);
            }

        });

        add6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                this_itemsN = this_itemsN+1;
                this_price = this_price + 90;
                add6.setVisibility(View.GONE);
                delete6.setVisibility(View.VISIBLE);
            }

        });

        add7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                this_itemsN = this_itemsN+1;
                this_price = this_price + 70;
                add7.setVisibility(View.GONE);
                delete7.setVisibility(View.VISIBLE);
            }

        });

        //Delete Buttons --------------------------------------------
        delete1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                this_itemsN = this_itemsN-1;
                this_price = this_price -50;
                delete1.setVisibility(View.GONE);
                add1.setVisibility(View.VISIBLE);
            }

        });

        delete2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                this_itemsN = this_itemsN-1;
                this_price = this_price -85;
                delete2.setVisibility(View.GONE);
                add2.setVisibility(View.VISIBLE);
            }

        });

        delete3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                this_itemsN = this_itemsN-1;
                this_price = this_price -100;
                delete3.setVisibility(View.GONE);
                add3.setVisibility(View.VISIBLE);
            }

        });

        delete4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                this_itemsN = this_itemsN-1;
                this_price = this_price -75;
                delete4.setVisibility(View.GONE);
                add4.setVisibility(View.VISIBLE);
            }

        });

        delete5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                this_itemsN = this_itemsN-1;
                this_price = this_price -60;
                delete5.setVisibility(View.GONE);
                add5.setVisibility(View.VISIBLE);
            }

        });

        delete6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                this_itemsN = this_itemsN-1;
                this_price = this_price - 90;
                delete6.setVisibility(View.GONE);
                add6.setVisibility(View.VISIBLE);
            }

        });

        delete7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                this_itemsN = this_itemsN-1;
                this_price = this_price - 70;
                delete7.setVisibility(View.GONE);
                add7.setVisibility(View.VISIBLE);
            }

        });

        //-------------------------------------------------------
        cart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                itemsN = String.valueOf(this_itemsN);
                price = String.valueOf(this_price);
                Intent i = new Intent(getApplicationContext(),com.example.mervatkhoury.mayclothes.CartScreen.class);
                startActivity(i);
            }

        });

    }

}
