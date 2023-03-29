package race;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EntidadeCorrida car1 = new EntidadeCorrida(1);
        EntidadeCorrida car2 = new EntidadeCorrida(2);
        car1.setComportamentoAutonomia(new CarroCombustao(10));
        car2.setComportamentoAutonomia(new CarroEletrico(1.0f));

        ArrayList<EntidadeCorrida> cars = new ArrayList<EntidadeCorrida>();
        cars.add(car1);
        cars.add(car2);
        System.out.println("corrida inicio");
        for (int index = 0; index < 10; index++) {
            cars.stream().forEach(t -> {
                t.move();
                System.out.println(t);
            });
        }
        System.out.println("corrida fim");
    }
}