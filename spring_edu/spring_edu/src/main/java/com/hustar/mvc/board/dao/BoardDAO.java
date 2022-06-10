package com.hustar.mvc.board.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Repository;

import com.hustar.mvc.board.vo.BoardVO;

/**
 * �Խñ� Database Access Object (DB ���� ����� ����ϴ� Object)
 */
@Repository
public class BoardDAO {

	@Resource(name = "eduSqlSession")
	private SqlSession sqlSession;
	
	public int boardInsert(String boardTitle, String boardContents, String createUser) {
		BoardVO bvo = new BoardVO();
		bvo.setBoardTitle(boardTitle);
		bvo.setBoardContents(boardContents);
		bvo.setCreateUser(createUser);
		
		sqlSession.insert("boardMapper.boardInsert", bvo);
		
		System.out.print("bvo.getBoardNo(): " + bvo.getBoardNo());
		
		return bvo.getBoardNo();
	}

	public void boardUpdate(int boardNo, String boardTitle, String boardContents, String updateUser) {
		// TODO Auto-generated method stub
		
	}

	public List<BoardVO> boardSelectList(int startIndex, int boardLength) {
		return null;
	}

	public BoardVO boardSelectOne(int boardNo) {
		return sqlSession.selectOne("boardMapper.boardSelectOne", boardNo);
	}

	public void boardDelete(int boardNo) {
		// TODO Auto-generated method stub
		
	}
}
