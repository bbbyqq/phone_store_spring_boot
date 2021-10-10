package com.example.phone_store.conroller;

import com.example.phone_store.service.PhoneService;
import com.example.phone_store.util.ResultVOUtil;
import com.example.phone_store.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/phone")
//解决跨域问题
@CrossOrigin(origins = "*",maxAge = 3600)
public class PhoneHandler {

    @Autowired
    private PhoneService phoneService;


    @GetMapping("/index")
    public ResultVO index() {
        return ResultVOUtil.success(phoneService.findDataVO());
    }

    @GetMapping("/findByCategoryType/{categoryType}")
    public ResultVO findByCategoryType(
            @PathVariable("categoryType") Integer categoryType) {
        return ResultVOUtil.success(phoneService.findPhoneInfoVOByCategoryType(categoryType));
    }

    @GetMapping("/findSpecsByPhoneId/{phoneId}")
    public ResultVO findSpecsByPhoneId(
            @PathVariable("phoneId") Integer phoneId) {
        return ResultVOUtil.success(phoneService.findSpecsByPhoneId(phoneId));
    }
}
