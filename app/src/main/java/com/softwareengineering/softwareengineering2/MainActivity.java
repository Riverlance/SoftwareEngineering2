package com.softwareengineering.softwareengineering2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButtonLayout1(View view) {
        startActivity(new Intent(this, Layout1Activity.class));
    }

    public void onClickButtonLayout2(View view) {
        startActivity(new Intent(this, Layout2Activity.class));
    }

    public void onClickButtonLayout3(View view) {
        startActivity(new Intent(this, Layout3Activity.class));
    }
}
