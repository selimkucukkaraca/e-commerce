package Services;

import Entity.User;

public class UserServiceImpl implements UserService{


    @Override
    public User add(User user) {
        User newUser = new User();

        newUser.setId(user.getId());
        newUser.setAge(user.getAge());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setCreateDate(user.getCreateDate());

        return newUser;

    }

    @Override
    public void delete(int id) {
        System.out.println( id + " id'li kullanici silindi...");
    }


    @Override
    public User update(User user) {
        User updateUser = new User();

        updateUser.setId(user.getId());
        updateUser.setAge(user.getAge());
        updateUser.setFirstName(user.getFirstName());
        updateUser.setLastName(user.getLastName());

        return updateUser;

    }
}
