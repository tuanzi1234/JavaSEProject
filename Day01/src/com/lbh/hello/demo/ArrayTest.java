package com.lbh.hello.demo;

public class ArrayTest {
    public static void main(String[] args) {
        //完成数字华容道的游戏中数字的生成，与数字的打乱
        start(4);
    }
    public static void start(int n){
        //定义二维数组存储数字
        int[][] array = new int[n][n];
        //遍历二维数组，给二维数组赋值
        int count = 1;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = count++;
            }
        }
        printArray(array);//打印二维数组
        //打乱二维数组的数字
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                //遍历到array[i][j]
                //随机的索引位置：index1（行）和index2（列）
                int index1 = (int)(Math.random() * array.length);
                int index2 = (int)(Math.random() * array.length);

                //定义临时的变量存储index1,index2处的元素
                int temp = array[index1][index2];
                //将i,j的元素赋给index1,index2
                array[index1][index2] = array[i][j];
                //将存放index1,index2处元素的临时变量赋给i,j
                array[i][j] = temp;
            }
        }
        System.out.println("洗牌后的牌为：");
        printArray(array);
    }
    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
