package run.karl.graphqlblogpost;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class PersonResolver implements GraphQLResolver<Person> {

  public int getComplexValue(Person person) {
    System.out.println("Fetching value for person '" + person.getName() + "'");
    return veryComplexFetchingOfValue(person.getName());
  }

  private int veryComplexFetchingOfValue(String name) {
    if (name.equals("Karl O.")) {
      return 42;
    }

    return 3;
  }
}
