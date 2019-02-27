package com.example.tugasrecyclerview;

public class Mahasiswa {
    private String merk;
    private String type;


    public Mahasiswa(String merk, String type) {
        this.merk = merk;
        this.type = type;

    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
