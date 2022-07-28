package Services;

import Entity.Adverts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class AdvertServiceImpl implements AdvertService {

    @Override
    public void delete(int id) {
        System.out.println(id + "id'li ilan silindi.");
    }

    @Override
    public Adverts update(Adverts adverts) {

        Adverts updatedAdverts = new Adverts();

        if (adverts.getPrice() > 0){
            updatedAdverts.setPrice(adverts.getPrice());
            updatedAdverts.setTitle(adverts.getTitle());
            updatedAdverts.setCreateAdvertDate(new Date());
            updatedAdverts.setBody(adverts.getBody());
            updatedAdverts.setId(adverts.getId());

        }
        return updatedAdverts;
    }

    @Override
    public List<Adverts> add(Adverts adverts) {
        List<Adverts> listAdverts = new ArrayList<>();

        if (adverts.getPrice() > 0){
            listAdverts.add(adverts);
        }

        return listAdverts;
    }

    @Override
    public List<Adverts> findAll(){
        Adverts adverts1 = new Adverts(UUID.randomUUID().toString(),new Date(),"Araba","2. El",124235);
        Adverts adverts2 = new Adverts(UUID.randomUUID().toString(),new Date(),"Telefon","IOS",12423);
        Adverts adverts3 = new Adverts(UUID.randomUUID().toString(),new Date(),"Mobilya","2. El",1242);

        ArrayList<Adverts> adverts = new ArrayList<>();

        adverts.add(adverts1);
        adverts.add(adverts2);
        adverts.add(adverts3);


        return adverts;
    }
}
