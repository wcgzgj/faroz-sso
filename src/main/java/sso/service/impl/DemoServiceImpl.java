package sso.service.impl;

import org.springframework.stereotype.Service;
import sso.mapper.DemoMapper;
import sso.pojo.Demo;
import sso.service.DemoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName DemoServiceImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/24 下午4:24
 * @Version 1.0
 **/
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoMapper demoMapper;

    @Override
    public List<Demo> getList() {
        List<Demo> list = demoMapper.selectByExample(null);
        return list;
    }
}
