package com.practicum.ft_teknoloji.repository;

import com.practicum.ft_teknoloji.entity.Kullanici;
import com.practicum.ft_teknoloji.entity.Urun;
import com.practicum.ft_teknoloji.entity.UrunYorum;
import org.springframework.beans.NullValueInNestedPathException;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UrunRepository {

    List<UrunYorum> urunList = new ArrayList<UrunYorum>();
    public List<String > getAllYorumByUrunId(Urun Id)
    {


     var result = urunList.stream().filter(z->z.getUrunId()==Id).toList();

     if(result.isEmpty()){

        return  new ArrayList<String>();
     }

   var yorum =  result.stream().map(x->x.getYorum()).toList();

     if(yorum.isEmpty()){
         return  new ArrayList<String>();
     }
       return yorum;



    }
    public List<String > getAllYorumByKullaniciId(Kullanici Id){
        var result = urunList.stream().filter(z->z.getKullaniciId()==Id).toList();

        if(result.isEmpty()){

            return  new ArrayList<String>();
        }

        var yorum =  result.stream().map(x->x.getYorum()).toList();

        if(yorum.isEmpty()){
            return  new ArrayList<String>();
        }
        return yorum;

    }

    public List<String > getAllYorumByDateWithUrunId(Date start, Date end,Urun urunId){


      var urunyorumList =  urunList
              .stream()
              .filter(z->z.getUrunId()==urunId)
              .filter(z->z.getYorumTarihi().getTime()>=start.getTime() && z.getYorumTarihi().getTime()<=end.getTime())
              .toList();

        var yorum =  urunyorumList.stream().map(x->x.getYorum()).toList();

        if(yorum.isEmpty()){
            return  new ArrayList<String>();
        }
        return yorum;

    }
    public List<String > getAllYorumByDateWithKullaniciId(Date start, Date end,Kullanici kullaniciId)
    {



        var urunyorumList =  urunList
                .stream()
                .filter(z->z.getKullaniciId()==kullaniciId)
                .filter(z->z.getYorumTarihi().getTime()>=start.getTime() && z.getYorumTarihi().getTime()<=end.getTime())
                .toList();

        var yorum =  urunyorumList.stream().map(x->x.getYorum()).toList();

        if(yorum.isEmpty()){
            return  new ArrayList<String>();
        }
        return yorum;

    }
    public List<Urun > getAllSonKullanmaTarihiGecmisUrunler()
    {


  List<Urun> list = new ArrayList<Urun>();
        var urunsList =  list.stream()
                .filter(z->z.getSonKullanmaTarihi().getTime()<new Date().getTime()).toList();

 if(urunsList.isEmpty()){
     return  new ArrayList<Urun>();
 }
        return urunsList;

    }
    public List<Urun > getAllSonKullanmaTarihiGecmemisUrunler()
    {


        List<Urun> list = new ArrayList<Urun>();
        var urunsList =  list.stream()
                .filter(z->z.getSonKullanmaTarihi().getTime()>new Date().getTime() || z.getSonKullanmaTarihi() ==null ).toList();

        if(urunsList.isEmpty()){
            return  new ArrayList<Urun>();
        }
        return urunsList;

    }

}
