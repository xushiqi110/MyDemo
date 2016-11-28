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
        //java数据的向上转化
        mynumber=1;
        MyToTop(mynumber);
        //java数据向下转化
        MyTobottom();
        //公积金
        int money=13000;
        MyAccumulationFund(money);
        //二分法
        init();  
        int num =array[40]; 
        MyDichotomy(num);
        //io流
        MyIOFlow(mint);
        //递归
        myfate=1;
        MyRecursion(myfate);
    }
    /**
     * 数据的向上转化
     */
    private static void MyToTop(byte num){
    	System.out.println("****************Java数据的向上转化****************"); 
    	MainActivity main=new MainActivity();
    	//静态方法中通过实例掉用非静态的变量
    	main.mbyte=num;
    	System.out.println(main.mbyte+"向上");
    	main.mshort=main.mbyte;
    	System.out.println(main.mshort+"向上");
    	//静态方法中可以直接调用静态的变量,
    	mytopint=main.mshort;
    	System.out.println(mytopint+"向上");
    	main.mlong=mytopint;
    	System.out.println(main.mlong+"向上");
    	main.mfloat=mytopint;
    	System.out.println(main.mfloat+"向上");
    	main.mdouble=main.mfloat;
    	System.out.println(main.mdouble+"向上");
    }
    /**
     * 数据的向下转化
     */
    private static void MyTobottom(){
    	System.out.println("****************Java数据的向下强行转化****************"); 
    	double b1=1.0;
    	System.out.println(b1+"向下");
    	float b2=(float) b1;
    	System.out.println(b2+"向下");
    	long b3=(long) b2;
    	System.out.println(b3+"向下");
    	int b4=(int) b3;
    	System.out.println(b4+"向下");
    	short b5=(short) b4;
    	System.out.println(b5+"向下");
    	byte b6=(byte) b5;
    	System.out.println(b6+"向下");
    }
    /**
     * 公积金
     * 税前月工资×10％至12％×2（单位＋个人），
     * 例：税前月工资5000，公积金率10％，
     * 则月公积金=5000×10％×2＝1000，其中单位和个人各500。
     */
    private static void MyAccumulationFund(int num){
    	System.out.println("****************输出的是公积金****************"); 
    	System.out.println("公积金"+"="+(num*10)/100*2);
    }
    /**
     * IO流读写文件
     */
    private void MyIOFlow(int num){
    	System.out.println("****************输出的是IO流读写文件****************"); 
    	TestBuffered tb=new TestBuffered();
    	String path="D:/a.txt";
    	String text="你好世界";
    	tb.write(path, text);
    	tb.read(path);
    }

    /**
     * 二分法
     */
    int[] array = null;  
    int count = 0; // 比较的次数  
      
    public void init(){  
        array = new int[100];  
        System.out.println("****************初始化数组****************");  
        for (int i = 0; i < array.length; i++) {  
            array[i] = i+1;  
        }  
    } 
    private void MyDichotomy(int num){
    	/**
    	 * 二分法是对一组有序的数据（从大到小或从小到大）进行查询。
    	 * 1、先取最小（start）的下标和最大（end）的下标相加除以2得到最中间的下标（index）的值((start+end)/2=index)和要查询的数据num进行比较，
    	 * 如果值小于num则中间值以下就不用查询了，然后获取到这个中间下标赋给start，再计算(start+end)/2=index进行遍历;如果大于num则
    	 * 中间值以上的数据也不用查询了，然后获取到这个中间下标赋给end，再计算(start+end)/2=index进行遍历;如果相等就输出结束循环
    	 */
        System.out.println("****************使用二分法查找****************");  
        int index = 0; // 检索的时候  
        int start = 0;  //用start和end两个索引控制它的查询范围  
        int end = array.length - 1;  
        count = 0;  
        for (int i = 0; i < array.length; i++){   
            count++;  
            index = (start + end) / 2;  
            if(array.length - 1 == i){  
                System.out.println("抱歉，没有找到");  
            }else if (array[index] < num){
            	System.out.println(array[index] + "数小了，在数组下标为" + index + "的地方,小于num,遍历了" + count + "次。");
                start = index;  
            }else if (array[index] > num){
            	System.out.println(array[index] + "数大了，在数组下标为" + index + "的地方,大于num,遍历了" + count + "次。");
                end = index;  
            }else{  
                System.out.println(array[index] + "找到了，在数组下标为" + index + "的地方,查找了" + count + "次。");  
                break;  
            }  
        }  
        System.out.println("count===="+count);;  
    }
    /**
     * 递归
     */
    private static void MyRecursion(int num){
    	System.out.println("****************输出的是递归遍历****************"); 
        if (num<10) {
            System.out.println(num + "递归小于10");
            num++;
            MyRecursion(num);
        }else{
        	System.out.println(num + "递归大于10");
        }
    }
}
