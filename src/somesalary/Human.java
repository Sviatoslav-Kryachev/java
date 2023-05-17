package somesalary;

import static somesalary.Level.MIDDLE;

public class Human {
    private String name;
    public int age;
    private int salary;
    private Enum level;

    public String getName() {
        return name;
    }

/*
    public void moreWork(){
        switch (Level){
            case MIDDLE:
            System.out.println("YOu are OK");
        }

    }
*/



    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    public void setLevel() {
        this.level = level;
    }

    Human(String name, int age, int salary, Enum level) {
        this.name = name;
        this.age = age;
        this.salary = salary;

            }
    Human(String name) {
        this.name = name;

    }

}
