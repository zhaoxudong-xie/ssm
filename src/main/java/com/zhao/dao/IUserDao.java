package com.zhao.dao;

import com.zhao.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {
    /**
     * 添加用户
     * @param user
     */
    @Insert("insert into t_user(name,sex,age,stu_id,qq,email)values(#{name},#{sex},#{age},#{stuId},#{qq},#{email})")
    void addUser(User user);

    /**
     * 查找所有用户
     * @return
     */
    @Select("select*from t_user")
    List<User> findAll();
}
