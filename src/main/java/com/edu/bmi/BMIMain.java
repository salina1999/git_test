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
 
        // classpath => src/main/resources�� ����Ų��.
        String conf    = "classpath:ApplicationContext.xml";
        
        // ������ �����̳ʰ� �����ȴ�.
        ApplicationContext ctx = new GenericXmlApplicationContext(conf);
        
        // ������ �����̳ʿ����� ������Ʈ�� �����´�.
        MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
        myInfo.getInfo();
        
        // ������ �����̳ʸ� �����Ѵ�.
        // ctx.close();
        
    } // End - public static void main(String[] args)
} // End - public class BMIMain
