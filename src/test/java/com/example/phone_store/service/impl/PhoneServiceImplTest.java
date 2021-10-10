package com.example.phone_store.service.impl;

import com.example.phone_store.service.PhoneService;
import com.example.phone_store.vo.DataVO;
import com.example.phone_store.vo.PhoneInfoVO;
import com.example.phone_store.vo.SpecsPackageVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PhoneServiceImplTest {

    @Autowired
    private PhoneService phoneService;

    @Test
    void findDataVO() {
        DataVO dataVO = phoneService.findDataVO();
        int id = 0;
    }

    @Test
    void findPhoneInfoByCategoryType() {
        List<PhoneInfoVO> list = phoneService.findPhoneInfoVOByCategoryType(2);
        int id = 0;
    }

    @Test
    void findSku() {
        SpecsPackageVO specsPackageVO = phoneService.findSpecsByPhoneId(1);
        int id  = 0;
    }

    @Test
    void subStock() {
        phoneService.subStock(1,1);
    }
}