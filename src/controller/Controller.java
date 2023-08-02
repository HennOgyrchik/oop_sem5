package controller;

import model.data.User;
import model.service.DataService;
import model.service.UserService;

public class Controller {
    private DataService service = new UserService();

    public User createNewUser(){
       return service.createUser();
    }
}
