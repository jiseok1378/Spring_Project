package kr.inhatc.spring.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.inhatc.spring.board.dto.BoardDto;
import kr.inhatc.spring.board.mapper.BoardMapper;
//ServiceImpl를 메모리에 올리기위해서는 @Service를 해주어야함.
@Service
public class BoardServiceImpl implements BoardService {
	//변수를 메모리에 올리기위한 Annotation
	//BoardDto에서 가져온 데이터를 List형식으로 전달
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardDto> boardList() {		
		return boardMapper.boardList();
	}

}
