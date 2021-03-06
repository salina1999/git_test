package com.edu.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.edu.member.vo.MemberVO;

//-----------------------------------------------------------------------------------------------------------
// public interface MemberDAO
//-----------------------------------------------------------------------------------------------------------
public interface MemberDAO {

	//-----------------------------------------------------------------------------------------------------------
	// 회원 가입 처리
	//-----------------------------------------------------------------------------------------------------------
	public int addMember(MemberVO memberVO) throws DataAccessException;

	//-----------------------------------------------------------------------------------------------------------
	// 회원 전체 목록 가져오기
	//-----------------------------------------------------------------------------------------------------------
	public List selectAllMemberList() throws DataAccessException;

	//-----------------------------------------------------------------------------------------------------------
	// 아이디에 해당하는 회원 정보 가져오기
	//-----------------------------------------------------------------------------------------------------------
	public MemberVO selectMember(String id) throws DataAccessException;

	//-----------------------------------------------------------------------------------------------------------
	// 아이디에 해당하는 회원 정보 수정하기
	//-----------------------------------------------------------------------------------------------------------
	public int updateMember(MemberVO memberVO) throws DataAccessException;

	//-----------------------------------------------------------------------------------------------------------
	// 아이디에 해당하는 회원 정보 삭제하기
	//-----------------------------------------------------------------------------------------------------------
	public int deleteMember(String id) throws DataAccessException;
	
	//-----------------------------------------------------------------------------------------------------------
	// 로그인 처리
	//-----------------------------------------------------------------------------------------------------------
	public MemberVO loginByID(MemberVO memberVO) throws DataAccessException;
	
	//-----------------------------------------------------------------------------------------------------------
	// 아이디 중복 검사(Ajax)
	//-----------------------------------------------------------------------------------------------------------
	public int idCheck(MemberVO memberVO) throws DataAccessException;
	
	

} // End - public interface MemberDAO