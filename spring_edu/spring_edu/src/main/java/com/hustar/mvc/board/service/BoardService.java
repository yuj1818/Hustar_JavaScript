package com.hustar.mvc.board.service;

import java.util.List;

import com.hustar.mvc.board.vo.BoardVO;

public interface BoardService {
	
	/** 
	 * 작성자: SON
	 * 작성일: 220609
	 * 내용: 게시글 등록 기능
	 * 
	 * @param boardTitle
	 * @param boardContents
	 * @param createUser
	 */
	public void boardInsert (String boardTitle, String boardContents, String createUser);
	
	/** 
	 * 작성자: SON
	 * 작성일: 220609
	 * 내용: 게시글 수정 기능
	 * 
	 * @param boardNo
	 * @param boardTitle
	 * @param boardContents
	 * @param updateUser
	 */
	public void boardUpdate (int boardNo, String boardTitle, String boardContents, String updateUser);
	
	/** 
	 * 작성자: SON
	 * 작성일: 220609
	 * 내용: 게시글 목록 조회 기능
	 * 
	 * @param startIndex
	 * @param boardLength
	 */
	public List<BoardVO> boardSelectList (int startIndex, int boardLength);
	
	/** 
	 * 작성자: SON
	 * 작성일: 220609
	 * 내용: 게시글 상세 조회 기능
	 * 
	 * @param boardNo
	 */
	public void boardSelectOne (int boardNo);
	
	/** 
	 * 작성자: SON
	 * 작성일: 220609
	 * 내용: 게시글 삭제 기능
	 * 
	 * @param boardNo
	 */
	public void boardDelete (int boardNo);
}
