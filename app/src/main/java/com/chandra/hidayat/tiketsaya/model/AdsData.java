package com.chandra.hidayat.tiketsaya.model;

import java.util.ArrayList;

public class AdsData {

    public static final String TAG = "AdsData";
    private static String[] adsData = new String[]{
            "ic_ads_paris",
            "ic_ads_pisa",
            "ic_ads_paris",
            "ic_ads_pisa",
            "ic_ads_paris",
            "ic_ads_pisa",
    };

    public static ArrayList<Ads> getAdsData() {
        ArrayList<Ads> listAds = new ArrayList<>();
        for (String data : adsData) {
            Ads ads = new Ads();
            ads.setImage(data);
            listAds.add(ads);
        }
        return listAds;
    }
}
