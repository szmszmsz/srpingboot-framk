package org.szm.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.szm.entity.User;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    public List<User> getPerson();
}
