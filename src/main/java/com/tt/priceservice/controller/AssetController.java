package com.tt.priceservice.controller;

import com.tt.priceservice.entity.Asset;
import com.tt.priceservice.service.AssetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Asset Controller to Save and Get prices.
 */
@RestController
@RequestMapping("/asset")
public class AssetController {

    @Autowired
    AssetServiceImpl assetService;

    @PostMapping("/prices")
    public Asset savePrices(@RequestBody Asset asset){
        return assetService.saveAsset(asset);
    }

    @GetMapping("/prices")
    public List<Asset> getPrices(){
        return assetService.findAllAssets();
    }
}
