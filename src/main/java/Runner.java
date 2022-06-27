public class Runner {
    public static void main(String[] args) {
        // your code here
        var sercan = new User("sercan@gmail.com", "secret");
        sercan.login("sercan@gmail.com", "wrongsecret");
        sercan.login("sercan@gmail.com", "secret");
        var james = new Author("james@gmail.com", "secret2");
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
