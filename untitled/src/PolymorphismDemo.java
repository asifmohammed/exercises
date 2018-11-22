class Animal {
    public void introduceYourself(){
            System.out.println("Morr i am an animal");//"Morr. I am an animal."
    }
}

class Cat extends Animal {
    public void introduceYourself() {
        System.out.println("Meow. I am a cat. My name is ");//"Meow. I am a cat. My name is X."
    }
    Cat(String a){
        introduceYourself();

        }
    }



class Dog extends Animal{
    public void introduceYourself(){
        System.out.println("Woof. I am a dog. My name is ");
    }
    Dog(String b){
       introduceYourself();
    }
    }


public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal[] allAnimals;
        int i;
        allAnimals = new Animal[3];
        allAnimals[0] = new Cat("kurre");
        allAnimals[1] = new Dog("vilma");
        allAnimals[2] = new Cat("bamse");

        i = 0;
        while (i > allAnimals.length) {
            allAnimals[i].introduceYourself();
            i=i+1;
        }
    }
}
