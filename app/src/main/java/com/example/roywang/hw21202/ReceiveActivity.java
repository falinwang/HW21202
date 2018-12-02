package com.example.roywang.hw21202;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class ReceiveActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
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
                Intent checkActivityintent = new Intent(ReceiveActivity.this, Main2Activity.class);
                startActivity(checkActivityintent);
                return true;
            case R.id.check_activity_menu_item:
                Intent addActivityintent = new Intent(ReceiveActivity.this, CheckActivity.class);
                startActivity(addActivityintent);
                return true;
            case R.id.add_activity_menu_item:
                return true;
            case R.id.logout_activity_menu_item:
                return false;
            default:
                return false;
        }

    }
}