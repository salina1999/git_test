package com.edu.bmi;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
 
//-------------------------------------------------------------------------------------------------
// public class BMIMain
//-------------------------------------------------------------------------------------------------
public class BMIMain {
 
    //-------------------------------------------------------------------------------------------------
    // public static void main(String[] args)
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
 
        // classpath => src/main/resources를 가리킨다.
        String conf    = "classpath:ApplicationContext.xml";
        
        // 스프링 컨테이너가 형성된다.
        ApplicationContext ctx = new GenericXmlApplicationContext(conf);
        
        // 스프링 컨네이너에서서 컴포넌트를 가져온다.
        MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
        myInfo.getInfo();
        
        // 스프링 컨테이너를 종료한다.
        // ctx.close();
        
    } // End - public static void main(String[] args)
} // End - public class BMIMain
