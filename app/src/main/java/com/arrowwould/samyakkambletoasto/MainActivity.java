package com.arrowwould.samyakkambletoasto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.arrowwould.samyak_kamble_toastor.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.simpleToast(this, "Mr_Samyakkamble ");
    }
}