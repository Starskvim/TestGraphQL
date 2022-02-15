package com.example.testgraphql.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "animal")
@Setter
@Getter
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String animalName;
    private Integer weight;
    private String type;
    @Column(name = "created_date", columnDefinition = "TIMESTAMP")
    private LocalDate createdDate;

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", animalName='" + animalName + '\'' +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
