public class User {

  private String password;
  private String email;
  private boolean isAdmin;

  public User(String email, String password) {
    this.email = email;
    this.password = password;
    this.isAdmin = false;
  }

  public void login(String email, String password) {

    if (email.equals(this.email) && password.equals(this.password)) {
      System.out.println("Login successful!");
    } else {
      System.out.println("Login failed!");
    }
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  public void setAdmin() {
    this.isAdmin = true;
  }

  public boolean isAdmin() {
    return isAdmin;
  }

  public void resetPassword(String newPassword) {
    this.password = newPassword;
  }

  public void logout() {
    System.out.println("Logout successfull!");
  }

}
