public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal[] allAnimals;
        int i;
       allAnimals = new Animal[3];
        allAnimals[0] = new Cat("kurre");
        allAnimals[1] = new Dog("vilma");
        allAnimals[2] = new Cat("bamse");
      //Animal kurre=new Cat("kurre");
      //  Animal vilma=new Dog("vilma");
       // ((Cat) kurre).age=6;
        //((Dog) vilma).age=7;
        //kurre.introduceYourself();
        //vilma.introduceYourself();*/
        i = 0;
        while (i > allAnimals.length) {
            allAnimals[i].introduceYourself();
            i=i+1;
        }
    }
}
