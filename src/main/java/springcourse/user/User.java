package springcourse.user;

import springcourse.user.cars.Car;

public class User {
    private Car car;
    private String name;
    private int age;

    public User(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void userCar(){
        System.out.println("user have a" + car.getCarName());
    }
}
