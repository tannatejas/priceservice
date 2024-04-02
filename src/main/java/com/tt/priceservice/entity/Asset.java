package com.tt.priceservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="ASSET_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String assetId;
    private Double price;
}
