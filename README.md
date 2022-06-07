# Inheritance Lab

## Learning Goals

- Create class hierarchy using inheritance

## Instructions

Using an example from your daily life (that doesn't have to do with animals),
design your own class hierarchy that has 1 base class and at least 2 subclasses.
As you design this structure, keep the following in mind:

- These are simplified examples, so all class actions can simply print out what
  they're doing without worrying about actually implementing behavior
- Your class hierarchy should make sense - for example, having a base class of
  `Car` that has a `fly()` method would not make sense
- Have a "Runner" class that instantiates your classes and calls your actions -
  this is a good way to make sure your output makes sense

Here an example "Runner" class for the sample classes we introduced in this
section:

```java
public class AnimalRunner {
    public static void main(String[] args) {
        System.out.println("Running my animal examples");
        Animal baseAnimal = new Animal();
        baseAnimal.takeBreath();
        Cat myCat = new Cat();
        myCat.takeBreath();
        myCat.useLitter();
        Parrot myParrot = new Parrot();
        myParrot.takeBreath();
        myParrot.startFlying();
        myParrot.stopFlying();
    }
}
```

Running this class will give you the following output:

```plaintext
Running my animal examples
I took a breath
I took a breath
I just used the litter - I'm a clean cat!
I took a breath
I'm flying - weeee!!!
Coming down for a landing!
```
