package com.chandra.hidayat.tiketsaya.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.chandra.hidayat.tiketsaya.R;
import com.chandra.hidayat.tiketsaya.model.Ticket;

import java.util.ArrayList;

public class TicketBuyAdapter extends RecyclerView.Adapter<TicketBuyAdapter.TicketBuyViewHolder> {
    private Context context;
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public TicketBuyAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    @NonNull
    @Override
    public TicketBuyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_ticket_buy, viewGroup, false);
        return new TicketBuyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TicketBuyViewHolder ticketBuyViewHolder, int i) {
        Ticket ticket = getTickets().get(i);
        ticketBuyViewHolder.tvDestination.setText(ticket.getDestination());
        ticketBuyViewHolder.tvLocation.setText(ticket.getCity());
        ticketBuyViewHolder.tvSumTicketBuy.setText(ticket.getTicketSum());
    }

    @Override
    public int getItemCount() {
        return tickets.size();
    }

    public class TicketBuyViewHolder extends RecyclerView.ViewHolder {
        ImageView ivTicketBuy;
        TextView tvDestination, tvLocation, tvSumTicketBuy;

        public TicketBuyViewHolder(@NonNull View itemView) {
            super(itemView);
            ivTicketBuy = itemView.findViewById(R.id.iv_ticket_buy);
            tvDestination = itemView.findViewById(R.id.tv_destination);
            tvLocation = itemView.findViewById(R.id.tv_location);
            tvSumTicketBuy = itemView.findViewById(R.id.tv_sum_ticket_buy);
        }
    }
}
