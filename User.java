import java.util.*;

public class User extends Person {

  public String email;
  public String username;

  public User(String name, int age, String email, String username) {
    super(name, age);
    this.email = email;
    this.username = username;
  }

  public void allowedUsers(ArrayList<String> userList, String givenUserName) throws Exception {
    if (userList.contains(givenUserName)) {
      System.out.println("Your user name: " + givenUserName + ", is allowed and you can login!");
    } else {
        throw new UserException(this.name + " is not an allowed user.  Please enter a valid user name.");
    }
  }

  public void allowedAge(int givenAge) throws Exception {
    if (this.age < 21) {
      throw new UserException(this.age + " is much too young for these grownup services.  Please return when you are old enough.");
    } else if (this.age > 149) {
       throw new UserException(this.age + " is too old.  The person to have lived the longest ever was only 122 years old.  Please give a user that isn't already expired.");
    } else {
        System.out.println("Age: " + givenAge + ", is old enough to access these grownup services and you can login!");
    }
  }

}
