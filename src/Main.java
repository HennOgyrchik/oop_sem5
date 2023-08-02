import controller.Controller;
import model.data.DataBase;
import model.data.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller studContr = new Controller();
        ArrayList<User> userList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        userList.add(studContr.createNewStudent(in));
        userList.add(studContr.createNewTeacher(in));
        in.close();

        DataBase<User> db = new DataBase<>(userList);
        System.out.println(db);
    }
}