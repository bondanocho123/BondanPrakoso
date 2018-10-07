package com.example.demo.model;



import java.math.BigDecimal;

public class Mobil {
    String nama;
    Integer jumlah;
    Double harga;


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public Mobil(String namaAwal, String namaAkhir)
    {
        System.out.println("Nama Saya : " + namaAwal + " " + namaAkhir);
    }

        public Mobil(String szNamaMobil, Integer intJumlah, BigDecimal decHarga)
        {
            System.out.print(szNamaMobil + "," + intJumlah + "," + decHarga);
        }



}
