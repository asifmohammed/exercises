package polyDemo;

public class Animal {
    protected String name;
    public int age;
    public void introduceYourself(){
        System.out.println("Morr i am an animal "+this.name);
        System.out.println("and I am " + this.age + " years old.");
    }
}
