package com.example.roywang.hw21202;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends Activity implements View.OnClickListener{

    Button buttonInventoryCheck, buttonInventoryAdd, buttonLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
                return true;
            case R.id.check_activity_menu_item:
                Intent checkActivityintent = new Intent(Main2Activity.this, CheckActivity.class);
                startActivity(checkActivityintent);
                return true;
            case R.id.add_activity_menu_item:
                Intent addActivityintent = new Intent(Main2Activity.this, ReceiveActivity.class);
                startActivity(addActivityintent);
                return true;
            case R.id.logout_activity_menu_item:
                return false;
            default:
                return false;
        }

    }

    @Override
    public void onClick(View v) {
        if(v == buttonInventoryCheck) {
            // If click "Check Inventory on Home Page"
            Intent intentH2Check = new Intent(this, CheckActivity.class);
            startActivity(intentH2Check);

        } else if(v == buttonInventoryAdd) {
            // If click "Add Inventory on Home Page"
            Intent intentH2Add = new Intent(this, ReceiveActivity.class);
            startActivity(intentH2Add);
        }
    }
}
