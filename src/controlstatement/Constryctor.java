package controlstatement;

public class Constryctor {

    public String someSport;
    public int ageSportsmen;
    public int salary;


    public Constryctor(String someSport, int ageSportsmen, int salary) {
        this.someSport = someSport;
        this.ageSportsmen = ageSportsmen;
        this.salary = salary;
    }

    public String getSomeSport() {
        return someSport;
    }

    public int getAgeSportsmen() {
        return ageSportsmen;
    }

    public int getSalary() {
        return salary;
    }

    public void setSomeSport(String someSport) {
        this.someSport = someSport;
    }

    public void setAgeSportsmen(int ageSportsmen) {
        this.ageSportsmen = ageSportsmen;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
