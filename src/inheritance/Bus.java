package inheritance;

public class Bus extends FuelAuto {
    private int passengerNumber;

    public Bus(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }

    @Override
    public void fuelUp(int petrolVolume) {
       int volume = getAvailablePetrol() + petrolVolume;
       if (volume>getTankVolume()){
           setAvailablePetrol(getTankVolume());
       }
    }

    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }
    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassengers(int passengerNum) {
        this.passengerNumber += passengerNum;
        System.out.println("Picking up " + passengerNum + "passengers");
    }

    public void releasePassengers() {
        if (isRunning) {
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passengers released");
    }
}
