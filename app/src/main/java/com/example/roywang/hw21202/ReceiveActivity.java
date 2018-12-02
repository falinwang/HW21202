package com.example.roywang.hw21202;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ReceiveActivity extends Activity implements View.OnClickListener {

    Button buttonReceive2Home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        buttonReceive2Home = findViewById(R.id.buttonReceive2Home);
        buttonReceive2Home.setOnClickListener(this);

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
                Intent homeActivityintent = new Intent(this, Main2Activity.class);
                startActivity(homeActivityintent);
                return true;

            case R.id.check_activity_menu_item:
                Intent checkActivityintent = new Intent(this, CheckActivity.class);
                startActivity(checkActivityintent);
                return true;

            case R.id.add_activity_menu_item:
                return true;

            case R.id.logout_activity_menu_item:
                Intent loginActivityintent = new Intent(this, MainActivity.class);
                startActivity(loginActivityintent);
                return true;

            default:
                return false;
        }

    }

    @Override
    public void onClick(View view) {
        if (view == buttonReceive2Home) {
            Intent intent2home = new Intent(this, Main2Activity.class);
            startActivity(intent2home);
        }
    }

    // TODO add actually function
}


// Don't know why it crashes twice.