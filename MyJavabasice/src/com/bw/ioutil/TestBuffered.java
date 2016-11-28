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
     * һ��
     * ͨ��BufferedReader��BufferedWriter����д�ļ�
     * ʹ�û������ĺô��ǣ��ܹ�����Ч�Ķ�д��Ϣ��
     * ԭ���ǽ������Ȼ���������Ȼ��һ��д����߶�ȡ������
     * ����ʹ�õ���readLine()��������ʾһ�ζ�ȡһ�����ݡ�
     * @author Administrator
     *
     */
    /** 
     * DOC ��ȡ��Ϣ.  
     * @param bufferedReaderpath ָ��Ҫ��ȡ���ļ� ��·��
     */
    public void read(String bufferedReaderpath) {  
    	// ָ��Ҫ��ȡ���ļ�  
    	//"E:\\a.txt"
    	file = new File(bufferedReaderpath);
		try {
			// ��ø��ļ��Ļ���������  
			bufferedReader = new BufferedReader(new FileReader(file));
	        // ��������ÿ�ζ�ȡһ�е�����  
	        String line = "";
	        while ((line = bufferedReader.readLine()) != null) {  
	            System.out.println(line);  
	        }  
	        // �ر�������  
	        bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  
    }  
  
    /** 
     * DOC д����Ϣ.
     * @param bufferedWriterpath ָ��Ҫд����ļ���·��
     * @param text Ҫд�����Ϣ
     */
    public void write(String bufferedWriterpath,String text) {  
    	// ָ��Ҫд����ļ�
    	//"E:\\a.txt"
        file = new File(bufferedWriterpath);
		try {
			// ����ļ��������򴴽�  
	        if (!file.exists()) {
	            file.createNewFile();  
	        }  
	        // ��ȡ���ļ��Ļ��������  
			bufferedWriter = new BufferedWriter(new FileWriter(file));
	        // д����Ϣ  
	        bufferedWriter.write(text);  
	        bufferedWriter.newLine();// ��ʾ����  
//	        bufferedWriter.write("hello world");  
	        bufferedWriter.flush();// ��ջ�����  
	        bufferedWriter.close();// �ر������  
		} catch (IOException e) {
			e.printStackTrace();
		}
    } 
    
    /**
     * ����
     * ʹ��BufferedInputStream��BufferedOuputStream��дͼƬ
     * ʹ�÷�ʽ��FileInputStrem��FileOutputStream����һ�£�
     * 
     */
    
    /**
     * ��дͼƬ
     * @param inputStreampath ָ��Ҫ��ȡ�ļ��Ļ��������ֽ���·��
     * @param outputStreampath ָ��Ҫд���ļ��Ļ�������ֽ��� 
     */
    public void TestBufferedString(String inputStreampath,String outputStreampath) {  
		try {
			// ָ��Ҫ��ȡ�ļ��Ļ��������ֽ���  
			//"F:\\test.jpg"
			bis = new BufferedInputStream(new FileInputStream(inputStreampath));
			//"E:\\test.jpg"
		    file = new File(outputStreampath);  
		        if (file != null) {  
		            file.createNewFile();  
		        }  
		        // ָ��Ҫд���ļ��Ļ�������ֽ���  
		        out = new BufferedOutputStream(new FileOutputStream(file));  
		        // �����洢ÿ�ζ�ȡ�����ֽ�����  
		        bb = new byte[1024];
		        // ÿ�ζ�ȡ�����ֽ�����ĳ���  
		        int n;
		        while ((n = bis.read(bb)) != -1) {  
		        	// д�뵽�����  
		            out.write(bb, 0, n);
		        }  
		        // �ر���  
		        out.close();
		        bis.close();  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  
 
    } 
}
