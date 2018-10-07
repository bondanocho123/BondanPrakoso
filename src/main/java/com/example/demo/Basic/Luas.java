package com.example.demo.Basic;

public class Luas {
    private  Integer panjang;
     private Integer lebar;


    public Luas(Integer intPanjang, Integer intLebar)
    {
        this.panjang = intPanjang;
        this.lebar = intLebar;
    }

    public Luas()
    {

    }

    public void setPanjang(Integer panjang)
    {
        this.panjang = panjang;
    }
    public void setLebar(Integer lebar)
    {
        this.lebar = lebar;
    }

    public Integer getPanjang() {
        return panjang;
    }

    public Integer getLebar() {
        return lebar;
    }

    public Integer hitungLuas()
    {
        Integer luas = panjang   * lebar;

        return luas;
    }
}
