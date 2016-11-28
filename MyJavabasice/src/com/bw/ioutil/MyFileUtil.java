package com.bw.ioutil;

import java.io.File;

public class MyFileUtil {
	/**
	 * ����һ�����ļ�
     * ��������֮����d���»���һ������Ϊhello.txt���ļ���
	 * @param path ָ��Ҫ�������ļ�  
	 * @return
	 */
    public File createFile(String path){
//    	 File f=new File("D:\\hello.txt"); 
    	 File f=new File(path); 
    	 try{ 
    		 //����һ�����ļ�
    		 f.createNewFile();
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	return f; 
    }
    //ɾ��һ���ļ�
    public void deleteFile(File f){
   	 	//exists:���ڡ��ж�fʵ���е�hello.txt�ļ��Ƿ����
   	 	if(f.exists()){ 
   	 		//ɾ��hello.txt�ļ�
   	 		f.delete();
   	 	}else{  
   	 		System.out.println("�ļ�������");  
   	 	} 
   }
    //����һ���ļ���
    public void mkdirFile(File f){
    	//separator�൱�ڡ�\���ָ���
//    	String fileName="D:"+File.separator+"hello";
//    	File f=new File(fileName); 
    	// mkdir:DOS�������һ���µ���Ŀ¼;
    	f.mkdir();
   }
}
