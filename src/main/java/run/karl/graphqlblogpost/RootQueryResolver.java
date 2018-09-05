package run.karl.graphqlblogpost;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RootQueryResolver implements GraphQLQueryResolver {

  private final PersonDatabase personDatabase;

  @Autowired
  public RootQueryResolver(PersonDatabase personDatabase) {
    this.personDatabase = personDatabase;
  }

  public String getHello() {
    return "Hello World!";
  }

  public String getBye() {
    return "Oh no! Bye..";
  }

  public Person getPerson(String who) {
    return personDatabase.get(who);
  }
}
