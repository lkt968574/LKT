## 实验目的

掌握字符串String及其方法的使用

掌握异常处理结构

## 实验内容

利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。

* 1、每7个汉字加入一个标点符号，奇数加“，”，偶数加“。”。

* 2、允许提供输入参数，统计古诗中某个字或词出现的次数。

* 3、考虑操作中可能出现的异常，在程序中设计异常处理程序。

## 代码及注释

package A;//包名为A

import java.util.Scanner;//引入Scanner这个类，以便这个类创建对象，调用

class can{//新建一个方法类，

	public static void main(String args[]){
  
		String[]strings={"汉......夜"};//粘贴长恨歌
    
		A.main(strings);    
	}
}

public class A{

    public static void main(String args[]) {
    
        try {//新建一个异常检测
        
            if (args.length == 0) {
            
                throw new IllegalArgumentException("Please input 长恨歌");//接收长恨歌的字符串参数
            }
        } catch (IllegalArgumentException e) {
        
            System.err.println(e.getMessage());
        }
        String res = args[0];
        
        for(int i = 0; i < res.length(); i++){//创建循环语句用于后面字符串的整理
        
            char c = res.charAt(i);
            
            System.out.print(c);
            
            if((i + 1) % 14 == 0){//设置每14个字符添加一个句号
            
                System.out.println("。");
                
                continue;
            }
            if((i + 1) % 7 == 0)//设置每7个字符添加一个逗号
            
                System.out.print(",");
        }

        System.out.println("请输入想要查找的字符串或者字符：");
        
        Scanner scanner = new Scanner(System.in);//新建一个Scanner方法，用于接收输入的信息，查找的字符
        
        String find = scanner.nextLine();
        
        countString(res, find);

    }

    private static void countString(String str,String s) {
    
        int count = 0;
        
        while(str.indexOf(s) != -1){//用于字符串的截取

            str = str.substring(str.indexOf(s)+1,str.length());
            
            count++;

        }
        System.out.println(s+"出现的次数为"+count+"次");
    }
}

## 实验效果
![image](https://github.com/lkt968574/LKT/blob/master/1.jpg)

## 实验心得
通过这次字符串实验，我基本了解了字符串String的方法和使用。

还学习了利用main方法中的args数组传递。看似简单的程序，做起

来却存在不少问题，编程过程中出现了很多小错误，在同学的帮助

下，多次查改后，最终成功运行程序。使我再次认识到自己的不足，

今后我会更加注重实践，勤学多练，用积累来提高自己。
