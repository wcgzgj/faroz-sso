package sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sso.pojo.Demo;
import sso.service.DemoService;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/24 下午4:30
 * @Version 1.0
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/list")
    public List<Demo> list() {

        return demoService.getList();
    }
}
