package Services;

import Entity.User;

public class UserServiceImpl implements UserService {


    @Override
    public User add(User user) {
        User newUser = new User();

        if (user.getAge() > 18) {
            newUser.setAge(user.getAge());

            newUser.setFirstName(user.getFirstName());
            newUser.setLastName(user.getLastName());
            newUser.setCreateDate(user.getCreateDate());
            newUser.setId(user.getId());
        } else {
            return null;
        }

        return newUser;

    }

    @Override
    public void delete(int id) {
        System.out.println(id + " id'li kullanici silindi...");
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
