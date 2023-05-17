package somesalary;

public class Salary extends Human {
    public static void main(String[] args) {

        Human sviatoslav = new Human("Sviatoslav", 35, 600, Level.TRAINEE);
        Human Vladislav = new Human("Vladislav", 36, 1200, Level.TRAINEE);
        Human Elvira = new Human("Elvira", 35, 1600, Level.MIDDLE);
        Human Serg = new Human("Sergej", 35, 2000, Level.SENIOR);
        Human viktor = new Human("Vitya", 35, 2000, Level.SENIOR);
        System.out.println("Victor's salary is" + ""  + viktor.getSalary());







}




    Salary(String name, int age, int salary, Enum level) {
        super(name, age, salary, level);
    }
}
