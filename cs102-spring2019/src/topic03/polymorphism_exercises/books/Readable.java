
package topic03.polymorphism_exercises.books;

import java.util.List;


public interface Readable {
    String readTitle();
    String readAbstract();
    String readContent();
    List<String> toArrayList();
}
