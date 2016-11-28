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
	 * 一、
	 * 使用字符流，读取和存储纯文本文件。
	 * 
	 * 存储文件，也就是像一个文件里写内容，既然是写，那就需要使用输出流。
	 * 而且我们写的是纯文本文件，所以这里使用字符流来操作，
	 * Java api提供给我们FileWriter这么一个类，
	 * 我们来试试：(读取文件同理使用FileReader类)
	 * @author Administrator
	 *
	 */
	/** 
     * DOC 从文件里读取数据. 
     * @param FileReaderpath 指定要读取的文件  
     */
    public void readFromFile(String FileReaderpath){  
    	// 指定要读取的文件  
        file = new File(FileReaderpath);
		try {
			// 获取该文件的输入流  
			reader = new FileReader(file);
			// 用来保存每次读取到的字符  
	        char[] bb = new char[1024];
	        // 用来将每次读取到的字符拼接，当然使用StringBuffer类更好  
	        String str = "";
	        // 每次读取到的字符长度  
	        int n;
	        while ((n = reader.read(bb)) != -1) {  
	            str += new String(bb, 0, n);  
	        }  
	        // 关闭输入流，释放连接  
	        reader.close();
//	        System.out.println(str); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
    }  
  
    /**
     * DOC 往文件里写入数据. 
     * @param FileWriterpath 参数是要写入的文本文件new File("E:\\helloworld.txt")中的文件路径
     * @param writerContent 参数是要写入的文本 
     */
    public void writeToFile(String FileWriterpath,String writerContent){  
        //要写入的文本文件
    	file = new File(FileWriterpath);
        // 如果文件不存在，则创建该文件  
        try {
        	//exists:存在。判断f实例中的hello.txt文件是否存在
            if (!file.exists()) {
            	//创建一个新文件
            	file.createNewFile();
            } 
         // 获取该文件的输出流  
         FileWriter writer = new FileWriter(file);
         // 写内容  
         writer.write(writerContent);
     	 // 清空缓冲区，立即将输出流里的内容写到文件里  
         writer.flush();
         // 关闭输出流，施放资源  
         writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}  
    } 
    /**
     * 二、
     * 使用字节流，读取和存储图片
     *  首先使用输入流读取图片信息，然后通过输出流写入图片信息：
     * @author Administrator
     * 
     */
    /**
     * DOC 将F盘下的test.jpg文件，读取后，再存到E盘下面. 
     * @param Fromepath 指定要读取的图片的路径
     * @param Topath 指定要写入的图片的路径
     */
    public void TestIOStream(String Fromepath,String Topath){  
		try {
			// 指定要读取的图片  
			//new File("F:\\test.jpg")
			fis = new FileInputStream(new File(Fromepath));
			//"E:\\test.jpg"
	        file = new File(Topath);  
	        // 如果文件不存在，则创建该文件  
	        if (!file.exists()) {
	            file.createNewFile();  
	        }  
	        // 指定要写入的图片  
	        //"E:\\test.jpg"
	        fos = new FileOutputStream(new File(Topath));
	        // 每次读取的字节长度  
	        int n = 0;
	        // 存储每次读取的内容  
	        bb = new byte[1024];
	        while ((n = fis.read(bb)) != -1) {  
	        	// 将读取的内容，写入到输出流当中  
	        	fos.write(bb, 0, n);
	        }  
	        // 关闭输入输出流  
	        fos.close();
	        fis.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
    } 
}
