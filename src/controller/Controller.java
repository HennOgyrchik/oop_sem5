package controller;

import model.data.Student;
import model.data.Teacher;
import model.service.DataService;
import model.service.UserService;

import java.util.Scanner;

public class Controller {
    private DataService service = new UserService();

    public Student createNewStudent(Scanner in){
       return service.createStudent(in);
    }
    public Teacher createNewTeacher(Scanner in){
        return service.createTeacher(in);
    }


}
