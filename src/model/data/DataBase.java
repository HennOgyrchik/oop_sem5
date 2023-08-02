package model.data;

import java.util.ArrayList;

public class DataBase<T extends User> {
    ArrayList<T> db;

    public DataBase(ArrayList<T> db) {
        this.db = db;
    }

    public ArrayList<T> getDb() {
        return db;
    }

    public void setDb(ArrayList<T> db) {
        this.db = db;
    }

    @Override
    public String toString() {
        String res="";
        for (T obj: db ) {
           // res+="Имя: "+obj.getName()+"\nФамилия: "+obj.getLastName()+"\nДата рождения: "+obj.getBirthday()+"\n";
            res+= obj.toString()+"\n";
        }
        return res;
    }
}
