package com.board.command;

import java.util.Arrays;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

//일정추가 페이지에서 입력내용: ID, 일정날짜, 제목, 내용
//             <select> 2023 11 07 06 10 </select> 선택해서 입력 -> Command
//                   DB: seq, id, title, content, mdate, regdate -> DTO

public class DelReviewCommand {

	private String[] seq;
   
   
   public DelReviewCommand() {
      super();
      // TODO Auto-generated constructor stub
   }


public DelReviewCommand(String[] seq) {
	super();
	this.seq = seq;
}


@Override
public String toString() {
	return "DelReviewCommand [seq=" + Arrays.toString(seq) + "]";
}


public String[] getSeq() {
	return seq;
}


public void setSeq(String[] seq) {
	this.seq = seq;
}



  
   
   
}


