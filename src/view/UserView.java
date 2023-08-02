package view;

import model.data.Student;
import model.data.Teacher;
import model.data.User;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class UserView<T extends User> {
    public T addUser(){
        boolean noExit=true;
        Scanner in = new Scanner(System.in);
        T res;
        while (noExit){
            System.out.println("Выберите сущность для создания:\n1) Студент\n2) Преподаватель\n0) Выход");
            switch (in.nextInt()) {
                case 1 -> {
                    return (T) createStudent(in);
                }
                case 2 -> {

                    return (T) createTeacher(in);
                }
                case 0 -> noExit=false;

                default -> in.nextLine();
            }

        }
        in.close();
        return null;
    }

    private Student createStudent(Scanner in){
        in.nextLine();
        System.out.println("Введите имя: ");
        String name=in.nextLine();
        System.out.println("Введите фамилию: ");
        String lastName=in.nextLine();
        System.out.println("Введите дату рождения в формате YEAR;MONTH;DATE: ");
        String[] tempDate =in.nextLine().split(";");
        Calendar birthday= new GregorianCalendar(Integer.parseInt(tempDate[0]), Integer.parseInt(tempDate[1]), Integer.parseInt(tempDate[2]));

        return new Student(name,lastName,birthday);
    }
    private Teacher createTeacher (Scanner in){
        in.nextLine();
        System.out.println("Введите имя: ");
        String name=in.nextLine();
        System.out.println("Введите фамилию: ");
        String lastName=in.nextLine();
        System.out.println("Введите дату рождения в формате YEAR;MONTH;DATE: ");
        String[] tempDate =in.nextLine().split(";");
        Calendar birthday= new GregorianCalendar(Integer.parseInt(tempDate[0]), Integer.parseInt(tempDate[1]), Integer.parseInt(tempDate[2]));

        return new Teacher(name,lastName,birthday);
    }

}

