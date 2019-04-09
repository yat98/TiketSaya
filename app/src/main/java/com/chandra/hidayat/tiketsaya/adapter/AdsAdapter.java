package com.chandra.hidayat.tiketsaya.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.chandra.hidayat.tiketsaya.R;
import com.chandra.hidayat.tiketsaya.model.Ads;

import java.util.ArrayList;

public class AdsAdapter extends RecyclerView.Adapter<AdsAdapter.AdsViewHolder> {
    private Context context;
    private ArrayList<Ads> listAds = new ArrayList<>();

    public AdsAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Ads> getListAds() {
        return listAds;
    }

    public void setListAds(ArrayList<Ads> listAds) {
        this.listAds.addAll(listAds);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_ads,viewGroup,false);
        return new AdsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdsViewHolder adsViewHolder, int i) {
        Ads image = getListAds().get(i);
        adsViewHolder.ivAdsImage.setImageResource(getImageResource(image.getImage()));
    }

    @Override
    public int getItemCount() {
        return listAds.size();
    }

    public class AdsViewHolder extends RecyclerView.ViewHolder {
        ImageView ivAdsImage;
        public AdsViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAdsImage = itemView.findViewById(R.id.iv_ads_image);
        }
    }

    private int getImageResource(String image) {
        int drawableId = context.getResources().getIdentifier(image, "drawable", context.getPackageName());
        return drawableId;
    }
}
