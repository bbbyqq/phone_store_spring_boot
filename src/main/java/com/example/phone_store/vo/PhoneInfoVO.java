package com.example.phone_store.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class PhoneInfoVO {
    @JsonProperty("id")
    private Integer phoneId;
    @JsonProperty("title")
    private String phoneName;
    @JsonProperty("price")
    private String phonePrice;
    @JsonProperty("desc")
    private String PhoneDescription;
    private List<Map<String, String>> tag;
    @JsonProperty("thumb")
    private String phoneIcon;
    
}
