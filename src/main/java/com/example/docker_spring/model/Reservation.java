package com.example.docker_spring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
     private String titre;
     private Double prix;
    private String status;
     @Enumerated(value = EnumType.STRING)
     private StatutReservation statut;
}
