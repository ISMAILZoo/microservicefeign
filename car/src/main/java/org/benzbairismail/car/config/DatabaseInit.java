package org.benzbairismail.car.config;

import org.benzbairismail.car.modules.car.Car;
import org.benzbairismail.car.modules.car.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Random;

@Configuration
public class DatabaseInit {

    @Bean
    CommandLineRunner initializeDatabase(CarRepository carRepository) {
        return args -> {
            // Random generator for clientId
            Random random = new Random();

            // Create and save 30 cars
            List<Car> cars = List.of(
                    Car.builder().marque("Toyota").matricule("123-ABC").model("Corolla").clientId((long) (random.nextInt(10) + 1)).build(),
                    Car.builder().marque("Honda").matricule("456-DEF").model("Civic").clientId((long) (random.nextInt(10) + 1)).build(),
                    Car.builder().marque("Ford").matricule("789-GHI").model("Focus").clientId((long) (random.nextInt(10) + 1)).build(),
                    Car.builder().marque("Chevrolet").matricule("012-JKL").model("Malibu").clientId((long) (random.nextInt(10) + 1)).build(),
                    Car.builder().marque("BMW").matricule("345-MNO").model("3 Series").clientId((long) (random.nextInt(10) + 1)).build()
               );

            carRepository.saveAll(cars);
            System.out.println("Database initialized with 30 cars.");
        };
    }
}
