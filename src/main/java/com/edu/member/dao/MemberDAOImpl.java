package com.edu.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.edu.member.vo.MemberVO;

//-----------------------------------------------------------------------------------------------------------
// public class MemberDAOImpl implements MemberDAO
//-----------------------------------------------------------------------------------------------------------
@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;

	//-----------------------------------------------------------------------------------------------------------
	// ȸ�� ���� ó��
	// sqlSession.insert(����� mapper�� id, ������ ��) 
	//-----------------------------------------------------------------------------------------------------------
	@Override
	public int addMember(MemberVO memberVO) throws DataAccessException {

		System.out.println("MemberDAOImpl���� ���� memberVO ==> " + memberVO);
		int result = sqlSession.insert("mapper.member.addMember", memberVO);
		return result;

	} // End - public int addMember(MemberVO memberVO)

	//-----------------------------------------------------------------------------------------------------------
	// ȸ�� ��ü ��� ��������
	//-----------------------------------------------------------------------------------------------------------
	@Override
	public List selectAllMemberList() throws DataAccessException {

		System.out.println("MemberDAOImpl selectAllMemberList().....");
		List<MemberVO> memberLists = null;
		
		memberLists = sqlSession.selectList("mapper.member.selectAllMemberList");
		
		return memberLists;
	}

	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ش��ϴ� ȸ�� ���� ��������
	//-----------------------------------------------------------------------------------------------------------
	@Override
	public MemberVO selectMember(String id) throws DataAccessException {
		MemberVO memberVO = sqlSession.selectOne("mapper.member.selectMember", id);	// selectOne �ܰ�
		return memberVO;
	}

	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ش��ϴ� ȸ�� ���� �����ϱ�
	//-----------------------------------------------------------------------------------------------------------
	@Override
	public int updateMember(MemberVO memberVO) throws DataAccessException {
		int result = sqlSession.update("mapper.member.updateMember", memberVO);
		return result;
	}

	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ش��ϴ� ȸ�� ���� �����ϱ�
	//-----------------------------------------------------------------------------------------------------------
	@Override
	public int deleteMember(String id) throws DataAccessException {
		int result = sqlSession.delete("mapper.member.deleteMember", id);
		return result;
	}

	//-----------------------------------------------------------------------------------------------------------
	// �α��� ó��
	//-----------------------------------------------------------------------------------------------------------
	@Override
	public MemberVO loginByID(MemberVO memberVO) throws DataAccessException {
		MemberVO memVO = sqlSession.selectOne("mapper.member.loginByID", memberVO);
		return memVO;
	}
	
	//-----------------------------------------------------------------------------------------------------------
	// ���̵� �ߺ� �˻�(Ajax)
	//-----------------------------------------------------------------------------------------------------------
	@Override
	public int idCheck(MemberVO memberVO) throws DataAccessException {
		
		System.out.println("MemberDAOImpl idCheck() id : " + memberVO.getId());
		
		return sqlSession.selectOne("mapper.member.idCheck", memberVO);
	}


	
	
} // End - public class MemberDAOImpl implements MemberDAO



