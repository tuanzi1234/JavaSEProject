package com.lbh.Demo2;

public class Control {
    //控制系统可将其设置成单例类
    private static Control control = new Control();
    private Control(){}
    public static Control getControl() {
        return control;
    }
    public static void printAllStatus(JD[] jds) {
        for (int i=0 ; i < jds.length ; i++){
            JD jd = jds[i];
            System.out.println((i + 1) + "." + jd.getName() + "开关状态：" + (jd.isStatus()? "开" : "关"));
        }
    }

    public void press(JD jd) {
        System.out.println(jd.getName() + "开关状态：" + (jd.isStatus()? "开" : "关"));
        System.out.println("开始操作中...");
        jd.press();
        System.out.println("操作完成");
        System.out.println(jd.getName() + "目前开关状态：" + (jd.isStatus()? "开" : "关"));
        System.out.println("==============================================");
    }
}
