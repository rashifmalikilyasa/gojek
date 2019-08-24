package com.example.gojekmi;

import android.os.Parcel;
import android.os.Parcelable;

public class Pesanan implements Parcelable {

    private String nama;
    private String alamat;
    private String makanan;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.alamat);
        dest.writeString(this.makanan);
    }

    public Pesanan() {
    }

    protected Pesanan(Parcel in) {
        this.nama = in.readString();
        this.alamat = in.readString();
        this.makanan = in.readString();
    }

    public static final Parcelable.Creator<Pesanan> CREATOR = new Parcelable.Creator<Pesanan>() {
        @Override
        public Pesanan createFromParcel(Parcel source) {
            return new Pesanan(source);
        }

        @Override
        public Pesanan[] newArray(int size) {
            return new Pesanan[size];
        }
    };
}
