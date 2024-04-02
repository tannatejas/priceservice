package com.tt.priceservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PriceResponse {

    //Asset Id in the response
    private String assetId;

    //Asset Price
    private Double price;

    @Override
    public String toString() {
        return "PriceResponse{" +
                "assetId='" + assetId + '\'' +
                ", price=" + price +
                '}';
    }

}
