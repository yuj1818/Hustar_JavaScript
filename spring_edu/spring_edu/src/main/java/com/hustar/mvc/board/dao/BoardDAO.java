package com.hustar.mvc.board.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Repository;

import com.hustar.mvc.board.vo.BoardVO;

/**
 * 게시글 Database Access Object (DB 접근 기능을 담당하는 Object)
 */
@Repository
public class BoardDAO {

	@Resource(name = "eduSqlSession")
	private SqlSession sqlSession;
	
	public void boardInsert(String boardTitle, String boardContents, String createUser) {
		// TODO Auto-generated method stub
		
	}

	public void boardUpdate(int boardNo, String boardTitle, String boardContents, String updateUser) {
		// TODO Auto-generated method stub
		
	}

	public List<BoardVO> boardSelectList(int startIndex, int boardLength) {
		// TODO Auto-generated method stub
		return null;
	}

	public void boardSelectOne(int boardNo) {
		// TODO Auto-generated method stub
		
	}

	public void boardDelete(int boardNo) {
		// TODO Auto-generated method stub
		
	}
}
