package control;
import entity.*;
import services.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("***************************************");

        UserServiceImpl userService = new UserServiceImpl();
        User user = new User();
        user.setId(1);
        user.setFirstName("selim");
        user.setLastName("karaca");
        user.setAge(22);
        user.setCreateDate(new Date());
        System.out.println(userService.update(user));

        System.out.println("***************************************");

        SellerServiceImpl sellerService = new SellerServiceImpl();
        Seller seller = new Seller();
        seller.setId(2);
        seller.setFirstName("baris");
        seller.setLastName("seckin");
        seller.setSince(new Date());
        System.out.println(sellerService.add(seller));
        System.out.println("***************************************");

        CategoryServiceImpl categoryService = new CategoryServiceImpl();
        Categories categories = new Categories();
        categories.setId(4);
        categories.setName("Araba");
        System.out.println(categoryService.update(categories));

        System.out.println("***************************************");

        AdvertServiceImpl advertService = new AdvertServiceImpl();
        Adverts adverts = new Adverts();
        adverts.setId("45");
        adverts.setBody("Sifir");
        adverts.setTitle("Kiralik");
        adverts.setPrice(23554);
        adverts.setCreateAdvertDate(new Date());
        System.out.println(advertService.add(adverts));

        System.out.println("***************************************");

        BuyServiceImpl buyService = new BuyServiceImpl();
        buyService.buy(new Adverts());
        System.out.println(buyService.buy(adverts));


        System.out.println("***************************************");


        // buy da sorun cikti

    }
}
