package polyDemo;

public class LabStage3 {
    public static void main(String[] args) {
Animal.setYear(2013);
Animal kurre=new Cat("kurre",6);
Animal vilma=new Dog("vilma",5);
kurre.introduceYourself();
vilma.introduceYourself();
Animal.setYear(2014);
kurre.introduceYourself();
vilma.introduceYourself();

    }
}
