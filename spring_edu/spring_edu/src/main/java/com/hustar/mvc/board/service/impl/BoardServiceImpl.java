package com.hustar.mvc.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hustar.mvc.board.dao.BoardDAO;
import com.hustar.mvc.board.service.BoardService;
import com.hustar.mvc.board.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Resource(name = "boardDAO")
	private BoardDAO boardDAO;

	@Override
	public int boardInsert(String boardTitle, String boardContents, String createUser) {
		return boardDAO.boardInsert(boardTitle,  boardContents, createUser);
	}

	@Override
	public void boardUpdate(int boardNo, String boardTitle, String boardContents, String updateUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardVO> boardSelectList(int startIndex, int boardLength) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO boardSelectOne(int boardNo) {
		return boardDAO.boardSelectOne(boardNo);
	}

	@Override
	public void boardDelete(int boardNo) {
		// TODO Auto-generated method stub
		
	}
	
}
