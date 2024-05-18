package BuilderDesignPattern;

public class Dog {
    String name;
    String gender;
    int age;

    public static class DogBuilder {
        String name;
        String gender;
        int age;

        public DogBuilder setName(String name)
        {
            this.name = name;
            return this;
        }

        public DogBuilder setGender(String gender)
        {
            this.gender = gender;
            return this;
        }

        public DogBuilder setAge(int age)
        {
            this.age = age;
            return this;
        }

        public Dog build()
        {
            return new Dog(this);
        }
    }

    public Dog(DogBuilder builder)
    {
        this.age = builder.age;
        this.gender = builder.gender;
        this.name = builder.gender;
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', gender='" + gender + "'}";
    }

    public static void main(String[] args) {

        Dog dog = new Dog.DogBuilder().setName("Test").setGender("male").build();
        System.out.println(dog.toString());
    }
}


