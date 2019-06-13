package model;

/**
 * Created by KingsWong on 2019/6/13.
 */
public class Animal {
    private int age;
    private double weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animals eat");
    }

    public void run(){
        System.out.println("Animals run");
    }
}
