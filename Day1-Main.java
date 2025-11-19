class Student {
    private String name;
    private int age;
    Student() {}
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
}
public class Day1-Main {
    public static void main(String[] args) {
        Student s1 = new Student("Muneeb", 19);
        Student s2 = new Student();
        s2.setName("Ahemd");
        s2.setAge(19);
        System.out.println(s1.getName() + " " + s1.getAge());
        System.out.println(s2.getName() + " " + s2.getAge());
    }
}
