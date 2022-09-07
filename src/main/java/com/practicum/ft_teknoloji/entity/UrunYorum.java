package com.practicum.ft_teknoloji.entity;

import javax.validation.constraints.Max;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class UrunYorum {

    private  Integer Id;
    @Max(500)
    private String Yorum;

    private java.util.Date yorumTarihi ;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getYorum() {
        return Yorum;
    }

    public void setYorum(String yorum) {
        Yorum = yorum;
    }

    public java.util.Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(java.util.Date  yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

    public Urun getUrunId() {
        return urunId;
    }

    public void setUrunId(Urun urunId) {
        this.urunId = urunId;
    }

    public Kullanici getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Kullanici kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    private  Urun urunId;
    private  Kullanici kullaniciId;
}
