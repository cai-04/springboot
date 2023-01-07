package nuc.edu.cai4.cai4mybatis.service.impl;

import nuc.edu.cai4.cai4mybatis.domain.Student;
import nuc.edu.cai4.cai4mybatis.mapper.IStudentDao;
import nuc.edu.cai4.cai4mybatis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDao studentDao;
    @Override
    public Student findById(Integer id) {

        return studentDao.findById(id);
    }
}