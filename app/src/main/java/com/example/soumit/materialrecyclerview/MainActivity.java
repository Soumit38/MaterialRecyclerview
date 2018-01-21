package com.example.soumit.materialrecyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;
    Context context;

    String name[] = {
            "User1",
            "User2",
            "User3",
            "User4",
            "User5",
            "User6",
            "User7",
            "User8",
            "User9",
            "User10",
            "User11"
    };

    String desc[] = {
            "Description1",
            "Description2",
            "Description3",
            "Description4",
            "Description5",
            "Description6",
            "Description7",
            "Description8",
            "Description9",
            "Description10",
            "Description11"
    };

    int image[] = {
            R.drawable.headphone,
            R.drawable.keyboard,
            R.drawable.printer,
            R.drawable.projector,
            R.drawable.q,
            R.drawable.robi,
            R.drawable.router,
            R.drawable.tab,
            R.drawable.tablet,
            R.drawable.watch,
            R.drawable.webcam
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_id);

        List<User> sampleUsers = new ArrayList<>();

        for(int i=0; i<name.length; i++){
            User user = new User();

            user.username = name[i];
            user.userdesc = desc[i];
            user.userimage = image[i];

            sampleUsers.add(user);
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        /**
         *  For Gridview remove LinearLayoutManager and add GridLayoutManager as below
         */
/*

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
*/

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerAdapter(getBaseContext() , sampleUsers));



    }
}
