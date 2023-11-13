// Source code is decompiled from a .class file using FernFlower decompiler.
abstract class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String var1, int var2, String var3) {
        this.name = var1;
        this.age = var2;
        this.gender = var3;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public abstract void displayInfo();

    public abstract String toString();
}
