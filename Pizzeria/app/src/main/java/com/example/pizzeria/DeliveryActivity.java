package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeliveryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);

        final Button btnDeliveryAddress = (Button)findViewById(R.id.btnDeliveryAddress);

        //        Add an event handler for the btnDeliveryAddress
        View.OnClickListener btnDeliveryAddressListener =  new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              Create an intent to launch Select Crust Activity
                Intent deliveryAddress = new Intent(DeliveryActivity.this,SelectCrust.class);

                startActivity(deliveryAddress);
            }
        };
//        Set the btnDeliveryAddressListener as the event handler for btnDeliveryAddress
        btnDeliveryAddress.setOnClickListener(btnDeliveryAddressListener);
    }
}