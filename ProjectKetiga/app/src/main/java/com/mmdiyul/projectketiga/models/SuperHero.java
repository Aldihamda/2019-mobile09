package com.mmdiyul.projectketiga.models;

import android.graphics.drawable.Drawable;

public class SuperHero {
    private String nama;
    private Drawable gambar;

    public SuperHero(String nama, Drawable gambar) {
        this.nama = nama;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Drawable getGambar() {
        return gambar;
    }

    public void setGambar(Drawable gambar) {
        this.gambar = gambar;
    }
}
