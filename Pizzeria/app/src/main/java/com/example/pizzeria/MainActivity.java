package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnDelivery = (Button)findViewById(R.id.btnDelivery);

        //        Add an event handler for the btnDelivery
        View.OnClickListener btnDeliveryListener =  new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              Create an intent to launch Delivery Activity
                Intent deliveryActivity = new Intent(MainActivity.this,DeliveryActivity.class);

                startActivity(deliveryActivity);
            }
        };
//        Set the btnDeliveryListener as the event handler for btnDelivery
        btnDelivery.setOnClickListener(btnDeliveryListener);

        final Button btnPickup = (Button)findViewById(R.id.btnPickup);

        //        Add an event handler for the btnPickup
        View.OnClickListener btnPickupListener =  new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              Create an intent to launch Pickup Activity
                Intent PickupAddress = new Intent(MainActivity.this,PickupActivity.class);

                startActivity(PickupAddress);
            }
        };
//        Set the btnPickupListener as the event handler for btnPickup
        btnPickup.setOnClickListener(btnPickupListener);
    }
}