package com.example.phone_store.repository;

import com.example.phone_store.entity.BuyerAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerAddressRepsitory extends JpaRepository<BuyerAddress,Integer> {
}