package sso.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sso.pojo.Test;

import java.util.List;

/**
 * @ClassName TestMapper
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/24 下午3:59
 * @Version 1.0
 **/
@Repository
@Mapper
public interface TestMapper {
    List<Test> getList();
}
