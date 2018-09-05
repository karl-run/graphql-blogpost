package run.karl.graphqlblogpost;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RootMutationResolver implements GraphQLMutationResolver {

  private final PersonDatabase personDatabase;

  @Autowired
  public RootMutationResolver(PersonDatabase personDatabase) {
    this.personDatabase = personDatabase;
  }

  public Person newPerson(String name, Integer age) {
    Person person = new Person(name, age);

    personDatabase.save(person);

    return person;
  }
}
