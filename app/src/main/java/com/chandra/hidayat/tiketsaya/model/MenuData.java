package com.chandra.hidayat.tiketsaya.model;

import android.util.Log;

import java.util.ArrayList;

public class MenuData {

    public static final String TAG = "MenuData";
    private static String[][] menuData = new String[][]{
            {"ic_pisa","Pisa"},
            {"ic_torri","Torri"},
            {"ic_pagoda","Pagoda"},
            {"ic_borobudur","Candi"},
            {"ic_sphinx","Sphinx"},
            {"ic_monas","Monas"},
    };

    public static ArrayList<Menu> getMenuData(){
        ArrayList<Menu> listMenu = new ArrayList<>();
        for (String[] data:menuData){
            Menu menu = new Menu();
            menu.setImage(data[0]);
            menu.setTitle(data[1]);
            listMenu.add(menu);
        }
        return listMenu;
    }
}
