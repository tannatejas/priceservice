package com.tt.priceservice.service;

import com.tt.priceservice.entity.Asset;
import com.tt.priceservice.repository.AssetRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AssetServiceImplTest {

    @Mock
    private AssetRepository assetRepository;

    @InjectMocks
    private AssetServiceImpl assetService;

    @Test
    void saveAssetTest() {
        // Prepare test data
        Asset asset = new Asset();
        asset.setAssetId("A123");

        // Mock behavior
        when(assetRepository.save(any(Asset.class))).thenReturn(asset);

        // Call the service method
        Asset savedAsset = assetService.saveAsset(asset);

        // Verify the behavior
        assertEquals(asset, savedAsset);
    }

    @Test
    void findAllAssetsTest() {
        // Prepare test data
        List<Asset> assets = new ArrayList<>();
        assets.add(new Asset(1, "asset1", 10.0));
        assets.add(new Asset(2, "asset2", 12.0));

        // Mock behavior
        when(assetRepository.findAll()).thenReturn(assets);

        // Call the service method
        List<Asset> allAssets = assetService.findAllAssets();

        // Verify the behavior
        assertEquals(assets.size(), allAssets.size());
        for (int i = 0; i < assets.size(); i++) {
            assertEquals(assets.get(i), allAssets.get(i));
        }
    }
}