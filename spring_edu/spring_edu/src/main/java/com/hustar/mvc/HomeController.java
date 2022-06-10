package com.hustar.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hustar.mvc.board.service.BoardService;
import com.hustar.mvc.board.vo.BoardVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Resource(name = "boardService")
	private BoardService boardService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/board/insert", method = RequestMethod.GET)
	public String boardInsert(Model model) {
		return "/board/insert";
	}
	
	/*
	@RequestMapping(value = "/board/insert", method = RequestMethod.POST)
	public String boardInsertPOST(BoardVO bvo) {
		System.out.println(bvo.getBoardTitle());
		System.out.println(bvo.getBoardContents());
		return "/board/selectOne"; 
	}
	*/
	
	
	@RequestMapping(value = "/board/insert", method = RequestMethod.POST)
	public String boardInsertPOST(String boardTitle, String boardContents) {
		System.out.println(boardTitle);
		System.out.println(boardContents);
		int boardNo = boardService.boardInsert(boardTitle, boardContents, "SON");
		
		return "redirect:/board/selectOne?boardNo=" + boardNo;
	}
	
	
	@RequestMapping(value = "/board/update", method = RequestMethod.GET)
	public String boardUpdate(Model model) {
		return "/board/update";
	}
	
	@RequestMapping(value = "/board/selectList", method = RequestMethod.GET)

	}
	
	@RequestMapping(value = "/board/selectOne", method = RequestMethod.GET)
	public String boardSelectOne(int boardNo, Model model) {
		BoardVO bvo = boardService.boardSelectOne(boardNo);
		model.addAttribute("boardTitle", bvo.getBoardTitle());
		model.addAttribute("boardContents", bvo.getBoardContents());
		return "/board/selectOne";
	}
}
