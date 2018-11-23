package polyDemo;

public class Lab1Stage2 {
    public static void main(String[] args) {
        Animal kurre=new Cat("kurre");
        Animal vilma=new Dog("vilma");
        kurre.age = 6;
        vilma.age=3;
        kurre.introduceYourself();
        vilma.introduceYourself();

    }
}
