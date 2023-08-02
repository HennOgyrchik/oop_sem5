package model.service;

import model.data.Student;
import model.data.Teacher;

import java.util.Scanner;

public interface DataService {
    Student createStudent (Scanner in);
    Teacher createTeacher (Scanner in);

}
