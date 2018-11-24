package polyDemo;

public class Toy {
    private String name;
    Toy(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName(){
        return this.name;
    }
}
