package A;//包名为A

import java.util.Scanner;//引入Scanner这个类，以便这个类创建对象，调用
class can{//新建一个方法类，
	public static void main(String args[]){
		String[]strings={"汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜"};
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


