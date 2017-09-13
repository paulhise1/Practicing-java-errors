import java.util.*;

public class ErrorsAndGenerics {

  public static void main(String[] args) {

    User firstUser = new User("William", 21, "willywonk@gmail.com", "willywonk");
    User secondUser = new User("Paul", 32, "paul@gmail.com", "mediumtallpaul");
    User thirdUser = new User("Louis", 94, "louis@gmail.com", "kinglouie");
    User fourthUser = new User("Brandon", 19, "brandon@gmail.com", "brandoff");
    User fifthUser = new User("Stephen", 167, "stephen@gmail.com", "steprooster");

    String[] users = {"Paul", "Brandon", "Stephen", "Louis"};
    ArrayList<String> usersInAndroidClass = new ArrayList<String>(Arrays.asList(users));

    try {
      firstUser.allowedUsers(usersInAndroidClass, firstUser.name);
    }   catch(UserException userException) {
          System.out.println(userException + ": " + userException.description);
        } catch(Exception exception) {
          System.out.println(exception);
        }

    try {
      secondUser.allowedUsers(usersInAndroidClass, secondUser.name);
    }   catch(UserException userException) {
          System.out.println(userException + ": " + userException.description);
        } catch(Exception exception) {
          System.out.println(exception);
        }

      try {
        thirdUser.allowedUsers(usersInAndroidClass, thirdUser.name);
      }   catch(UserException userException) {
            System.out.println(userException + ": " + userException.description);
          } catch(Exception exception) {
            System.out.println(exception);
            }

      try {
        thirdUser.allowedAge(thirdUser.age);
      } catch(UserException userException) {
          System.out.println(userException + ": " + userException.description);
        } catch(Exception exception) {
          System.out.println(exception);
          }


      try {
        fourthUser.allowedAge(fourthUser.age);
      } catch(UserException userException) {
          System.out.println(userException + ": " + userException.description);
        } catch(Exception exception) {
          System.out.println(exception);
          }

      try {
        fifthUser.allowedAge(fifthUser.age);
      } catch(UserException userException) {
          System.out.println(userException + ": " + userException.description);
        } catch(Exception exception) {
          System.out.println(exception);
          }
  }

}
