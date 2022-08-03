package services;

import entity.User;

public interface UserService {

    User add(User user);
    void delete(int id);
    User update(User user);


}
