package com.tt.priceservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PriceRequest {

    //Asset Id passed in the request
    private List<String> assetId;

    @Override
    public String toString() {
        return "PriceRequest{" +
                "assetId=" + assetId +
                '}';
    }
}
