package com.zhao.dao;

import com.zhao.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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

    /**
     * 删除用户
     * @param id
     */
    @Delete("delete from t_user where id=#{id}")
    void delete(Integer id);

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    @Select("select * from t_user where id=#{id}")
    User findById(Integer id);

    /**
     * 更新用户
     * @param user
     */
    @Update("update t_user set name=#{name},sex=#{sex},age=#{age},stu_id=#{stuId},qq=#{qq},email=#{email} where id=#{id}")
    void update(User user);
}
