package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.icu.text.TimeZoneFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class PickupActivity extends AppCompatActivity {

    private TextView resTextView;
    private static final Calendar cal = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup);

////        get UI component references
//        resTextView = (TextView)findViewById(R.id.resTextView);
//        Button btnDate = (Button)findViewById(R.id.btnDate);
//
////        set up listener for the btnDate button
//        btnDate.setOnClickListener(btnDateListener);
//
//    }//end onCreate method
//
//    //    set listener for user chooosing a date
//    DatePickerDialog.OnDateSetListener dateListener = new DatePickerDialog.OnDateSetListener() {
//        @Override
//        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//            cal.set(Calendar.YEAR,year);
//            cal.set(Calendar.MONTH,monthOfYear);
//            cal.set(Calendar.DAY_OF_MONTH,dayOfMonth);
//
////        get the selected date from the calender and show it to user
//            Date reservedDate = cal.getTime();
//            resTextView.setText("Your reservation is set for "+fmtDate.format(reservedDate));
//        }// end onDateSet handler
//    };
//    //    set listener for btnDate
//    Button.OnClickListener btnDateListener = new Button.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
////        get the currently selected date from the Calender
////        show the default date if none selected
//            int year = cal.get(Calendar.YEAR);
//            int monthOfYear = cal.get(Calendar.MONTH);
//            int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
//
////        create/show DatePickerDialogue with the currently selected date(or today)
//            DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,dateListener,year,monthOfYear,dayOfMonth);
//            datePickerDialog.show();
//        }// end OnClick handler
//    };
    }
}