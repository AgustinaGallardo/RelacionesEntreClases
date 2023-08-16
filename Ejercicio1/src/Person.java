public class Person {
    private String name;
    private String surname;
    private int age;
    private String document;
    private Dog dog;
    public Person() {
    }
    public Person(String name, String surname, int age, String document, Dog dog) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.document = document;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", document='" + document + '\'' +
                ", dog=" + dog +
                '}';
    }
}
