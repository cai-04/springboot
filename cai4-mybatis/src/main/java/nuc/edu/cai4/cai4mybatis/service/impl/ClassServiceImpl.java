package nuc.edu.cai4.cai4mybatis.service.impl;

import nuc.edu.cai4.cai4mybatis.domain.Classes;
import nuc.edu.cai4.cai4mybatis.mapper.IClassesDao;
import nuc.edu.cai4.cai4mybatis.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class ClassServiceImpl implements IClassService {
        @Autowired
        private IClassesDao classDao;
        @Override
        public Classes getClass(Integer id) {
            System.out.println(id);
            return classDao.getClass(id);
        }
        @Override
        public Classes getClass2(Integer id) {
            return classDao.getClass(id);
        }
    }

