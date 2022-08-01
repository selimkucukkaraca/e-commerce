package services;

import entity.Adverts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class BuyServiceImpl implements BuyService{


    @Override
    public List<Adverts> buy(Adverts adverts) {
        Adverts adverts1 = new Adverts(UUID.randomUUID().toString(),new Date(),"Araba","2. El",124235);

        System.out.println("ilandaki urun satin alindi : ");
        return null;  // burda sorun oldu
    }
}
