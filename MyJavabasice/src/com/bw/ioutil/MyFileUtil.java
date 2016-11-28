package com.bw.ioutil;

import java.io.File;

public class MyFileUtil {
	/**
	 * 创建一个新文件
     * 程序运行之后，在d盘下会有一个名字为hello.txt的文件。
	 * @param path 指定要创建的文件  
	 * @return
	 */
    public File createFile(String path){
//    	 File f=new File("D:\\hello.txt"); 
    	 File f=new File(path); 
    	 try{ 
    		 //创建一个新文件
    		 f.createNewFile();
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	return f; 
    }
    //删除一个文件
    public void deleteFile(File f){
   	 	//exists:存在。判断f实例中的hello.txt文件是否存在
   	 	if(f.exists()){ 
   	 		//删除hello.txt文件
   	 		f.delete();
   	 	}else{  
   	 		System.out.println("文件不存在");  
   	 	} 
   }
    //创建一个文件夹
    public void mkdirFile(File f){
    	//separator相当于“\”分隔符
//    	String fileName="D:"+File.separator+"hello";
//    	File f=new File(fileName); 
    	// mkdir:DOS命令：建立一个新的子目录;
    	f.mkdir();
   }
}
