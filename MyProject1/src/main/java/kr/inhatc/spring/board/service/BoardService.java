package kr.inhatc.spring.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.inhatc.spring.board.dto.BoardDto;
// Service에는 @Service를 꼭 붙여주어야한다.
@Service
public interface BoardService {
	// 메소드의 이름과 쿼리의 이름을 동일하게 처리
	List<BoardDto> boardList();

}
