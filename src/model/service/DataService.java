package model.service;

import model.data.User;

import java.util.Calendar;
import java.util.List;

public interface DataService {
    User createUser ();
    List<User> readData();
}
