package kr.inhatc.spring.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.inhatc.spring.board.dto.BoardDto;
import kr.inhatc.spring.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/")
	public String hello() {
		return "index";
	}
	
	@RequestMapping("/board/boardList.do")
	public String boardList(Model model) {
		List<BoardDto> list = boardService.boardList();
		System.out.println("==============>>>>"+ list.size());
		//list로 받아온 요소들을 model(html)에 JSON 형태로 전송.
		model.addAttribute("list",list);
		return "board/boardList";
	} 
}
