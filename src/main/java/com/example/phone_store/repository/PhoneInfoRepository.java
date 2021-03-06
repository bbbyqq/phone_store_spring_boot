package com.example.phone_store.repository;

import com.example.phone_store.entity.PhoneInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneInfoRepository extends JpaRepository<PhoneInfo,Integer> {
    public List<PhoneInfo> findAllByCategoryType(Integer categoryInfo);
}
