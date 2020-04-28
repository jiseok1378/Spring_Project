package kr.inhatc.spring.board.dto;

import lombok.Data;

// DTO : Data Transfer Object (데이터 전달 객체)
@Data
public class BoardDto {
	private int boardIdx;
	private String title;
	private String contents;
	private int hitCnt;
	private String creatorId;
	private String createDatetime;
	
	
}
