package com.tt.priceservice.service;

import com.tt.priceservice.entity.Asset;

import java.util.List;

public interface AssetService {

    public Asset saveAsset(Asset asset);

    public List<Asset> findAllAssets();
}
