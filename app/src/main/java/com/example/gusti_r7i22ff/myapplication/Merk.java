package com.example.gusti_r7i22ff.myapplication;

/**
 * Created by gusti_r7i22ff on 25/02/2018.
 */

public class Merk {
    String merkMinuman, detailMinuman, komposisiMinuman;
    int image;

    public String getNamaMinuman() {
        return merkMinuman;
    }

    public void setNamaMinuman(String namaMinuman) {
        this.merkMinuman = namaMinuman;
    }

    public String getDetailMinuman() {
        return detailMinuman;
    }

    public void setDetailMinuman(String detailMinuman) {
        this.detailMinuman = detailMinuman;
    }

    public String getKomposisiMinuman() {
        return komposisiMinuman;
    }

    public void setKomposisiMinuman(String komposisiMinuman) {
        this.komposisiMinuman = komposisiMinuman;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Merk(int image, String merkMinuman, String detailMinuman, String komposisiMinuman){
        this.merkMinuman = merkMinuman;
        this.detailMinuman = detailMinuman;
        this.komposisiMinuman = komposisiMinuman;
        this.image = image;
    }
}

