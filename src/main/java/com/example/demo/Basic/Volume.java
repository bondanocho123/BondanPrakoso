package com.example.demo.Basic;

public class Volume extends Luas{
    private Integer tinggi;


    public Volume(Integer intPanjang, Integer intLebar, Integer intTinggi)
    {
        super(intPanjang,intLebar);
        this.tinggi= intTinggi;
    }

    public Volume(){}

    public Integer getTinggi() {
        return tinggi;
    }

    public void setTinggi(Integer tinggi) {
        this.tinggi = tinggi;
    }



    public Integer hitungvolume()
    {
        Integer luas = hitungLuas() * tinggi;
        return luas;
    }
}
