package run.karl.graphqlblogpost;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PersonDatabase {

  private List<Person> database;

  public PersonDatabase() {
    database = new ArrayList<>();
    database.add(new Person("Karl O.", 29));
  }

  public Person get(String name) {
    return database
        .stream()
        .filter(person -> person.getName().equals(name))
        .findFirst()
        .orElse(new Person("Unknown", -1));
  }

  public void save(Person person) {
    database.add(person);
  }
}
