package com.example.phone_store.service;

import com.example.phone_store.vo.DataVO;
import com.example.phone_store.vo.PhoneInfoVO;
import com.example.phone_store.vo.SpecsPackageVO;

import java.util.List;

public interface PhoneService {
    public DataVO findDataVO();

    public List<PhoneInfoVO> findPhoneInfoVOByCategoryType(Integer categoryType);

    public SpecsPackageVO findSpecsByPhoneId(Integer phoneId);

    public void subStock(Integer specsId, Integer quantity);
}
