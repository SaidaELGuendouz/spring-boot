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
    private String description;
    private Double balance;
     @Enumerated(value = EnumType.STRING)
     private StatutReservation statut;
}
