import java.util.ArrayList;

public class Race {
    private final ArrayList<Car> cars = new ArrayList<>();
    private final ArrayList<Car> leaders = new ArrayList<>();
    private Car leader;
    private double distanceLeader = 0;

    public void addCar(Car car) {
        cars.add(car);
    }

    private void executeLeader() {
        if (!cars.isEmpty()) {
            for (Car car : cars) {
                double distance = 24 * car.getSpeed();
                if (distance > distanceLeader) {
                    if (!leaders.isEmpty()) {
                        leaders.clear();
                        ;
                    }
                    distanceLeader = distance;
                    leaders.add(car);
                } else if (distance == distanceLeader) {
                    leaders.add(car);
                }
            }
        }
    }

    public ArrayList<Car> getLeader() {
        executeLeader();
        return leaders;
    }
}
