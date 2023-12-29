package com.board.command;

import java.util.Arrays;
import jakarta.validation.constraints.NotEmpty;

public class DelBoardCommand {
	private String[] seq;

	public DelBoardCommand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DelBoardCommand(String[] seq) {
		super();
		this.seq = seq;
	}

	public String[] getSeq() {
		return seq;
	}

	public void setSeq(String[] seq) {
		this.seq = seq;
	}

	@Override
	public String toString() {
		return "DelBoardCommand [seq=" + Arrays.toString(seq) + "]";
	}

	
	
}