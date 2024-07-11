
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название и скорость автомобиля: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Название: ");
            String name = scanner.nextLine();

            System.out.print("Скорость: ");
            int speed = 0;
            while (true) {
                try {
                    speed = Integer.parseInt(scanner.nextLine());
                    if (speed >= 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Неверный ввод! Введите число от 1 до 250.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Неверный ввод! Введите число от 1 до 250.");
                }
            }
            Car car = new Car(name, speed);
            race.addCar(car);
        }

        ArrayList<Car> winners = race.getLeader();
        if (!winners.isEmpty()) {
            for (Car winner : winners) {
                System.out.println("Самая быстрая машина: " + winner.getName() + " со скоростью " + winner.getSpeed() + " км");
            }
        } else {
            System.out.println("Список победителей пуст");
        }
    }
}
