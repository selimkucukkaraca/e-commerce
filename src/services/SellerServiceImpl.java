package services;

import entity.Seller;

import java.util.Date;

public class SellerServiceImpl implements SellerService{

    @Override
    public Seller add(Seller seller) {
        Seller newSeller = new Seller();

        newSeller.setId(seller.getId());
        newSeller.setFirstName(seller.getFirstName());
        newSeller.setLastName(seller.getLastName());
        newSeller.setSince(new Date());

        System.out.println(newSeller.getId() + " id'li satici eklendi.");
        return newSeller;
    }

    @Override
    public void delete(int id) {
        System.out.println(id + " id'li satici silindi...");

    }

    @Override
    public void sell(int id) {
        System.out.println(id + " id'li satici urunu satti.");

    }

    @Override
    public Seller update(Seller seller) {
        Seller updateSeller = new Seller();


        updateSeller.setId(seller.getId());
        updateSeller.setLastName(seller.getLastName());
        updateSeller.setFirstName(seller.getFirstName());

        System.out.println(updateSeller.getId() + " id'li satici guncellendi");
        return updateSeller;
    }
}
