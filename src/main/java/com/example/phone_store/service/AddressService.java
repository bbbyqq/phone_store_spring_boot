package com.example.phone_store.service;

import com.example.phone_store.form.AddressForm;
import com.example.phone_store.vo.AddressVO;

import java.util.List;

public interface AddressService {
    public List<AddressVO> findAll();
    public void saveOrUpdate(AddressForm addressForm);
}
