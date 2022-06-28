public class Runner {
    public static void main(String[] args) {
        // your code here

        User sercan = new User("sercan@gmail.com", "secret");
        sercan.login("sercan@gmail.com", "wrongsecret");
        sercan.login("sercan@gmail.com", "secret");
        User instanceAuthor = new Author("james@gmail.com", "secret2");
        // prints class Author
        System.out.println(instanceAuthor.getClass().toString());
        Author james = (Author) instanceAuthor;
        james.login("james@gmail.com", "secret2");
        james.createPost();
        james.createPost();
        james.createPost();
        james.getNumOfPosts();
        var ronaldo = new Admin("ronaldo@gmail.com", "secret3");
        ronaldo.login("ronaldo@gmail.com", "secret3");
        ronaldo.removeUser();
    }
}
