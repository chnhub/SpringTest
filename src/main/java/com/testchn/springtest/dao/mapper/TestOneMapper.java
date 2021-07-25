package com.testchn.springtest.dao.mapper;

//import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.testchn.springtest.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestOneMapper extends BaseMapper<UserEntity>{
}
