package model.service;

import model.data.User;
import view.UserView;

import java.util.List;

public class UserService implements DataService{

    @Override
    public User createUser() {
        UserView<User> userView= new UserView<>();
        return userView.addUser();
    }

    @Override
    public List<User> readData() {
        return null;
    }
}
