package com.tt.priceservice.repository;

import com.tt.priceservice.entity.Asset;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class AssetRepositoryTests {

    @Autowired
    private AssetRepository assetRepository;

    @Test
    void testFindAll() {
        // Given
        Asset asset1 = new Asset();
        asset1.setAssetId("S1");
        asset1.setPrice(50.5);
        Asset asset2 = new Asset();
        asset2.setAssetId("S2");
        asset2.setPrice(20.2);
        assetRepository.save(asset1);
        assetRepository.save(asset2);

        // When
        List<Asset> assets = assetRepository.findAll();

        // Then
        assertEquals(2, assets.size());
    }
}