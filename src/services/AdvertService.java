package services;

import entity.Adverts;

import java.util.List;

public interface AdvertService {

    void delete (int id);
    Adverts update(Adverts adverts);
    List<Adverts> add(Adverts adverts);

    List<Adverts> findAll();
}
