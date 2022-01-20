package com.example.ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class RestrauntHome extends AppCompatActivity {

    private Button addDish;
    private DatabaseReference ref_menus;
    private ListView menu;
    private ArrayList<DataSnapshot> all_needed_data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restraunt_home);
        addDish=findViewById(R.id.AddDish);
        ref_menus = FirebaseDatabase.getInstance().getReference("Menus");
        menu = findViewById(R.id.activeOrders_rest_listView);
        addDish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RestrauntHome.this, Menu.class);
                startActivity(i);
            }
        });
    }
}