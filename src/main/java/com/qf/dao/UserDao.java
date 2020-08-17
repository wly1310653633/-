package com.qf.dao;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {
    //查
    public List<User> selectAll(int page, int limit);
    public void deletes(int [] id);
}
