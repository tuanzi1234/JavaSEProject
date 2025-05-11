package com.lbh.EnumDemo;

public class Test2 {
    public static void main(String[] args) {
       // 枚举类的应用场景，信息的分类和标志
        // 需求：模拟上下左右移动
        //方案一：用常量做信息分类和标识: 缺点：参数值不受约束
        move( Constant.UP);
        //方案二：用枚举做信息分类和标识: 参数值会收到约束
        move2(Direction.RIGHT);
    }
    public static void move(int direction){
        switch (direction){
            case Constant.UP:
                System.out.println("向上移动");
                break;
            case Constant.DOWN:
                System.out.println("向下移动");
                break;
            case Constant.LEFT:
                System.out.println("向左移动");
                break;
            case Constant.RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效操作");
                break;
        }

    }
    public static void move2(Direction direction){
        switch (direction){
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效操作");
                break;
        }

    }
}
