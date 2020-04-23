package com.zhao.service.Impl;

import com.zhao.dao.IAdminDao;
import com.zhao.domain.Admin;
import com.zhao.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements IAdminService {
    @Autowired
    private IAdminDao adminDao;
    @Override
    public boolean login(Admin admin) {
        Admin admin1=null;
        admin1=adminDao.login(admin);
        if(admin1==null){
            return false;
        }else{
            return true;
        }
    }
}
