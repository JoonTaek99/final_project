package com.board.dtos;

public class AccountDto {
	
   private int money;
   private String fintech_use_num;
   private String bank_name;
   private int userseqno; 
   
   public AccountDto() {
      super();
      // TODO Auto-generated constructor stub
   }

public AccountDto(int money, String fintech_use_num, String bank_name, int userseqno) {
	super();
	this.money = money;
	this.fintech_use_num = fintech_use_num;
	this.bank_name = bank_name;
	this.userseqno = userseqno;
}

@Override
public String toString() {
	return "AccountDto [money=" + money + ", fintech_use_num=" + fintech_use_num + ", bank_name=" + bank_name
			+ ", userseqno=" + userseqno + "]";
}

public int getMoney() {
	return money;
}

public void setMoney(int money) {
	this.money = money;
}

public String getFintech_use_num() {
	return fintech_use_num;
}

public void setFintech_use_num(String fintech_use_num) {
	this.fintech_use_num = fintech_use_num;
}

public String getBank_name() {
	return bank_name;
}

public void setBank_name(String bank_name) {
	this.bank_name = bank_name;
}

public int getUserseqno() {
	return userseqno;
}

public void setUserseqno(int userseqno) {
	this.userseqno = userseqno;
}
   
   
   
}