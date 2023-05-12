package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс Поток студентов, расширенный интерфейсом Iterable для возможности
 * перебора его элементов - групп
 */
public class StudentStream implements Iterable<StudentGroup> {
  private List<StudentGroup> stream;

  /**
   * конструктор класса
   * 
   * @param stream список групп потока
   */
  public StudentStream(List<StudentGroup> stream) {
    this.stream = stream;
  }

  /* получение списка групп в потоке */
  public List<StudentGroup> getStream() {
    return stream;
  }

  /* установка списка групп в потоке */
  public void setStream(List<StudentGroup> stream) {
    this.stream = stream;
  }

  /* перегрузка метода Итератора с использованием анонимного класса */
  @Override
  public Iterator<StudentGroup> iterator() {
    return new Iterator<StudentGroup>() {
      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < stream.size();
      }

      @Override
      public StudentGroup next() {
        if (!hasNext()) {
          return null;
        }
        // counter++;
        return stream.get(index++);
      }

    };
  }
}