package com.lbh.Clannad;

public class ClannadService {
    public void clannad(Clannad clannad) {
        /*
          处理clannad对象中的a、b字段并输出转换结果
          处理逻辑：将字符串按每3个数字字符转换为对应的ASCII字符
          输出说明：分别输出a和b字段的处理结果
         */
// 初始化a、b字段及结果存储容器
        String a = clannad.getA();
        String b = clannad.getB();
        StringBuilder[] results ={
                new StringBuilder(), // 存储字段a的转换结果
                new StringBuilder()  // 存储字段b的转换结果
        };

// 合并处理逻辑：同时处理a、b两个字段
        String[] stringsToProcess = {a, b};
        for (int idx = 0; idx < stringsToProcess.length; idx++) {
            String str = stringsToProcess[idx];//获取待处理字符串数组中当前索引位置的字符串元素
            StringBuilder currentResult = results[idx];//获取结果数组中对应的StringBuilder容器用于累积处理结果

            // 核心转换逻辑：每3个数字字符转ASCII字符
            for (int i = 0; i < str.length(); i += 3) {
                String key = str.substring(i, i + 3);
                currentResult.append((char) Integer.parseInt(key));
            }
        }

// 输出两个字段的转换结果
        System.out.println(results[0]); // 输出字段a的转换结果
        System.out.println(results[1]); // 输出字段b的转换结果

    }
}
