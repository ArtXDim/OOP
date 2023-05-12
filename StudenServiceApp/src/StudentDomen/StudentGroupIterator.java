package StudentDomen;

//import class Iterator and List
import java.util.Iterator;
import java.util.List;

/**
 * Class User, non-inheritence 
 */

public class StudentGroupIterator implements Iterator<Student>{

    /**
     * Construction
     * @param students
     * @param groupID 
     */

    private int counter;
    private final List<Student> students;
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }

    /**
     * Override methods hasNext, next
     */

    @Override
    public boolean hasNext() {
        return counter<students.size();
    }

    @Override
    public Student next() {
        if (!hasNext())
        {
            return null;
        }
        //counter++;
        return students.get(counter++);
    }
    
}
