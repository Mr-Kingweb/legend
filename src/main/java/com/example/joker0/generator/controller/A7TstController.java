package com.example.joker0.generator.controller;

import com.example.joker0.generator.domain.A7Test;
import com.example.joker0.generator.service.A7TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * a7测试控制器
 *
 * @author JJ_un
 * @date 2023/08/04
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("")
public class A7TstController {


    @Autowired
    private A7TestService a7TestService;

    @GetMapping("/getAllData")
    List<A7Test> getAllData(@RequestParam String meterNum){
        System.out.println(meterNum);
        return a7TestService.getAllByMeterNum(meterNum);
    }

    @GetMapping("/getAllMeter")
    List<String> getAllMeter(){
        System.out.println(a7TestService.getAllMeterNum());
        return a7TestService.getAllMeterNum();
    }
}
