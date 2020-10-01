package com.example.mireciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    RecyclerView MiRecycler;
    String nombre[], fund[];
    int imagenes [] = {R.drawable.cobreloa,  R.drawable.colocolo,  R.drawable.ohiggins,  R.drawable.uchile, R.drawable.nublense};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MiRecycler = (RecyclerView) findViewById(R.id.MIRecicler);
        nombre = getResources().getStringArray(R.array.equipos);
        fund = getResources().getStringArray(R.array.anios);

        MiAdapter MA = new MiAdapter(this, this.nombre, this.fund, this.imagenes);
        MiRecycler.setAdapter(MA);
        MiRecycler.setLayoutManager(new LinearLayoutManager(this));

    }
}