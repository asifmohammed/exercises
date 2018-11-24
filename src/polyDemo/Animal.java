package polyDemo;

import java.util.ArrayList;
import java.util.List;

public class Animal extends Object {
    private String name;
    private int age;
    private static int currentYear;
    private Animal friend;
    List<Toy>toyList=new ArrayList<>();

    public Animal(String name,int age){
        this.name=name;
        this.age=age;
        this.friend=null;
    }

    public String getName(){
        return this.name;
    }
public void addToy(Toy toy){
        toyList.add(toy);
}
public int calculateBirthYear(){
    return currentYear-age;
}
public static int setYear(int Year){
    return currentYear=Year;
   }
   public void setFriend(Animal friend){
        this.friend=friend;
   }
   public void print(){
        this.introduceYourself();
        if(friend!=null){
            System.out.println("this is the information about my friend: ");
            friend.introduceYourself();
        }
        else{
            System.out.println("i have no friends");
        }
        if(toyList.isEmpty()){
            System.out.println("i have no toys");
        }else{
            System.out.println("these are my toys "+toyList);
        }
   }

    public void introduceYourself(){
        System.out.println("Morr i am an animal "+name);
        System.out.println("and I am " +calculateBirthYear() + " years old.");
    }
}
