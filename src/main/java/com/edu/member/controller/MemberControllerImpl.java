package com.edu.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edu.member.service.MemberService;
import com.edu.member.vo.MemberVO;

//-----------------------------------------------------------------------------------------------------------
// public class MemberControllerImpl implements MemberController
//-----------------------------------------------------------------------------------------------------------
@Controller("memberController")
@RequestMapping("/member")	// url���� /member�� �����ϴ� �͵��� ó���ϴ� ��Ʈ�ѷ�
public class MemberControllerImpl implements MemberController {

	@Autowired
	private MemberVO memberVO;
	
	@Autowired
	private MemberService memberService;
	// MemberService memberService = new MemberService();
	
	//-----------------------------------------------------------------------------------------------------------
	// ȸ�� ���� ��
	//-----------------------------------------------------------------------------------------------------------
	@Override
	@RequestMapping(value="/memberForm.do", method=RequestMethod.GET)
	public	ModelAndView memberForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav	= new ModelAndView();
		mav.setViewName("/member/memberForm");
		return mav;
		
	}

	//-----------------------------------------------------------------------------------------------------------
	// ȸ�� ���� ó��
	//-----------------------------------------------------------------------------------------------------------
	@Override
	@RequestMapping(value="/addMember.do", method=RequestMethod.POST)
	public ModelAndView addMember(@ModelAttribute("memberVO") MemberVO memberVO, HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		System.out.println("MemberController���� ���� memberVO ==> " + memberVO);
		
		int result = 0;
		// ����ڰ� �Է��� ������ ���񽺿��� �Ѱ��־� ó���ϰ� �Ѵ�.
		result = memberService.addMember(memberVO);
		
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");

		return mav;
		
	} // End - public ModelAndView addMember

	//-----------------------------------------------------------------------------------------------------------
	// ȸ�� ��ü ��� ��ȸ
	//-----------------------------------------------------------------------------------------------------------
	@Override
	@RequestMapping(value="/listMembers.do", method=RequestMethod.GET)
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// ȸ�� ��ü ��� �ڷḦ �����´�.
		List memberLists = memberService.listMembers();
		System.out.println("MemberController ȸ�� ��ü ��� ==> " + memberLists);
		
		// ȸ�� ��ü ��� ȭ���� �����ش�.
		ModelAndView mav = new ModelAndView("/member/listMembers");
		// mav.setViewName("/member/listMembers");
		mav.addObject("memberLists", memberLists);
		
		return mav;
	}

	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ش��ϴ� ȸ�� ���� ��ȸ
	//-----------------------------------------------------------------------------------------------------------
	@Override
	@RequestMapping(value="/updateMemberForm.do", method=RequestMethod.GET)
	public ModelAndView updateMemberForm(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		System.out.println("MemberController ȸ�� ���� ��ȸ id ==> " + id);
		
		// ȸ�� ��ü ����Ʈ ȭ�鿡�� ������ ��û�� id�� �ش��ϴ� ������ ã�� ���� ���񽺿��� ��Ź�Ѵ�.
		memberVO = memberService.selectMember(id);
		System.out.println("MemberController ȸ�� ���� ��ȸ ==> " + memberVO);
		
		// ã�ƿ� �����͸� ������ ���� ���� ����ȭ������ �Ѿ��.
		ModelAndView mav = new ModelAndView("/member/updateMemberForm");
		mav.addObject("member", memberVO);
		
		return mav;
	}

	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ش��ϴ� ȸ�� ���� �����ϱ�
	//-----------------------------------------------------------------------------------------------------------
	@Override
	@RequestMapping(value="modifyMember.do", method=RequestMethod.POST)
	public ModelAndView modifyMember(@ModelAttribute("memberVO") MemberVO memberVO, HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		System.out.println("MemberController ȸ�� ���� �����ϱ� memberVO ==> " + memberVO);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		int result = memberService.modifyMember(memberVO);

		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		return mav;
	}

	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ش��ϴ� ȸ�� ���� �����ϱ�
	//-----------------------------------------------------------------------------------------------------------
	@Override
	@RequestMapping(value="removeMember.do", method=RequestMethod.GET)
	public ModelAndView removeMember(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		int result = memberService.removeMember(id);
		
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		return mav;
	}

	//-----------------------------------------------------------------------------------------------------------
	// �α��� ȭ�� ����
	//-----------------------------------------------------------------------------------------------------------
	@Override
	@RequestMapping(value="/loginForm.do", method=RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/member/loginForm");
		return mav;
		
	}

	//-----------------------------------------------------------------------------------------------------------
	// �α��� ó��
	//-----------------------------------------------------------------------------------------------------------
	@Override
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("member") MemberVO member, RedirectAttributes rAttr, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		System.out.println("MemberController �α��� member.getPwd() ==> " + member.getPwd());
		
		// �α��� �� ������ ������ ������ ���̽��� �����ϴ��� ó���� �ϰ�, �� ����� �����´�.
		memberVO = memberService.login(member);
		System.out.println("MemberController �α��� ==> " + memberVO);
		
		
		// �α��� ������ �����ͺ��̽��� �����ϴ����� ���� ó���� �ٸ��� �Ѵ�.
		if(memberVO != null) {	// �α��� ������ �ش��ϴ� �ڷᰡ �����Ѵٸ�
			
			if(member.getPwd().equals(memberVO.getPwd())) {
				// ���̵�� ��й�ȣ�� ��ġ�ϸ�, ������ �߱��Ѵ�.
				HttpSession session = request.getSession();
				session.setAttribute("member", 	memberVO);
				session.setAttribute("isLogOn",	true);
				// mav.setViewName("redirect:/member/listMembers.do");
				mav.setViewName("redirect:/main.do"); // ����ȭ������ �̵�
			} else {
				rAttr.addAttribute("result", "PasswordFailed");
				mav.setViewName("redirect:/member/loginForm.do");
			}
			
		} else {	// �α��� ������ �ش��ϴ� �ڷᰡ �������� �ʴ´ٸ�
			// �α��� ���� �޽����� ������ �α��� ȭ������ �̵��Ѵ�.
			rAttr.addAttribute("result", "loginFailed");
			mav.setViewName("redirect:/member/loginForm.do"); 
		}

		return mav;
	}

	//-----------------------------------------------------------------------------------------------------------
	// �α׾ƿ� ó��
	//-----------------------------------------------------------------------------------------------------------
	@Override
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		session.removeAttribute("member");
		session.removeAttribute("isLogOn");
		
		ModelAndView mav = new ModelAndView();
		// mav.setViewName("redirect:/member/loginForm.do");
		mav.setViewName("redirect:/main.do"); // ����ȭ������ �̵�
		return mav;
	}

	//-----------------------------------------------------------------------------------------------------------
	// ȸ�� ���� ȭ��(Ajax)
	//-----------------------------------------------------------------------------------------------------------
	@Override
	@RequestMapping(value = "/registerAjaxForm", method = RequestMethod.GET)
	public String getRegisterAjaxForm() throws Exception {

		System.out.println("MemberController ȸ�� ���� ȭ��(Ajax) ��û");
		return "/member/registerAjax";
		
	}
	
	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ߺ� �˻�(Ajax)
	//-----------------------------------------------------------------------------------------------------------
	@Override
	@ResponseBody
	@RequestMapping(value = "/idCheck", method = RequestMethod.POST)
	public int idCheck(MemberVO memberVO) throws Exception {
		
		System.out.println("MemberController ���̵� �ߺ� �˻�(Ajax) id => " + memberVO.getId());
		
		int result = memberService.idCheck(memberVO);
		
		System.out.println("result : " + result);
		return result;
		
	}
	
	
	
	
	

} // End - public class MemberControllerImpl implements MemberController
