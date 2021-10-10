package com.example.phone_store.conroller;

import com.example.phone_store.exception.PhoneException;
import com.example.phone_store.form.AddressForm;
import com.example.phone_store.service.AddressService;
import com.example.phone_store.util.ResultVOUtil;
import com.example.phone_store.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.ResultSet;

@RestController
@RequestMapping("/address")
@Slf4j
//解决跨域问题
@CrossOrigin(origins = "*",maxAge = 3600)
public class AddressHandler {

    @Autowired
    private AddressService addressService;

    @GetMapping("/list")
    public ResultVO list() {
        return ResultVOUtil.success(addressService.findAll());
    }

    @PostMapping("/create")
    public ResultVO create(@Valid @RequestBody AddressForm addressForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("【添加地址】 参数错误，addressForm={}", addressForm);
            throw new PhoneException(bindingResult.getFieldError().getDefaultMessage());
        }

        addressService.saveOrUpdate(addressForm);

        return ResultVOUtil.success(null);
    }

    @PutMapping("/update")
    public ResultVO update(@Valid @RequestBody AddressForm addressForm,BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            log.error("【修改地址】 参数错误，addressForm={}", addressForm);
            throw new PhoneException(bindingResult.getFieldError().getDefaultMessage());
        }

        addressService.saveOrUpdate(addressForm);

        return ResultVOUtil.success(null);
    }
}
