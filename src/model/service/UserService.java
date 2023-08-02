package model.service;

import model.data.Student;
import model.data.Teacher;
import view.UserView;

import java.util.Scanner;


public class UserService implements DataService{


    @Override
    public Student createStudent(Scanner in) {
        UserView<Student> userView= new UserView<>();
        return userView.createStudent(in);
    }

    @Override
    public Teacher createTeacher(Scanner in) {
        UserView<Teacher> userView= new UserView<>();
        return userView.createTeacher(in);
    }


}
