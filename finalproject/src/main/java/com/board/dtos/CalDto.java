package com.board.dtos;

import java.util.Date;


public class CalDto {

	   private int seq;
	   private String email;
	   private String title;
	   private String content;
	   private String mdate;
	   private Date regdate;
	   private String ykiho;
	   
	   public int getSeq() {
	      return seq;
	   }

	public CalDto(int seq, String email, String title, String content, String mdate, Date regdate, String ykiho) {
		super();
		this.seq = seq;
		this.email = email;
		this.title = title;
		this.content = content;
		this.mdate = mdate;
		this.regdate = regdate;
		this.ykiho = ykiho;
	}

	@Override
	public String toString() {
		return "CalDto [seq=" + seq + ", email=" + email + ", title=" + title + ", content=" + content + ", mdate="
				+ mdate + ", regdate=" + regdate + ", ykiho=" + ykiho + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMdate() {
		return mdate;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getYkiho() {
		return ykiho;
	}

	public void setYkiho(String ykiho) {
		this.ykiho = ykiho;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}
	   
	   
   
   
   
}