package com.bw.ioutil;

import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.File;  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException; 

import java.io.BufferedInputStream;  
import java.io.BufferedOutputStream;  
import java.io.FileInputStream;  
import java.io.FileOutputStream; 

public class TestBuffered { 
	
    private BufferedReader bufferedReader;
    private File file;
    private BufferedWriter bufferedWriter;
    
    private BufferedInputStream bis;
    private BufferedOutputStream out;
    private byte[] bb;
    /**
     * 一、
     * 通过BufferedReader和BufferedWriter来读写文件
     * 使用缓冲流的好处是，能够更高效的读写信息，
     * 原理是将数据先缓冲起来，然后一起写入或者读取出来。
     * 经常使用的是readLine()方法，表示一次读取一行数据。
     * @author Administrator
     *
     */
    /** 
     * DOC 读取信息.  
     * @param bufferedReaderpath 指定要读取的文件 的路径
     */
    public void read(String bufferedReaderpath) {  
    	// 指定要读取的文件  
    	//"E:\\a.txt"
    	file = new File(bufferedReaderpath);
		try {
			// 获得该文件的缓冲输入流  
			bufferedReader = new BufferedReader(new FileReader(file));
	        // 用来保存每次读取一行的内容  
	        String line = "";
	        while ((line = bufferedReader.readLine()) != null) {  
	            System.out.println(line);  
	        }  
	        // 关闭输入流  
	        bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  
    }  
  
    /** 
     * DOC 写入信息.
     * @param bufferedWriterpath 指定要写入的文件的路径
     * @param text 要写入的信息
     */
    public void write(String bufferedWriterpath,String text) {  
    	// 指定要写入的文件
    	//"E:\\a.txt"
        file = new File(bufferedWriterpath);
		try {
			// 如果文件不存在则创建  
	        if (!file.exists()) {
	            file.createNewFile();  
	        }  
	        // 获取该文件的缓冲输出流  
			bufferedWriter = new BufferedWriter(new FileWriter(file));
	        // 写入信息  
	        bufferedWriter.write(text);  
	        bufferedWriter.newLine();// 表示换行  
//	        bufferedWriter.write("hello world");  
	        bufferedWriter.flush();// 清空缓冲区  
	        bufferedWriter.close();// 关闭输出流  
		} catch (IOException e) {
			e.printStackTrace();
		}
    } 
    
    /**
     * 二、
     * 使用BufferedInputStream和BufferedOuputStream读写图片
     * 使用方式和FileInputStrem和FileOutputStream基本一致：
     * 
     */
    
    /**
     * 读写图片
     * @param inputStreampath 指定要读取文件的缓冲输入字节流路径
     * @param outputStreampath 指定要写入文件的缓冲输出字节流 
     */
    public void TestBufferedString(String inputStreampath,String outputStreampath) {  
		try {
			// 指定要读取文件的缓冲输入字节流  
			//"F:\\test.jpg"
			bis = new BufferedInputStream(new FileInputStream(inputStreampath));
			//"E:\\test.jpg"
		    file = new File(outputStreampath);  
		        if (file != null) {  
		            file.createNewFile();  
		        }  
		        // 指定要写入文件的缓冲输出字节流  
		        out = new BufferedOutputStream(new FileOutputStream(file));  
		        // 用来存储每次读取到的字节数组  
		        bb = new byte[1024];
		        // 每次读取到的字节数组的长度  
		        int n;
		        while ((n = bis.read(bb)) != -1) {  
		        	// 写入到输出流  
		            out.write(bb, 0, n);
		        }  
		        // 关闭流  
		        out.close();
		        bis.close();  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  
 
    } 
}
