package com.chandra.hidayat.tiketsaya.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.chandra.hidayat.tiketsaya.R;
import com.chandra.hidayat.tiketsaya.model.Ticket;

public class DetailTicketBuyActivity extends AppCompatActivity {
    public static final String EXTRA_TICKET = "extra_ticket";
    private TextView tvLocation, tvDestination, tvSumTicketBuy, tvDate, tvTime, tvInformation;
    private ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ticket_buy);
        tvDate = findViewById(R.id.tv_date);
        tvLocation = findViewById(R.id.tv_location);
        tvDestination = findViewById(R.id.tv_destination);
        tvSumTicketBuy = findViewById(R.id.tv_sum_ticket_buy);
        tvTime = findViewById(R.id.tv_time);
        tvInformation = findViewById(R.id.tv_information);
        btnBack = findViewById(R.id.btn_back);

        Ticket ticket = getIntent().getParcelableExtra(EXTRA_TICKET);
        tvDate.setText(ticket.getDate());
        tvDestination.setText(ticket.getDestination());
        tvLocation.setText(ticket.getCity());
        tvSumTicketBuy.setText(ticket.getTicketSum());
        tvTime.setText(ticket.getTime());
        tvInformation.setText(ticket.getInformation());
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
