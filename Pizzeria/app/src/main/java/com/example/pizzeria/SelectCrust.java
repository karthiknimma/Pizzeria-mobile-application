package com.example.pizzeria;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class SelectCrust extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_crust);

        // convert the string array " CrustTypes" to list

//        List<String> Crusts =
//                Arrays.asList(getResources().getStringArray(R.array.CrustTypes));
//
//        //inflate the gui with gadgets list
//        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_select_crust,R.id.crustList,Crusts));

        final Button btnCrust = (Button)findViewById(R.id.btnCrust);

        //        Add an event handler for the btnCrust
        View.OnClickListener btnCrustListener =  new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              Create an intent to launch Delivery Activity
                Intent addOn = new Intent(SelectCrust.this,AddOns.class);

                startActivity(addOn);
            }
        };
//        Set the btnCrustListener as the event handler for btnCrust
        btnCrust.setOnClickListener(btnCrustListener);
    }

}