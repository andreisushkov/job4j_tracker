package ru.job4j.pojo;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Andrey Sushkov. ");
        student.setGroup("orchestra instruments. ");
        student.setReceipt("11.08.2009");
        System.out.println("Name: " + student.getName() + "Group: " + student.getGroup() + "Date receipt: " + student.getReceipt());
    }
}
