package com.example.roywang.hw21202;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CheckActivity extends Activity implements View.OnClickListener {

    Button buttonBackC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        buttonBackC = findViewById(R.id.buttonBackC);
        buttonBackC.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater optionsMenuInflater = getMenuInflater();
        optionsMenuInflater.inflate(R.menu.dropdown_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.home_activity_menu_item:
                Intent homeActivityintent = new Intent(CheckActivity.this, Main2Activity.class);
                startActivity(homeActivityintent);
                return true;
            case R.id.check_activity_menu_item:
                return true;
            case R.id.add_activity_menu_item:
                Intent addActivityintent = new Intent(CheckActivity.this, ReceiveActivity.class);
                startActivity(addActivityintent);
                return true;
            case R.id.logout_activity_menu_item:
                Intent loginActivityintent = new Intent(CheckActivity.this, MainActivity.class);
                startActivity(loginActivityintent);
                return true;
            default:
                return false;
        }

    }

    @Override
    public void onClick(View view) {
        if (view == buttonBackC) {
            Intent intentCheckBackHome = new Intent(CheckActivity.this, Main2Activity.class);
            startActivity(intentCheckBackHome);
        }
    }

    // TODO add actually function
}
