import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Сергей","Иванов",25);
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group = new StudentGroup(listStud);

        for(Student stud : group)
        {
            System.out.println(stud);
        }

        System.out.println("============= после сортировки =============");
        Collections.sort(group.getStudents());


        for(Student stud : group)
        {
            System.out.println(stud);
        }
        


        //System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(group);
    }
}
