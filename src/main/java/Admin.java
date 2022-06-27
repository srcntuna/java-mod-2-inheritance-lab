public class Admin extends User {

  public Admin(String email, String password) {
    super(email, password);

  }

  @Override
  public void login(String email, String password) {

    String inputEmail = this.getEmail();
    String inputPassword = this.getPassword();
    this.setAdmin();

    if (email.equals(inputEmail) && password.equals(inputPassword) && this.isAdmin()) {

      System.out.println("Admin is here!! Login Successfull");
    } else {
      System.out.println("Login Failed");
    }

  }

  public void removeUser() {
    System.out.println("A user has been removed");
  }

}
