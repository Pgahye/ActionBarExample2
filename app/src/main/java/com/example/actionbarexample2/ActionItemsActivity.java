package com.example.actionbarexample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ActionItemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_action_items );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add("Save").setIcon(android.R.drawable.ic_menu_add).
                setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);


        menu.add("Search").setIcon(android.R.drawable.ic_menu_search).
                setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

        menu.add("Resfresh").setIcon(android.R.drawable.ic_popup_sync).
                setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);


        return true;
    }
}
