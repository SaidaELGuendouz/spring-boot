package com.example.docker_spring.Controller;

import com.example.docker_spring.model.Reservation;
import com.example.docker_spring.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@AllArgsConstructor
public class ReservationController {
    private ReservationRepository reservationRepository;

    @GetMapping("/all")
    public List<Reservation> getReservation() {
        return reservationRepository.findAll();
    }
}
