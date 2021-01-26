package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddOns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ons);

        final Button btnAddon = (Button) findViewById(R.id.btnAddon);

        //        Add an event handler for the btnAddon
        View.OnClickListener btnAddonListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              Create an intent to launch Delivery Activity
                Intent CheckoutActivity = new Intent(AddOns.this, CheckoutActivity.class);

                startActivity(CheckoutActivity);
            }
        };
//        Set the btnAddonListener as the event handler for
        btnAddon.setOnClickListener(btnAddonListener);
    }
}