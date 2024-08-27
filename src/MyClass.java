public class MyClass {
    private String firstName;
    private String lastName;
    private int age;
    private String favoriteFood;

    public MyClass() {
        this.firstName = "Joske";
        this.lastName = "Filip";
        this.age = 34;
        this.favoriteFood = "Nun to eat";
    }

    public MyClass(String firstName, String lastName, int age, String favfood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favoriteFood = favfood;
    }

    public void printInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("age: " + age);
        System.out.println("favfood: " + favoriteFood);
    }
}