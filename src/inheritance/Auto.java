package inheritance;

public class Auto {

    private String producer;
    private String model;
    private EngineType engineType;
    private int currentSpeed;
    protected boolean isRunning;

    public Auto(String producer, String model, EngineType engineType) {
        this.producer = producer;
        this.model = model;
        this.engineType = engineType;
        System.out.println("Auto was initialized");
    }

    public void start() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Auto is starting");

    }

    public void checkCurrentSpeed(int kmHour) {
        if (kmHour <= 60) {
            System.out.println("Ты молодец, соблюдаешь правила ПДД");
        } else if (kmHour <= 100) {
            System.out.println("Братик, нужно бы снизить скорость!!!");
        } else if (kmHour <= 120) {
            System.out.println("ТЫ нарушаешь правила ПДД!!!");
        } else {
            System.out.println("ПОЛИЦИЯ ВЫЕХАЛА ЗА ТОБОЙ!!!");
        }
    }

    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Auto has stopped");
    }

    public void accelerate(int kmPerHour) {
        currentSpeed += kmPerHour;
        System.out.println("Accelerating. Current speed is " + currentSpeed + "kmPerHours ");
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engineType +
                ", currentSpeed=" + currentSpeed +
                ", isRunning=" + isRunning +
                '}';
    }
}
