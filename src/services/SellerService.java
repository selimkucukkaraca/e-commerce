package services;

import entity.Seller;

public interface SellerService {
    Seller add (Seller seller);
    void delete(int id);
    void sell(int id);
    Seller update(Seller seller);
}
