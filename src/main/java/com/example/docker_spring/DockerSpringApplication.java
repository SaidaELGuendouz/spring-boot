package com.example.docker_spring;

import com.example.docker_spring.model.Reservation;
import com.example.docker_spring.model.StatutReservation;
import com.example.docker_spring.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringApplication.class, args);
    }
@Bean
    CommandLineRunner CommandLineRunner(ReservationRepository reservationRepository) {
        return args -> {
            reservationRepository.save(Reservation.builder().titre("Tennis").prix(100.0).statut(StatutReservation.Created).build());
            reservationRepository.save(Reservation.builder().titre("Football").prix(200.0).statut(StatutReservation.Confirmed).build());
        };
    }
}
