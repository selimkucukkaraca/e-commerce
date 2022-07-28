package Services;

import Entity.Adverts;

public interface AdvertService {

    void delete (int id);
    Adverts update(Adverts adverts);
}
