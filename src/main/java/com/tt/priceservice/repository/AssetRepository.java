package com.tt.priceservice.repository;

import com.tt.priceservice.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Integer> {
}
