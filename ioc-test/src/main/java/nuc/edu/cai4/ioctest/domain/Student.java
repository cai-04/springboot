package nuc.edu.cai4.ioctest.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student implements Person{
    @Value("11")
    private Integer stu_id;
    @Value("cai4")
    private String stu_name;

    /*public Student(Integer stu_id, String stu_name) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
    }*/
    public Student() {}

    @Override
    public void say() {

    }
}
