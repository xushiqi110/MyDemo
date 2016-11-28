package com.bw.activity;

import com.bw.ioutil.TestBuffered;
import com.example.myjavabasice.R;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
	
	private byte mynumber;
	private int myfate;
	private static int mytopint;
	
	
    private int mint=1;
    private byte mbyte;
    private short mshort;
    private long mlong;

    private float mfloat;
    private double mdouble;

    private String mstring;
    private char mchar;

    private boolean mboolean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //java���ݵ�����ת��
        mynumber=1;
        MyToTop(mynumber);
        //java��������ת��
        MyTobottom();
        //������
        int money=13000;
        MyAccumulationFund(money);
        //���ַ�
        init();  
        int num =array[40]; 
        MyDichotomy(num);
        //io��
        MyIOFlow(mint);
        //�ݹ�
        myfate=1;
        MyRecursion(myfate);
    }
    /**
     * ���ݵ�����ת��
     */
    private static void MyToTop(byte num){
    	System.out.println("****************Java���ݵ�����ת��****************"); 
    	MainActivity main=new MainActivity();
    	//��̬������ͨ��ʵ�����÷Ǿ�̬�ı���
    	main.mbyte=num;
    	System.out.println(main.mbyte+"����");
    	main.mshort=main.mbyte;
    	System.out.println(main.mshort+"����");
    	//��̬�����п���ֱ�ӵ��þ�̬�ı���,
    	mytopint=main.mshort;
    	System.out.println(mytopint+"����");
    	main.mlong=mytopint;
    	System.out.println(main.mlong+"����");
    	main.mfloat=mytopint;
    	System.out.println(main.mfloat+"����");
    	main.mdouble=main.mfloat;
    	System.out.println(main.mdouble+"����");
    }
    /**
     * ���ݵ�����ת��
     */
    private static void MyTobottom(){
    	System.out.println("****************Java���ݵ�����ǿ��ת��****************"); 
    	double b1=1.0;
    	System.out.println(b1+"����");
    	float b2=(float) b1;
    	System.out.println(b2+"����");
    	long b3=(long) b2;
    	System.out.println(b3+"����");
    	int b4=(int) b3;
    	System.out.println(b4+"����");
    	short b5=(short) b4;
    	System.out.println(b5+"����");
    	byte b6=(byte) b5;
    	System.out.println(b6+"����");
    }
    /**
     * ������
     * ˰ǰ�¹��ʡ�10����12����2����λ�����ˣ���
     * ����˰ǰ�¹���5000����������10����
     * ���¹�����=5000��10����2��1000�����е�λ�͸��˸�500��
     */
    private static void MyAccumulationFund(int num){
    	System.out.println("****************������ǹ�����****************"); 
    	System.out.println("������"+"="+(num*10)/100*2);
    }
    /**
     * IO����д�ļ�
     */
    private void MyIOFlow(int num){
    	System.out.println("****************�������IO����д�ļ�****************"); 
    	TestBuffered tb=new TestBuffered();
    	String path="D:/a.txt";
    	String text="�������";
    	tb.write(path, text);
    	tb.read(path);
    }

    /**
     * ���ַ�
     */
    int[] array = null;  
    int count = 0; // �ȽϵĴ���  
      
    public void init(){  
        array = new int[100];  
        System.out.println("****************��ʼ������****************");  
        for (int i = 0; i < array.length; i++) {  
            array[i] = i+1;  
        }  
    } 
    private void MyDichotomy(int num){
    	/**
    	 * ���ַ��Ƕ�һ����������ݣ��Ӵ�С���С���󣩽��в�ѯ��
    	 * 1����ȡ��С��start�����±�����end�����±���ӳ���2�õ����м���±꣨index����ֵ((start+end)/2=index)��Ҫ��ѯ������num���бȽϣ�
    	 * ���ֵС��num���м�ֵ���¾Ͳ��ò�ѯ�ˣ�Ȼ���ȡ������м��±긳��start���ټ���(start+end)/2=index���б���;�������num��
    	 * �м�ֵ���ϵ�����Ҳ���ò�ѯ�ˣ�Ȼ���ȡ������м��±긳��end���ټ���(start+end)/2=index���б���;�����Ⱦ��������ѭ��
    	 */
        System.out.println("****************ʹ�ö��ַ�����****************");  
        int index = 0; // ������ʱ��  
        int start = 0;  //��start��end���������������Ĳ�ѯ��Χ  
        int end = array.length - 1;  
        count = 0;  
        for (int i = 0; i < array.length; i++){   
            count++;  
            index = (start + end) / 2;  
            if(array.length - 1 == i){  
                System.out.println("��Ǹ��û���ҵ�");  
            }else if (array[index] < num){
            	System.out.println(array[index] + "��С�ˣ��������±�Ϊ" + index + "�ĵط�,С��num,������" + count + "�Ρ�");
                start = index;  
            }else if (array[index] > num){
            	System.out.println(array[index] + "�����ˣ��������±�Ϊ" + index + "�ĵط�,����num,������" + count + "�Ρ�");
                end = index;  
            }else{  
                System.out.println(array[index] + "�ҵ��ˣ��������±�Ϊ" + index + "�ĵط�,������" + count + "�Ρ�");  
                break;  
            }  
        }  
        System.out.println("count===="+count);;  
    }
    /**
     * �ݹ�
     */
    private static void MyRecursion(int num){
    	System.out.println("****************������ǵݹ����****************"); 
        if (num<10) {
            System.out.println(num + "�ݹ�С��10");
            num++;
            MyRecursion(num);
        }else{
        	System.out.println(num + "�ݹ����10");
        }
    }
}
