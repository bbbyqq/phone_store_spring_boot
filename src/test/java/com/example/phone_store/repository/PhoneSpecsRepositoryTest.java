package com.example.phone_store.repository;

import com.example.phone_store.entity.PhoneSpecs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PhoneSpecsRepositoryTest {

    @Autowired
    private PhoneSpecsRepository repository;

    @Test
    void findAll() {
        List<PhoneSpecs> List = repository.findAll();
        for (PhoneSpecs phoneSpecs : List) {
            System.out.println(phoneSpecs);
        }
    }

    @Test
    void findAllByPhoneId() {
        List<PhoneSpecs> List = repository.findAllByPhoneId(1);
        for (PhoneSpecs phoneSpecs : List) {
            System.out.println(phoneSpecs);
        }
    }
}