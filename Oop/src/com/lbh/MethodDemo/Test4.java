package com.lbh.MethodDemo;


public class Test4 {
    public static void main(String[] args) {
        // 认识构造器引用
//        CarFactory carFactory = new CarFactory() {
//            @Override
//            public Car create(String name) {
//                return new Car(name);
//            }
//        };
        //上述方法可简写成:
        //CarFactory carFactory = (String name) -> {return new Car(name);};
        //继续简化：
//        CarFactory carFactory = name -> new Car(name);
        //根据构造器引用简化，可继续简化为：
        CarFactory carFactory = Car::new;

        Car car = carFactory.create("保时捷");
        System.out.println(car.name);
    }
}

interface CarFactory {
    Car create(String name);
}
class Car{
    String name;

    public Car(String s) {
        this.name = s;
    }
}