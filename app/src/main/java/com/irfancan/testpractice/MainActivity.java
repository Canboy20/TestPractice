package com.irfancan.testpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        stopThis();

        //WHOA. A ROBOT JUST INVADED THIS AREA >O_O<
        //GET HIM OUT OF HERE

    }



    private void stopThis(){

        //Comment added
        //Descriptive

        Log.v("TEST VERBO","STOP TEST!");
        Log.e("TEST ERROR","ERROR TEST!");
    }


}
