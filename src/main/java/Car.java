public class Car {
    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        setSpeed(speed);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        if (speed >= 1 && speed <= 250) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException("Скорость должна быть от 1 до 250");
        }
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
