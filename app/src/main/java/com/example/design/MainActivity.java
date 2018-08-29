package com.example.design;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;
  //  ActionBar toolbar;
    List<UserData> userData=new ArrayList<>();
    RecyclerView recyclerView;
    UserAdapter userAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.DemoRecycler);
        recyclerView.setHasFixedSize(true);

        //toolbar=getSupportActionBar();

        //toolbar.setTitle("Shop");
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        bottomNavigationView=findViewById(R.id.bottom);
        //bottomNavigationView.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener)this);

        for(int i=0;i<10;i++){
         if(i%2==0){

             UserData userData1=new UserData("Jennifer","UI/UX Designer","Experience 2+ year","Chandigarh,INDIA");
             userData.add(userData1);

         }else{
              UserData userData1=new UserData("Shaman","UI/UX Designer","Experience 3+ year","Chandigarh,INDIA");
             userData.add(userData1);

         }
        }
        userAdapter=new UserAdapter(userData,this);
        recyclerView.setAdapter(userAdapter);
    }
}
