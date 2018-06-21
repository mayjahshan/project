package com.example.mervatkhoury.mayclothes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.mervatkhoury.mayclothes.ClothesScreen.itemsN;
import static com.example.mervatkhoury.mayclothes.ClothesScreen.price;

public class CartScreen extends AppCompatActivity {

    ImageView done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_screen);

       TextView it = findViewById(R.id.cartItems);
       TextView p = findViewById(R.id.cartPrice);
       done = findViewById(R.id.ok2);
        it.setText(itemsN);
        p.setText(price);

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        done.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String phone= ((EditText)findViewById(R.id.phoneN)).getText().toString();
                if(phone.isEmpty()){
                    Toast.makeText(CartScreen.this,"Please enter phone number",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(CartScreen.this,"Thanks! We'll contact you soon...",Toast.LENGTH_LONG).show();
                }

            }

        });

    }
}
