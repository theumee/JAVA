package OOP.GettersNSetters;

public class GettersNSetters {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void printDetails(){
        System.out.println(name + ", "+ age);
    }

    public static void main(String[] args) {
        GettersNSetters gs = new GettersNSetters();
        gs.setName("pablo");
        gs.setAge(21);
//        gs.printDetails();
        System.out.println(gs.getName());
        System.out.println(gs.getAge());
        // using getter and setter is easier than assigning the variables
//        gs.printDetails();
    }
}
