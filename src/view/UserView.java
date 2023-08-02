package view;

import model.data.Student;
import model.data.Teacher;
import model.data.User;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class UserView<T extends User> {
    public Student createStudent(Scanner in){
        System.out.print("Введите имя: ");
        String name=in.nextLine();
        System.out.print("Введите фамилию: ");
        String lastName=in.nextLine();
        System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
        String[] tempDate =in.nextLine().split("\\.");
        Calendar birthday= new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]), Integer.parseInt(tempDate[0]));

        return new Student(name,lastName,birthday);
    }
    public Teacher createTeacher (Scanner in){
        System.out.print("Введите имя: ");
        String name=in.nextLine();
        System.out.print("Введите фамилию: ");
        String lastName=in.nextLine();
        System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
        String[] tempDate =in.nextLine().split("\\.");
        Calendar birthday= new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]), Integer.parseInt(tempDate[0]));
        return new Teacher(name,lastName,birthday);
    }

}

