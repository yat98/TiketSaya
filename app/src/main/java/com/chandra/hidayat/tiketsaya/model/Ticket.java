package com.chandra.hidayat.tiketsaya.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Ticket implements Parcelable {
    private String destination, city, ticketSum, date, time, information;

    public Ticket() {
    }

    public Ticket(String destination, String city, String ticketSum, String date, String time, String information) {
        this.destination = destination;
        this.city = city;
        this.ticketSum = ticketSum;
        this.date = date;
        this.time = time;
        this.information = information;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTicketSum() {
        return ticketSum;
    }

    public void setTicketSum(String ticketSum) {
        this.ticketSum = ticketSum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.destination);
        dest.writeString(this.city);
        dest.writeString(this.ticketSum);
        dest.writeString(this.date);
        dest.writeString(this.time);
        dest.writeString(this.information);
    }

    protected Ticket(Parcel in) {
        this.destination = in.readString();
        this.city = in.readString();
        this.ticketSum = in.readString();
        this.date = in.readString();
        this.time = in.readString();
        this.information = in.readString();
    }

    public static final Creator<Ticket> CREATOR = new Creator<Ticket>() {
        @Override
        public Ticket createFromParcel(Parcel source) {
            return new Ticket(source);
        }

        @Override
        public Ticket[] newArray(int size) {
            return new Ticket[size];
        }
    };
}
