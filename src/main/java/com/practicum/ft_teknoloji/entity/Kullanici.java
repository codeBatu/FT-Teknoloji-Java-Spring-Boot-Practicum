package com.practicum.ft_teknoloji.entity;


import javax.validation.constraints.Max;

public class Kullanici {

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getAdi() {
        return Adi;
    }

    public void setAdi(String adi) {
        Adi = adi;
    }

    public String getSoyadi() {
        return Soyadi;
    }

    public void setSoyadi(String soyadi) {
        Soyadi = soyadi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefon() {
        return Telefon;
    }

    public void setTelefon(String telefon) {
        Telefon = telefon;
    }

    private Integer Id;



 @Max(50)
    private String Adi;

    @Max(50)
    private  String Soyadi;

    @Max(50)
    private  String Email;

    @Max(15)
    private  String Telefon;

}
