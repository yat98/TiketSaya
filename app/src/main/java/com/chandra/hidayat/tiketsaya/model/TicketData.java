package com.chandra.hidayat.tiketsaya.model;

import java.util.ArrayList;

public class TicketData {
    private static String[][] ticketData = new String[][]{
            {"Pisa Tower", "Pisa, Italy", "3 Tickets","Januari, 28, 2018","10AM to 12PM","Anak yang berumur lebih dari 3 tahun wajib membeli tiket untuk masuk kedalam landmark"},
            {"Pagoda", "Shanghai, China", "2 Tickets","Februari, 29, 2018","08AM to 10PM","Menggunakan body hand karena panas"},
            {"Sphinx", "Pyramid, Mecca", "5 Tickets","Maret, 30, 2018","07AM to 8PM","Membawa payung sendiri"},
    };

    public static ArrayList<Ticket> getTicketData() {
        ArrayList<Ticket> tickets = new ArrayList<>();
        for (String[] data : ticketData) {
            Ticket ticket = new Ticket();
            ticket.setDestination(data[0]);
            ticket.setCity(data[1]);
            ticket.setTicketSum(data[2]);
            ticket.setDate(data[3]);
            ticket.setTime(data[4]);
            ticket.setInformation(data[5]);
            tickets.add(ticket);
        }
        return tickets;
    }
}
