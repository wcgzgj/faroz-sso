package sso.service.impl;

import org.springframework.stereotype.Service;
import sso.mapper.TestMapper;
import sso.pojo.Test;
import sso.service.TestService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestServiceImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/24 下午4:24
 * @Version 1.0
 **/
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public List<Test> getList() {
        List<Test> list = testMapper.getList();
        return list;
    }
}
