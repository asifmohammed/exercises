package polyDemo;

import java.util.ArrayList;
import java.util.List;

public class PolyDemoMain {
    public static void main(String[] args) {
        Animal kurre=new Cat("kurre");
        Animal vilma=new Dog("vilma");
        Animal bamse=new Cat("Bamse");
        List<Animal>animalList=new ArrayList<>();
        animalList.add(kurre);
        animalList.add(vilma);
        animalList.add(bamse);
        for (Animal animal : animalList) {
            animal.introduceYourself();
        }
    }
    }

