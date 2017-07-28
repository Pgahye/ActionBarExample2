package com.example.actionbarexample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class ActionModesActivity extends AppCompatActivity {

    private ActionMode actionMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_action_modes);

        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               actionMode=startActionMode(new ActionModeCallback());
            }
        });

        findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                actionMode.finish();

            }
        });

    }

    private class ActionModeCallback implements ActionMode.Callback{


        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {

            menu.add(Menu.NONE, 0,0, "save").setIcon(android.R.drawable.ic_menu_add).
                    setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);


            menu.add(Menu.NONE, 1,1, "Search").setIcon(android.R.drawable.ic_menu_search).
                    setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

            menu.add(Menu.NONE, 2,2, "Resfresh").setIcon(android.R.drawable.ic_popup_sync).
                    setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {

            Toast.makeText(getApplication(), item.getItemId() + "selected", Toast.LENGTH_LONG).show();
            return true;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {

        }
    }
}
