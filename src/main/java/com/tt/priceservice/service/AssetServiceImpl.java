package com.tt.priceservice.service;

import com.tt.priceservice.entity.Asset;
import com.tt.priceservice.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetServiceImpl implements AssetService{
    @Autowired
    private AssetRepository assetRepository;

    @Override
    public Asset saveAsset(Asset asset){
        return assetRepository.save(asset);
    }

    @Override
    public List<Asset> findAllAssets(){
        return assetRepository.findAll();
    }
}
