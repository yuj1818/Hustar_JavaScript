package com.hustar.mvc.board.service;

import java.util.List;

import com.hustar.mvc.board.vo.BoardVO;

public interface BoardService {
	
	/** 
	 * �ۼ���: SON
	 * �ۼ���: 220609
	 * ����: �Խñ� ��� ���
	 * 
	 * @param boardTitle
	 * @param boardContents
	 * @param createUser
	 */
	public int boardInsert (String boardTitle, String boardContents, String createUser);
	
	/** 
	 * �ۼ���: SON
	 * �ۼ���: 220609
	 * ����: �Խñ� ���� ���
	 * 
	 * @param boardNo
	 * @param boardTitle
	 * @param boardContents
	 * @param updateUser
	 */
	public void boardUpdate (int boardNo, String boardTitle, String boardContents, String updateUser);
	
	/** 
	 * �ۼ���: SON
	 * �ۼ���: 220609
	 * ����: �Խñ� ��� ��ȸ ���
	 * 
	 * @param startIndex
	 * @param boardLength
	 */
	public List<BoardVO> boardSelectList(int startIndex, int boardLength);
	
	/** 
	 * �ۼ���: SON
	 * �ۼ���: 220609
	 * ����: �Խñ� �� ��ȸ ���
	 * 
	 * @param boardNo
	 */
	public BoardVO boardSelectOne (int boardNo);
	
	/** 
	 * �ۼ���: SON
	 * �ۼ���: 220609
	 * ����: �Խñ� ���� ���
	 * 
	 * @param boardNo
	 */
	public void boardDelete (int boardNo);
}
