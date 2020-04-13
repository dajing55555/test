package com.monitor.listener;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

public class GlobalListener implements ServletContextListener{

	
	private static final Logger log = Logger.getLogger(GlobalListener.class);

	
	public void contextInitialized(ServletContextEvent arg0) {
		
		try{
			//==================================================
			//               获取运行参数
			//==================================================
			Runtime runtime = Runtime.getRuntime(); 
			log.info("正在获取当前程序运行环境参数信息(以下参数受限于Web服务器参数配置)！");
			if(runtime!=null){
				log.info(" 最大可用内存(M): "+runtime.maxMemory()/1024/1024+"M"); 
				log.info(" 当前已初始化内存(M): "+runtime.totalMemory()/1024/1024+"M"); 
				log.info(" 剩余可用内存(M): "+runtime.freeMemory()/1024/1024+"M"); 
				log.info(" CPU内核(个): "+runtime.availableProcessors()+""); 
			}
			
			String javaVer = System.getProperty("java.version");
			javaVer = javaVer == null ?"":javaVer.trim();
			log.info(" Java 版本："+javaVer);
			
			//==================================================
			//               获取spring相关配置文件
			//==================================================
			
			//==================================================
			//               获取所有.peoperties相关配置文件
			//==================================================
			
			//==================================================
			//               获取所有sql语句xml相关配置文件
			//==================================================
			
			
						
		}catch (Exception e) {
			e.printStackTrace();
			log.error("获取运行环境参数异常："+e.getLocalizedMessage());
		}
	}

	
	public void contextDestroyed(ServletContextEvent arg0) {
		
		log.info(arg0);
	}

	/*public static void main(String[] args) {
		
		//E:\eclipse-for-web\eclipse\workspace\ssmRedis
		//获取当前路径
		System. out .println("user.dir path: " + System.getProperty ("user.dir")); 
		//WEB-INF/classes/spring
		System.out.println(System.getProperty ("user.dir")+File.separator+"WEB-INF"+File.separator+"classes"+File.separator+"spring");
		File root = new File(System.getProperty ("user.dir"));
        File[] files = root.listFiles();
        for ( File file : files ){
        
        	System.out.println(file.getName());
        }
	}*/
}
