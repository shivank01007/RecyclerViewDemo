package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> arrContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContact.add(new ContactModel(R.drawable.ic_baseline_person_24,"ABCD","9296875901"));
        arrContact.add(new ContactModel(R.drawable.ic_baseline_person_24,"ABCD","9296875901"));
        arrContact.add(new ContactModel(R.drawable.ic_baseline_person_24,"ABCD","9296875901"));
        arrContact.add(new ContactModel(R.drawable.ic_baseline_person_24,"ABCD","9296875901"));
        arrContact.add(new ContactModel(R.drawable.ic_baseline_person_24,"ABCD","9296875901"));
        arrContact.add(new ContactModel(R.drawable.ic_baseline_person_24,"ABCD","9296875901"));
        arrContact.add(new ContactModel(R.drawable.ic_baseline_person_24,"ABCD","9296875901"));
        arrContact.add(new ContactModel(R.drawable.ic_baseline_person_24,"ABCD","9296875901"));
        arrContact.add(new ContactModel(R.drawable.ic_baseline_person_24,"ABCD","9296875901"));
        arrContact.add(new ContactModel(R.drawable.ic_baseline_person_24,"ABCD","9296875901"));
        arrContact.add(new ContactModel(R.drawable.ic_baseline_person_24,"ABCD","9296875901"));
        arrContact.add(new ContactModel(R.drawable.ic_baseline_person_24,"ABCD","9296875901"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContact);

        recyclerView.setAdapter(adapter);

    }
}