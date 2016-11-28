package com.bw.ioutil;

import java.io.File;  
import java.io.FileInputStream;
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException;

public class TestFileWriter {
	
	private FileReader reader;
	private File file;
	
    private FileInputStream fis;
    private FileOutputStream fos;
    private byte[] bb;
	/**
	 * һ��
	 * ʹ���ַ�������ȡ�ʹ洢���ı��ļ���
	 * 
	 * �洢�ļ���Ҳ������һ���ļ���д���ݣ���Ȼ��д���Ǿ���Ҫʹ���������
	 * ��������д���Ǵ��ı��ļ�����������ʹ���ַ�����������
	 * Java api�ṩ������FileWriter��ôһ���࣬
	 * ���������ԣ�(��ȡ�ļ�ͬ��ʹ��FileReader��)
	 * @author Administrator
	 *
	 */
	/** 
     * DOC ���ļ����ȡ����. 
     * @param FileReaderpath ָ��Ҫ��ȡ���ļ�  
     */
    public void readFromFile(String FileReaderpath){  
    	// ָ��Ҫ��ȡ���ļ�  
        file = new File(FileReaderpath);
		try {
			// ��ȡ���ļ���������  
			reader = new FileReader(file);
			// ��������ÿ�ζ�ȡ�����ַ�  
	        char[] bb = new char[1024];
	        // ������ÿ�ζ�ȡ�����ַ�ƴ�ӣ���Ȼʹ��StringBuffer�����  
	        String str = "";
	        // ÿ�ζ�ȡ�����ַ�����  
	        int n;
	        while ((n = reader.read(bb)) != -1) {  
	            str += new String(bb, 0, n);  
	        }  
	        // �ر����������ͷ�����  
	        reader.close();
//	        System.out.println(str); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
    }  
  
    /**
     * DOC ���ļ���д������. 
     * @param FileWriterpath ������Ҫд����ı��ļ�new File("E:\\helloworld.txt")�е��ļ�·��
     * @param writerContent ������Ҫд����ı� 
     */
    public void writeToFile(String FileWriterpath,String writerContent){  
        //Ҫд����ı��ļ�
    	file = new File(FileWriterpath);
        // ����ļ������ڣ��򴴽����ļ�  
        try {
        	//exists:���ڡ��ж�fʵ���е�hello.txt�ļ��Ƿ����
            if (!file.exists()) {
            	//����һ�����ļ�
            	file.createNewFile();
            } 
         // ��ȡ���ļ��������  
         FileWriter writer = new FileWriter(file);
         // д����  
         writer.write(writerContent);
     	 // ��ջ�������������������������д���ļ���  
         writer.flush();
         // �ر��������ʩ����Դ  
         writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}  
    } 
    /**
     * ����
     * ʹ���ֽ�������ȡ�ʹ洢ͼƬ
     *  ����ʹ����������ȡͼƬ��Ϣ��Ȼ��ͨ�������д��ͼƬ��Ϣ��
     * @author Administrator
     * 
     */
    /**
     * DOC ��F���µ�test.jpg�ļ�����ȡ���ٴ浽E������. 
     * @param Fromepath ָ��Ҫ��ȡ��ͼƬ��·��
     * @param Topath ָ��Ҫд���ͼƬ��·��
     */
    public void TestIOStream(String Fromepath,String Topath){  
		try {
			// ָ��Ҫ��ȡ��ͼƬ  
			//new File("F:\\test.jpg")
			fis = new FileInputStream(new File(Fromepath));
			//"E:\\test.jpg"
	        file = new File(Topath);  
	        // ����ļ������ڣ��򴴽����ļ�  
	        if (!file.exists()) {
	            file.createNewFile();  
	        }  
	        // ָ��Ҫд���ͼƬ  
	        //"E:\\test.jpg"
	        fos = new FileOutputStream(new File(Topath));
	        // ÿ�ζ�ȡ���ֽڳ���  
	        int n = 0;
	        // �洢ÿ�ζ�ȡ������  
	        bb = new byte[1024];
	        while ((n = fis.read(bb)) != -1) {  
	        	// ����ȡ�����ݣ�д�뵽���������  
	        	fos.write(bb, 0, n);
	        }  
	        // �ر����������  
	        fos.close();
	        fis.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
    } 
}
