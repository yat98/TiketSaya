package com.chandra.hidayat.tiketsaya.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Ads implements Parcelable {
    String image;

    public Ads() {
    }

    public Ads(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.image);
    }

    protected Ads(Parcel in) {
        this.image = in.readString();
    }

    public static final Parcelable.Creator<Ads> CREATOR = new Parcelable.Creator<Ads>() {
        @Override
        public Ads createFromParcel(Parcel source) {
            return new Ads(source);
        }

        @Override
        public Ads[] newArray(int size) {
            return new Ads[size];
        }
    };
}
