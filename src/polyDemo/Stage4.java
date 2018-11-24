package polyDemo;

public class Stage4 {
    public static void main(String[] args) {
    Animal.setYear(2013);
    Animal kurre=new Cat("kurre",3);
    Animal vilma=new Dog ("vilam",6);
    Animal bamse=new Cat("bamse",12);
    Animal smilla=new Dog("smilla",1);

    Toy ball=new Toy("boll");
    Toy shoe=new Toy("shoe");
    Toy mouse=new Toy("mouse");

    House house=new House();

    house.addAnimal(kurre);
    house.addAnimal(bamse);
    house.addAnimal(vilma);
    house.addAnimal(smilla);

    kurre.addToy(ball);
    kurre.addToy(mouse);
    vilma.addToy(shoe);
    vilma.addToy(ball);

    kurre.setFriend(vilma);
    vilma.setFriend(smilla);
    bamse.setFriend(kurre);
    house.print();
    }
}
