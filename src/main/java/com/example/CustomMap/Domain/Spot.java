package com.example.CustomMap.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Spot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spot_id")
    private Long id;

    private String title;

    private String address;

    @ManyToOne
    @JoinColumn(name = "map_id")
    private Map map;





}
