package com.edu.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edu.member.vo.MemberVO;

//-----------------------------------------------------------------------------------------------------------
// public interface MemberController
//-----------------------------------------------------------------------------------------------------------
public interface MemberController {

	//-----------------------------------------------------------------------------------------------------------
	// ȸ�� ���� ��
	//-----------------------------------------------------------------------------------------------------------
	public	ModelAndView memberForm(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	//-----------------------------------------------------------------------------------------------------------
	// ȸ�� ���� ó��
	//-----------------------------------------------------------------------------------------------------------
	public ModelAndView addMember(@ModelAttribute("member") MemberVO memberVO,
			HttpServletRequest request, HttpServletResponse response) throws Exception;

	//-----------------------------------------------------------------------------------------------------------
	// ȸ�� ��ü ��� ��ȸ
	//-----------------------------------------------------------------------------------------------------------
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception;

	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ش��ϴ� ȸ�� ���� ��ȸ
	//-----------------------------------------------------------------------------------------------------------
	public ModelAndView updateMemberForm(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ش��ϴ� ȸ�� ���� �����ϱ�
	//-----------------------------------------------------------------------------------------------------------
	public ModelAndView modifyMember(@ModelAttribute("info") MemberVO memberVO,
				HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ش��ϴ� ȸ�� ���� �����ϱ�
	//-----------------------------------------------------------------------------------------------------------
	public ModelAndView removeMember(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	//-----------------------------------------------------------------------------------------------------------
	// �α��� ��
	//-----------------------------------------------------------------------------------------------------------
	public	ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	//-----------------------------------------------------------------------------------------------------------
	// �α��� ó��
	//-----------------------------------------------------------------------------------------------------------
	public ModelAndView login(@ModelAttribute("member") MemberVO member, RedirectAttributes rAttr,
				HttpServletRequest request, HttpServletResponse response) throws Exception;

	//-----------------------------------------------------------------------------------------------------------
	// �α׾ƿ� ó��
	//-----------------------------------------------------------------------------------------------------------
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception;

	//-----------------------------------------------------------------------------------------------------------
	// ȸ�� ���� ȭ��(Ajax)
	//-----------------------------------------------------------------------------------------------------------
	public String getRegisterAjaxForm() throws Exception;
	
	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ߺ� �˻�(Ajax)
	//-----------------------------------------------------------------------------------------------------------
	public int idCheck(MemberVO memberVO) throws Exception;
	
	
	

} // End - public interface MemberController










