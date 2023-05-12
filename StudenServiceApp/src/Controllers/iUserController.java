package Controllers;

import StudentDomen.User;

// Interface controller's (Generic) - это особые средства языка Java для реализации обобщённого
// программирования: особого подхода к описанию данных и алгоритмов, позволяющего 
// работать с различными типами данных без изменения их описания.
 
public interface iUserController<T extends User> {
    void create(String firstName, String secondName, String patronymic,  int age);
}