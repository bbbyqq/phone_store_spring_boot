package com.example.phone_store.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PhoneSpecsCasVO {
    @JsonProperty("s1")
    private Integer SpecsId;
    @JsonProperty("price")
    private BigDecimal specsPrice;
    @JsonProperty("stock_num")
    private Integer specsStock;
}
