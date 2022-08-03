package services;

import entity.Adverts;

import java.util.*;

public class BuyServiceImpl implements BuyService{


    @Override
    public List<Adverts> buy(Adverts adverts) {
        Adverts adverts1 = new Adverts(UUID.randomUUID().toString(),new Date(),"Araba","2. El",124235);

        System.out.println("ilandaki urun satin alindi : " + adverts1.getId());
        System.out.println(adverts1.getTitle() + " isimli urun satin alindi");
        return Arrays.asList(adverts1);  // burda sorun oldu
    }
}
