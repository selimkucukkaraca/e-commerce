package entity;

import services.AdvertService;
import services.CategoryService;
import services.SellerService;
import services.UserService;

import java.util.Date;


public abstract class Buy implements AdvertService{

    private Date buyDate;

    public Buy(Date buyDate) {
        this.buyDate = buyDate;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public abstract void buy();

}


