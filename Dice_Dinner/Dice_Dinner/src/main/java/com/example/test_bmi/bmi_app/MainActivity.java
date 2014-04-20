package com.example.test_bmi.bmi_app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void toast(View view ){
        int id = view.getId();
        if( id == R.id.button ){
            Toast.makeText( this, "U only have 蝦仁番茄炒飯 to choose.", Toast.LENGTH_LONG ).show();
        }
        else if( id == R.id.button2 ){
            Toast.makeText( this, "U only have 紅燒雞肉麵 to choose.", Toast.LENGTH_LONG ).show();
        }
        else if( id == R.id.button3 ){
            Toast.makeText( this, "U only have 吳記水餃 to choose.", Toast.LENGTH_LONG ).show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
