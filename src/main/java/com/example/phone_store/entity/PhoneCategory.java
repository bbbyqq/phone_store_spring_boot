package com.example.phone_store.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
// 创建实体类
public class PhoneCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;
}
