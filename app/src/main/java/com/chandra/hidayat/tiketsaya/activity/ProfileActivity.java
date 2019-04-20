package com.chandra.hidayat.tiketsaya.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.chandra.hidayat.tiketsaya.R;
import com.chandra.hidayat.tiketsaya.adapter.ItemClickSupport;
import com.chandra.hidayat.tiketsaya.adapter.TicketBuyAdapter;
import com.chandra.hidayat.tiketsaya.model.Ticket;
import com.chandra.hidayat.tiketsaya.model.TicketData;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {
    private RecyclerView rvTicketBuy;
    private TicketBuyAdapter ticketBuyAdapter;
    private ArrayList<Ticket> tickets;
    private ImageView ivBack;
    private Button btnEditProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        rvTicketBuy = findViewById(R.id.rv_ticket_buy);
        ivBack = findViewById(R.id.iv_back);
        btnEditProfile = findViewById(R.id.btn_edit_profile);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEditProfile = new Intent(ProfileActivity.this,ProfileEditActivity.class);
                startActivity(intentEditProfile);
            }
        });

        showList();
    }

    private void showList() {
        tickets = new ArrayList<>();
        tickets.addAll(TicketData.getTicketData());
        ticketBuyAdapter = new TicketBuyAdapter(this);
        rvTicketBuy.setLayoutManager(new LinearLayoutManager(this));
        rvTicketBuy.setHasFixedSize(true);
        ticketBuyAdapter.setTickets(tickets);
        rvTicketBuy.setAdapter(ticketBuyAdapter);
        ItemClickSupport.addTo(rvTicketBuy).setOnItemCLickListener(new ItemClickSupport.OnItemCLickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showDetailTicketIntent(tickets.get(position));
            }
        });
    }

    private void showDetailTicketIntent(Ticket ticket) {
        Ticket t = new Ticket();
        Intent intentDetailTicket = new Intent(ProfileActivity.this, DetailTicketBuyActivity.class);
        t.setCity(ticket.getCity());
        t.setDate(ticket.getDate());
        t.setTime(ticket.getTime());
        t.setTicketSum(ticket.getTicketSum());
        t.setDestination(ticket.getDestination());
        t.setInformation(ticket.getInformation());
        intentDetailTicket.putExtra(DetailTicketBuyActivity.EXTRA_TICKET, t);
        startActivity(intentDetailTicket);
    }
}
