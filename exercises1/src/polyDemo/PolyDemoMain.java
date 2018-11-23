package polyDemo;

import java.util.ArrayList;
import java.util.List;

public class PolyDemoMain {
    public static void main(String[] args) {
       Animal kurre=new Cat("kurre",6);
       Animal vilma=new Dog("vilma",5);
       Animal bamse=new Cat("Bamse",4);
       List<Animal>animalList=new ArrayList<>();
       animalList.add(kurre);
       animalList.add(vilma);
       animalList.add(bamse);
       for (Animal animal : animalList) {
           animal.introduceYourself();
        }
    }
    }

