package polyDemo;

import java.util.ArrayList;
import java.util.List;

public class House {
    List<Animal> animalList = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public void print() {
System.out.println("the following animals are in the house: ");
        for (Animal animal : animalList) {
            animal.print();
        }
}
    @Override
    public String toString() {
        return "House{" +
                "animalList=" + animalList +
                '}';
    }
}
