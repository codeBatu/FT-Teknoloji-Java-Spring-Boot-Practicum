package com.practicum.ft_teknoloji.entity;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.Date;

public class Urun {

    private Integer Id;

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

    public BigDecimal getSoyadi() {
        return Soyadi;
    }

    public void setSoyadi(BigDecimal soyadi) {
        Soyadi = soyadi;
    }

    public Date getSonKullanmaTarihi() {
        return SonKullanmaTarihi;
    }

    public void setSonKullanmaTarihi(Date sonKullanmaTarihi) {
        SonKullanmaTarihi = sonKullanmaTarihi;
    }

    private String Adi;

    private BigDecimal Soyadi;

    private Date SonKullanmaTarihi;

}
