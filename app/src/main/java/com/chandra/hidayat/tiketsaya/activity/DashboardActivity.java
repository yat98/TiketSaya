package com.chandra.hidayat.tiketsaya.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.chandra.hidayat.tiketsaya.R;
import com.chandra.hidayat.tiketsaya.adapter.GridMenusAdapter;
import com.chandra.hidayat.tiketsaya.model.Menu;
import com.chandra.hidayat.tiketsaya.model.MenuData;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {
    public static final String TAG ="DashboardActivity";
    private RecyclerView rvMenu;
    private ArrayList<Menu> listMenu;
    private GridMenusAdapter gridMenusAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        rvMenu = findViewById(R.id.rv_menu);
        listMenu = new ArrayList<>();
        gridMenusAdapter = new GridMenusAdapter(this);
        showGrid();
    }

    private void showGrid(){
        rvMenu.setLayoutManager(new GridLayoutManager(this,3));
        rvMenu.setHasFixedSize(true);
        listMenu.addAll(MenuData.getMenuData());
        gridMenusAdapter.setListMenu(listMenu);
        rvMenu.setAdapter(gridMenusAdapter);
        for (Menu m :listMenu){
            Log.e(TAG,m.getImage()+" "+m.getTitle());
        }
    }
}
