package com.example.geseni_pc.examen1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class CineAdventista extends AppCompatActivity implements View.OnClickListener{

    CheckBox click1;
    CheckBox click2;
    CheckBox click3;
    CheckBox clck4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cine_adventista);

        CheckBox click1 = (CheckBox) findViewById(R.id.click1);
        click1.setOnClickListener(this);

        CheckBox click2 = (CheckBox) findViewById(R.id.click2);
        click2.setOnClickListener(this);


        CheckBox click3 = (CheckBox) findViewById(R.id.click3);
        click3.setOnClickListener(this);

        CheckBox click4 = (CheckBox) findViewById(R.id.click4);
        click4.setOnClickListener(this);

        findViewById(R.id.click1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CineAdventista.this, Pelicula1.class));
            }
        });
        findViewById(R.id.click2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CineAdventista.this, Pelicula2.class));
            }
        });
        findViewById(R.id.click3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CineAdventista.this, Pelicula3.class));
            }
        });
        findViewById(R.id.click4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CineAdventista.this, Pelicula4.class));
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cine_adventista, menu);
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

    @Override
    public void onClick(View view) {
        Intent clic1=new Intent(CineAdventista.this,Pelicula1.class);
        startActivity(clic1);

        Intent click2=new Intent(CineAdventista.this,Pelicula2.class);
        startActivity(click2);

        Intent click3=new Intent(CineAdventista.this, Pelicula3.class);
        startActivity(click3);

        Intent click4=new Intent(CineAdventista.this,Pelicula4.class);
        startActivity(click4);




    }
}
