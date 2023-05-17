package inheritance;

import controlstatement.Constryctor;

public class InheritanceMain {

    public static void main(String[] args) {
    Auto auto = new Auto("Mersedes", "Sprinter", EngineType.DIESEL);
    Auto ford = new Auto("FORD", "FUSION", EngineType.HYBRID);
       ford.checkCurrentSpeed(120);

       /* System.out.println(auto.getProducer());
        System.out.println(auto.getModel());*/
        }



}
