package pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ким Иван Сергеевич");
        student.setGroup("114");
        student.setEnrolled(new Date());
        System.out.println(student.getName() + " был зачислен в группу N " + student.getGroup()
                           + " " + student.getEnrolled());
    }
}
