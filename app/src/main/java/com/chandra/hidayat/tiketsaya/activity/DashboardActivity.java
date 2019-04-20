package com.chandra.hidayat.tiketsaya.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;

import com.chandra.hidayat.tiketsaya.R;
import com.chandra.hidayat.tiketsaya.adapter.AdsAdapter;
import com.chandra.hidayat.tiketsaya.adapter.GridMenusAdapter;
import com.chandra.hidayat.tiketsaya.adapter.ItemClickSupport;
import com.chandra.hidayat.tiketsaya.model.Ads;
import com.chandra.hidayat.tiketsaya.model.AdsData;
import com.chandra.hidayat.tiketsaya.model.Menu;
import com.chandra.hidayat.tiketsaya.model.MenuData;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {
    public static final String TAG = "DashboardActivity";
    private RecyclerView rvMenu, rvAds;
    private ArrayList<Menu> listMenu;
    private ArrayList<Ads> listAds;
    private GridMenusAdapter gridMenusAdapter;
    private AdsAdapter adsAdapter;
    private FrameLayout flProfileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        rvMenu = findViewById(R.id.rv_menu);
        rvAds = findViewById(R.id.rv_ads);
        flProfileImage = findViewById(R.id.fl_profile_image);
        flProfileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProfile = new Intent(DashboardActivity.this, ProfileActivity.class);
                startActivity(intentProfile);
            }
        });
        showGrid();
        showList();
    }

    private void showGrid() {
        rvMenu.setLayoutManager(new GridLayoutManager(this, 3));
        rvMenu.setHasFixedSize(true);
        listMenu = new ArrayList<>();
        gridMenusAdapter = new GridMenusAdapter(this);
        listMenu.addAll(MenuData.getMenuData());
        gridMenusAdapter.setListMenu(listMenu);
        rvMenu.setAdapter(gridMenusAdapter);
        ItemClickSupport.addTo(rvMenu).setOnItemCLickListener(new ItemClickSupport.OnItemCLickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showDetailIntent();
            }
        });
    }

    private void showList() {
        rvAds.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvAds.setHasFixedSize(true);
        listAds = new ArrayList<>();
        adsAdapter = new AdsAdapter(this);
        listAds.addAll(AdsData.getAdsData());
        adsAdapter.setListAds(listAds);
        rvAds.setAdapter(adsAdapter);
    }

    private void showDetailIntent() {
        Intent intentDetail = new Intent(DashboardActivity.this, DetailActivity.class);
        startActivity(intentDetail);
    }
}
