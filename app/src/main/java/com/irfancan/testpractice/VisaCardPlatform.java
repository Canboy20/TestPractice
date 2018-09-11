package com.irfancan.testpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class VisaCardPlatform extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visa_card_layout);


        getMyVisaCard();


    }


    private void getMyVisaCard() {
        Log.v("TEST","VISA CARD RECEIVED");
    }


}
