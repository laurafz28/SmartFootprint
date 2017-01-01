package com.example.laura.smartfootprint;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Exit Button
        final Button boton_salida = (Button)findViewById(R.id.exit_button);
        boton_salida.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.Option1:
                Intent i = new Intent(this, temperature.class);
                startActivity(i);
                return true;

            case R.id.Option2:
                Intent i2 = new Intent(this, pressure.class);
                startActivity(i2);
                return true;

            case R.id.Option3:
                //Intent i3 = new Intent(this, gps.class);
                //startActivity(i3);
                return true;

            case R.id.Option4:
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                intent4.setData(Uri.parse("https://es.linkedin.com/in/laurafrancozaldivar"));
                startActivity(intent4);
                return true;

            case R.id.Option5:
                Intent i5 = new Intent(this, DeviceListActivity.class);
                startActivity(i5);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

}