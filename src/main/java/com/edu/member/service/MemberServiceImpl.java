package com.edu.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.edu.member.dao.MemberDAO;
import com.edu.member.vo.MemberVO;

//-----------------------------------------------------------------------------------------------------------
// public class MemberServiceImpl implements MemberService
//-----------------------------------------------------------------------------------------------------------
@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	//-----------------------------------------------------------------------------------------------------------
	// ȸ�� ���� ó��
	//-----------------------------------------------------------------------------------------------------------
	@Override
	public int addMember(MemberVO memberVO) throws DataAccessException {
		
		System.out.println("MemberServiceImpl���� ���� memberVO ==> " + memberVO);
		return memberDAO.addMember(memberVO); 

	}

	//-----------------------------------------------------------------------------------------------------------
	// ȸ�� ��ü ��� ��������
	//-----------------------------------------------------------------------------------------------------------
	@Override
	public List listMembers() throws DataAccessException {

		List memberLists = null;
		memberLists = memberDAO.selectAllMemberList();
		return memberLists;
		
	}

	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ش��ϴ� ȸ�� ���� ��������
	//-----------------------------------------------------------------------------------------------------------
	@Override
	public MemberVO selectMember(String id) throws DataAccessException {
		MemberVO memberVO = memberDAO.selectMember(id);
		return memberVO;
	}

	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ش��ϴ� ȸ�� ���� �����ϱ�
	//-----------------------------------------------------------------------------------------------------------
	@Override
	public int modifyMember(MemberVO memberVO) throws DataAccessException {
		return memberDAO.updateMember(memberVO);
	}

	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ش��ϴ� ȸ�� ���� �����ϱ�
	//-----------------------------------------------------------------------------------------------------------
	@Override
	public int removeMember(String id) throws DataAccessException {
		return memberDAO.deleteMember(id);
	}
	
	//-----------------------------------------------------------------------------------------------------------
	// �α��� ó��
	//-----------------------------------------------------------------------------------------------------------
	@Override
	public MemberVO login(MemberVO memberVO) throws DataAccessException {
		return memberDAO.loginByID(memberVO);
	}
	
	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ߺ� �˻�(Ajax)
	//-----------------------------------------------------------------------------------------------------------
	@Override
	public int idCheck(MemberVO memberVO) throws Exception {
		
		System.out.println("MemberService ���̵� �ߺ� �˻�(Ajax)");
		int result = memberDAO.idCheck(memberVO);
		return result;
	}


} // End - public class MemberServiceImpl implements MemberService

