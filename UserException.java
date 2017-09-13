public class UserException extends Exception {

  String description;

  public UserException(String description) {
    this.description = description;
  }

}
