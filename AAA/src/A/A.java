package A;//����ΪA

import java.util.Scanner;//����Scanner����࣬�Ա�����ഴ�����󣬵���
class can{//�½�һ�������࣬
	public static void main(String args[]){
		String[]strings={"������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ"};
		A.main(strings);
	}
}
public class A{
    public static void main(String args[]) {
        try {//�½�һ���쳣���
            if (args.length == 0) {
                throw new IllegalArgumentException("Please input ���޸�");//���ճ��޸���ַ�������
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        String res = args[0];
        for(int i = 0; i < res.length(); i++){//����ѭ��������ں����ַ���������
            char c = res.charAt(i);
            System.out.print(c);
            if((i + 1) % 14 == 0){//����ÿ14���ַ����һ�����
                System.out.println("��");
                continue;
            }
            if((i + 1) % 7 == 0)//����ÿ7���ַ����һ������
                System.out.print(",");
        }

        System.out.println("��������Ҫ���ҵ��ַ��������ַ���");
        Scanner scanner = new Scanner(System.in);//�½�һ��Scanner���������ڽ����������Ϣ�����ҵ��ַ�
        String find = scanner.nextLine();
        countString(res, find);

    }

    private static void countString(String str,String s) {
        int count = 0;
        while(str.indexOf(s) != -1){//�����ַ����Ľ�ȡ

            str = str.substring(str.indexOf(s)+1,str.length());
            count++;

        }
        System.out.println(s+"���ֵĴ���Ϊ"+count+"��");
    }
}


