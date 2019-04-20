package com.chandra.hidayat.tiketsaya.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chandra.hidayat.tiketsaya.R;

public class ItemClickSupport {
    private RecyclerView recyclerView;
    private OnItemCLickListener onItemCLickListener;
    private OnItemLongCLickListener onItemLongCLickListener;

    private ItemClickSupport(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
        recyclerView.setTag(R.id.item_click_support, this);
        recyclerView.addOnChildAttachStateChangeListener(mAttachListener);
    }

    public void setOnItemCLickListener(OnItemCLickListener onItemCLickListener) {
        this.onItemCLickListener = onItemCLickListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.onLongClickListener = onLongClickListener;
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerView.ViewHolder holder = recyclerView.getChildViewHolder(v);
            onItemCLickListener.onItemClicked(recyclerView, holder.getAdapterPosition(), v);
        }
    };

    private View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            if (onItemLongCLickListener != null) {
                RecyclerView.ViewHolder holder = recyclerView.getChildViewHolder(v);
                onItemLongCLickListener.onItemClicked(recyclerView, holder.getAdapterPosition(), v);
                return true;
            }
            return false;
        }
    };

    private RecyclerView.OnChildAttachStateChangeListener mAttachListener = new RecyclerView.OnChildAttachStateChangeListener() {
        @Override
        public void onChildViewAttachedToWindow(@NonNull View view) {
            view.setOnClickListener(onClickListener);
        }

        @Override
        public void onChildViewDetachedFromWindow(@NonNull View view) {
            view.setOnLongClickListener(onLongClickListener);
        }
    };

    public static ItemClickSupport addTo(RecyclerView view) {
        ItemClickSupport itemClickSupport = (ItemClickSupport) view.getTag(R.id.item_click_support);
        if (itemClickSupport == null) {
            itemClickSupport = new ItemClickSupport(view);
        }
        return itemClickSupport;
    }

    public static ItemClickSupport removeFrom(RecyclerView view) {
        ItemClickSupport itemClickSupport = (ItemClickSupport) view.getTag(R.id.item_click_support);
        if (itemClickSupport == null) {
            itemClickSupport = new ItemClickSupport(view);
        }
        return itemClickSupport;
    }

    private void deatach(RecyclerView view) {
        view.removeOnChildAttachStateChangeListener(mAttachListener);
        view.setTag(R.id.item_click_support, null);
    }

    public interface OnItemCLickListener {
        void onItemClicked(RecyclerView recyclerView, int position, View v);
    }

    public interface OnItemLongCLickListener {
        void onItemClicked(RecyclerView recyclerView, int position, View v);
    }
}
