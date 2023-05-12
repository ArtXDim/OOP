/*import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.User;
import StudentDomen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Сиротин", "Степан", "Оскорович", 32);  
        Teacher t1 = new Teacher("Ермаков", "Ермак" , "Куприянович", 91, 4001, "OOP");   
        Student s1 = new Student("Миронов","Зиновий", "Куприянович", 19, 1001);
        Student s2 = new Student("Панов", "Антон", "Витальевич", 21, 1004);
        Student s4 = new Student("Романов", "Терентий", "Максович", 20, 1003);
        Student s5 = new Student("Горбачёв", "Любовь", "Федосеевна", 26, 1010);
        Student s6 = new Student("Киселёв", "Мечеслав", "Николаевич", 21, 1008);
        Teacher t2 = new Teacher("Мамонтов", "Наум", "Эльдарович", 48, 0, "JAVA");
        Student s3 = new Student("Макаров", "Азарий", "Игоревич", 19, 1021);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group = new StudentGroup(listStud);

        for (Student stud : group)
        {
            System.out.println(stud);    
        }

        System.out.println("-------------- после сориторвки ------------------");
        Collections.sort(group.getStudents());

        for (Student stud : group)
        {
            System.out.println(stud);    
        }

        System.out.println(u1);
        //System.out.println(t1);
        //System.out.println(t2);
        //System.out.println(group);
    }
}
*/

import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import Controllers.EmploeeController;
import StudentDomen.AverageAge;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentStream;
import StudentDomen.StudentGroup;
import StudentDomen.Teacher;
import StudentDomen.User;
import StudentService.EmploeeService;
import StudentService.StudentService;
import StudentService.TeacherService;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // Создаем сервис студентов - экземпляр класса StudentService
        StudentService serv = new StudentService();
        
        //Добавляем студентов внутрь сервиса
        serv.create("1", "Альбина", "Ринатовна", 20);
        serv.create("Бобровский", "Ярослав", "Александрович", 22);
        serv.create("Варзер", "Назарий", "Алексеевич", 20);
        serv.create("Маслова", "Арина", "Михайловна", 22);
        serv.create("Яковлев", "Илья", "Денисович", 20);
        serv.create("Родченко", "Тихон", "Владимирович", 22);
        serv.create("Смирнова", "Елизавета", "Эдуардовна", 20);
        serv.create("Тимашев", "Леонид", "Янович", 22);
        serv.create("Лебедев", "Всеволод", "Борисович", 20);
        serv.create("Медведев", "Артемий", "Ильич", 22);
        serv.create("Болдырева", "Ксения", "Артемовна", 20);
        serv.create("Шимко", "Алёна", "Александровна", 22);
        serv.create("Ковач", "Алёна", "Валентиновна", 20);
        serv.create("Долгих", "Олеся", "Викторовна", 22);
       
     //Выводим список студентов внутри сервиса
     System.out.println("Список всех студентов:");
     for (Student s : serv.getAll()) {
         System.out.println(s);
     }
     System.out.println();
     System.out.println("=============Список студентов после сортировки==============");
     // Выводим отсортированный список студентов из сервиса по имени
     List<Student> sortedList = new ArrayList<>(serv.getAll());
     Collections.sort(sortedList, Comparator.comparing(Student::getFirstName));
     for (Student s : sortedList) {
         System.out.println(s);
     }    

        // Рандомное разбиение студентов на группы
    System.out.println();
    List<Student> students = serv.getAll();
    int groupSize = students.size() / 2;
    Collections.shuffle(students, new Random());
    List<StudentGroup> groups = new ArrayList<>();
    groups.add(new StudentGroup(students.subList(0, groupSize), groupSize));
    groups.add(new StudentGroup(students.subList(groupSize, students.size()), groupSize));

    // Выводим список групп
    System.out.println();
    System.out.println("Список групп студентов:");
    for (StudentGroup group : groups) {
        System.out.println(group);
    }

    // Выводим список студентов внутри каждой группы
    System.out.println();
    for (StudentGroup group : groups) {
        System.out.println("Список студентов группы " + group.getGroupID() + ":");
        for (Student student : group.getStudents()) {
            System.out.println(student);
        }
        System.out.println();
    }
       

// Создаем сервис работников - экземпляр класса EmploeeService
EmploeeService servEmp = new EmploeeService();
// Добавляем работников внутрь сервиса
servEmp.create("Мванова", "Дарья", "Ивановна", 34);
servEmp.create("Бузова", "Ольга", "Леонидовна", 45);
servEmp.create("Шпаро", "Сергей", "Сергеевич", 43);
servEmp.create("Астахов", "Зиновий", "Клавдиевич", 49);

// Выводим список работников из сервиса
System.out.println();
System.out.println("Список работников:");
for (int i = 0; i < servEmp.getAll().size(); i++) {
System.out.println(servEmp.getAll().get(i));
}
System.out.println("=============Список работников после сортировки==============");
// Выводим отсортированный список работников из сервиса
for (int i = 0; i < servEmp.getSortedByFIOStudentGroup().size(); i++) {
System.out.println(servEmp.getSortedByFIOStudentGroup().get(i));
}

// Создаем сервис преподавателей - экземпляр класса TeacherService
TeacherService servTeach = new TeacherService();
// Добавляем преподавателей внутрь сервиса
System.out.println();
servTeach.create("Виноградов", "Владислав", "Сергеевич", 30, "Доцент");
servTeach.create("Горбатов", "Евгений", "Иванович", 44, "Старший преподаватель");
servTeach.create("Вестяк", "Анатолий", "Владленович", 68, "Профессор");
servTeach.create("Архипова", "Елена", "Вячеславовна", 62, "Доцент");
servTeach.create("Бодрышев", "Валерий", "Васильевич", 52, "Доцент");
servTeach.create("Денискин", "Юрий", "Иванович", 62, "Профессор");
// Выводим список преподавателей из сервиса
System.out.println("Список преподавателей:");
for (Teacher t : servTeach.getAll()) {
System.out.println(t);
}
System.out.println("===========После сортировки================");
// Выводим отсортированный список преподавателей из сервиса
for (Teacher t : servTeach.getSortedByFIOStudentGroup()) {
System.out.println(t);
}
        /* Вычисление средних возрастов */
        // Создаем экземпляр класса, с необходимым нам типом, затем вызываем метод
        // вычисления среднего возраста
        System.out.println();
        AverageAge<Student> averageAgeOfStudents = new AverageAge<>(serv.getAll());
        System.out.println("Средний возраст студентов: " + averageAgeOfStudents.calculateAverageAge());
        AverageAge<Teacher> averageAgeOfTeachers = new AverageAge<>(servTeach.getAll());
        System.out.println("Средний возраст преподавателей: " + averageAgeOfTeachers.calculateAverageAge());
        AverageAge<Emploee> averageAgeOfEmploee = new AverageAge<>(servEmp.getAll());
        System.out.println("Средний возраст работников: " + averageAgeOfEmploee.calculateAverageAge());

    }
}