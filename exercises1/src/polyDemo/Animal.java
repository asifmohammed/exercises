package polyDemo;

import java.util.Calendar;
import java.util.Date;

public class Animal {
    private String name;
    private int age;
    private static int currentYear;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
public int calculateBirthYear(){
    return currentYear-age;
}
public static int setYear(int Year){
    return currentYear=Year;
   }
    public void introduceYourself(){
        System.out.println("Morr i am an animal "+name);
        System.out.println("and I am " +calculateBirthYear() + " years old.");
    }
}
