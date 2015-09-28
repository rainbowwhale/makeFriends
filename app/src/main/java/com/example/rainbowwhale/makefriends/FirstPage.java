package com.example.rainbowwhale.makefriends;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.util.Log;

public class FirstPage extends Activity implements View.OnClickListener {

    Button BT_START;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        BT_START = (Button)findViewById(R.id.button_start);
        BT_START.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        // TODO Auto-generated method stub
        if(v.getId()==R.id.button_start){
            Intent intent1 = new Intent(this, SelectGender.class);
            this.startActivity(intent1);
            Log.d("startbutton", "bt");

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}