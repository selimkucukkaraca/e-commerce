package control;

import entity.Adverts;
import entity.Categories;
import entity.Seller;
import entity.User;
import services.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {



        UserServiceImpl userService = new UserServiceImpl();

        User user = new User();
        user.setId(1);
        user.setFirstName("selim");
        user.setLastName("karaca");
        user.setAge(22);
        user.setCreateDate(new Date());

        System.out.println(userService.add(user));




        SellerServiceImpl sellerService = new SellerServiceImpl();

        Seller seller = new Seller();

        seller.setId(2);
        seller.setFirstName("baris");
        seller.setLastName("seckin");
        seller.setSince(new Date());

        System.out.println(sellerService.add(seller));




        CategoryServiceImpl categoryService = new CategoryServiceImpl();

        Categories categories = new Categories(3,"Arac");

        categories.setId(4);
        categories.setName("Araba");

        System.out.println(categoryService.update(categories));





        AdvertServiceImpl advertService = new AdvertServiceImpl();

        Adverts adverts = new Adverts();

        adverts.setId("45");
        adverts.setBody("Sifir");
        adverts.setTitle("Kiralik");
        adverts.setPrice(23554);
        adverts.setCreateAdvertDate(new Date());

        System.out.println(advertService.add(adverts));


    }
}
