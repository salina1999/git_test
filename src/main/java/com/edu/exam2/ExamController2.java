package com.edu.exam2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//-------------------------------------------------------------------------------------------------
// public class ExamController2
//-------------------------------------------------------------------------------------------------
@Controller
@RequestMapping("/exam02")
public class ExamController2 {

	//-------------------------------------------------------------------------------------------------
	// return Ÿ���� String�� ���
	// @ModelAttribute("msg") �� �ּ�â���� msg��� �Ķ������ ���� �����´�.
	// http://localhost:8088/exam02/doC?msg=hello
	// �̷��� �ּ�â�� �Ķ���Ͱ� �����ִ� ��쿡 �ڵ������� msg�� ���� hello�� �������� �ȴ�.
	//    request.getParameter("msg")�� ������� �ʾƵ� �ȴ�.
	//-------------------------------------------------------------------------------------------------
	@RequestMapping("/doC")
	public String doC(@ModelAttribute("msg") String msg) {
		System.out.println("doC�� ����Ǿ����ϴ�. msg : " + msg);
		
		// return�� ���ڿ��� ���� ��쿡�� ���ڿ�.jsp������ ã�Ƽ� �����ϰ� �ȴ�.
		// voidŸ�԰��� �ٸ��� return Ÿ���� String�� ��쿡�� �����ϴ� ���ڿ��� View �̸��� �ȴ�.
		return "exam02/doC";
	}

	//-------------------------------------------------------------------------------------------------
	// ������ �Է� ��
	// return type�� void�̸� value�� ���� page�̸��� �ȴ�.
	//-------------------------------------------------------------------------------------------------
	@RequestMapping(value = "gugudanForm.do", method = RequestMethod.GET)
	public void guguForm() {
		System.out.println("������ ȭ���� �ҷ����ϴ�.");
	}
	
	//-------------------------------------------------------------------------------------------------
	// ������
	// Model : �����͸� ��� �׸� ������ �Ѵ�. map ������ ������ �ȴ�.
	// model.addAttribute("������", ��);
	//-------------------------------------------------------------------------------------------------
	// @RequestMapping("gugu.do") // GET, POST ��Ŀ� �������.
	@RequestMapping(value="gugu.do", method=RequestMethod.GET)
	// public String gugu(int dan, Model model) {
	// public String gugu(int dan, String good, Model model) {
	// public String gugu(@RequestParam int dan, String good, Model model) {
	public String gugu(@RequestParam(defaultValue="3") int dan, String good, Model model) {
		
		//-------------------------------------------------------------------------------------------------
		// Spring������ get��Ŀ��� �Ʒ��� �ٰ� ���� ������� ������� �ʴ´�.
		// int dan = Integer.parseInt(request.getParameter("dan"));
		//-------------------------------------------------------------------------------------------------
		// <a href=${path}/gugu.dan?dan=8">������</a>
		// publuc String gugu(HttpServletRequest request, Model model)�� ������� �ʰ�,
		// public String gugu(int dan, Model model)�� ����Ѵ�.
		
		// ���� �Ѱ��ִ� ���������� ���� String���� �Ѿ������,
		// Spring������ ���������� �� �޴´�.(�̷��� ������ ������ �ȿ� �� ����ִ� ���̴�.)
		
		// public String gugu(int dan, String good, Model model) 
		// �Ѿ���� �Ű������� ������ �Ű������� ��ġ�� ����� ���� �� �޴´�.
		// http://localhost:8088/exam02/gugu.do?good=abcd&dan=9
		
		// public String gugu(int dan, String good, Model model) 
		// public String gugu(@RequestParam int dan, String good, Model model) 
		// �����δ� @RequestParam�� ���� �ִ� ���̱� ������ ������� �ʾƵ� �ȴ�.

		
		System.out.println("���۹��� ���ڿ� : " + good);
		
		String	result = "";
		for(int i = 1; i <= 9; i++) {
			result += dan + " x " + i + " = " + dan*i + "<br/>";
		}
		
		model.addAttribute("result", result);
		return "exam02/gugudan";
		
	} // End - public String gugu()
	
} // End - public class ExamController2
