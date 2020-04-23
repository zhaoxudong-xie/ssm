package com.zhao.dao;

import com.zhao.domain.Admin;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminDao {
    @Select("select * from t_admin where admin_name=#{adminName} and password=#{password}")
    Admin login(Admin admin);
}
