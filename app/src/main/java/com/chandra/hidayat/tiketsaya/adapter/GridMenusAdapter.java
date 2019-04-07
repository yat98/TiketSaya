package com.chandra.hidayat.tiketsaya.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chandra.hidayat.tiketsaya.R;
import com.chandra.hidayat.tiketsaya.model.Menu;

import java.util.ArrayList;

public class GridMenusAdapter extends RecyclerView.Adapter<GridMenusAdapter.GridMenusViewHolder> {
    private Context context;
    private ArrayList<Menu> listMenu = new ArrayList<>();

    public GridMenusAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Menu> getListMenu() {
        return listMenu;
    }

    public void setListMenu(ArrayList<Menu> listMenu) {
        this.listMenu.addAll(listMenu);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public GridMenusAdapter.GridMenusViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_menus_grid, viewGroup, false);
        return new GridMenusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridMenusAdapter.GridMenusViewHolder gridMenusViewHolder, int i) {
        Menu menu = getListMenu().get(i);
        gridMenusViewHolder.tvMenuText.setText(menu.getTitle());
        gridMenusViewHolder.ivMenuIcon.setImageResource(getImageResource(menu.getImage()));
    }

    @Override
    public int getItemCount() {
        return listMenu.size();
    }

    public class GridMenusViewHolder extends RecyclerView.ViewHolder {
        ImageView ivMenuIcon;
        TextView tvMenuText;

        public GridMenusViewHolder(@NonNull View itemView) {
            super(itemView);
            ivMenuIcon = itemView.findViewById(R.id.iv_menu_icon);
            tvMenuText = itemView.findViewById(R.id.tv_menu_text);
        }
    }

    private int getImageResource(String image) {
        int drawableId = context.getResources().getIdentifier(image, "drawable", context.getPackageName());
        return drawableId;
    }
}
