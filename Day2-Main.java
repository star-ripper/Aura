class Student{
    static int countStudent; //Will be same in the whole class
    final private String name; //This creates an immutable part of an object
    Student(String name){
        this.name=name;
    }
}
class Day2-Main{
    public static void main(String[] args){
        //------static fields---------
        Student s1 = new Student("Ahmed");
        Student s2 = new Student("Muneeb");
        s1.countStudent++;
        s2.countStudent++;
        System.out.println(s1.countStudent); //This will print 2 even though this object can only called it once
        int a = 10;

        //--------WrapperClasses---------
        Integer obj = Integer.valueOf(a); // manual boxing
        int b = obj.intValue();             //manual boxing
        System.out.println(b);


    }
}
