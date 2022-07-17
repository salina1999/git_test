package com.edu.exam1;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
//-------------------------------------------------------------------------------------------------
// public class ExamController1
// @Controller : ExamController1 Ŭ������ ��Ʈ�ѷ��� �����ϴ� �ֳ����̼��̴�.
// @RequestMapping("/exam01") : /exam01�� �����ϴ� URL�� ó���ϰڴٴ� ���� ����� ���̴�.
//-------------------------------------------------------------------------------------------------
@Controller
@RequestMapping("/exam01")
public class ExamController1 {
 
    //-------------------------------------------------------------------------------------------------
    // public void doA() : void Ÿ�� : return Ÿ���� ���� ���
    // localhost:8099/exam01/doA
    // void Ÿ���� ��� ���� ���� ���� ��ſ� @RequestMapping���� ������ URL�� �ش��ϴ� VIEW �̸��� �����Ѵ�.
    // ���������� VIEW�� �̸��� /exam01/doA
    //-------------------------------------------------------------------------------------------------
    @RequestMapping("/doA")
    public void doA() {
        System.out.println("doA�� ����Ǿ����ϴ�.....");
    } // End - public void doA()
    
    //-------------------------------------------------------------------------------------------------
    // public void doB() : void Ÿ�� : return Ÿ���� ���� ���
    //-------------------------------------------------------------------------------------------------
    @RequestMapping("/doB")
    public void doBBBBBBBBBB() {
        System.out.println("doB�� ����Ǿ����ϴ�.....");
    } // End - public void doB()
} // End - public class ExamController1
