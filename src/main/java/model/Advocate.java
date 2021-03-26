package model;

public final class Advocate extends Citizen implements Person {

    private String name;
    private String surname;
    private int age;
    private String address;
    private boolean married;

    public Advocate(){
        super("id");
    }

    public Advocate(String id, String name, String surname){
        super(id);
        this.name = name;
        this.surname = surname;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public boolean isMarried(){
        return married;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override()
    public boolean isUkrainian() {
        return true;
    }

    @Override
    public void run() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sit() {

    }

    @Override
    public String toString() {
        return "Advocate{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", married=" + married +
                '}';
    }
}
