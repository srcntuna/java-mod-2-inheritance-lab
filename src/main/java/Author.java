public class Author extends User {

  private int numOfPosts;

  public Author(String email, String password) {
    super(email, password);
    this.numOfPosts = 0;
  }

  public void createPost() {
    this.numOfPosts++;
  }

  public int getNumOfPosts() {
    return this.numOfPosts;
  }

}
