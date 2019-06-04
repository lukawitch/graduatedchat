package com.chat.graduated.model;

public class Anniversary {
	public String Anistatic (int mon,int day) {
		String a="&nbsp";
		
		if(mon==1&&day==1) {
			a="새해";
		}
		else if(mon==3&&day==1) {
			a="삼일절";
		}
		else if(mon==5&&day==5) {
			a="어린이날";
		}
		else if(mon==6&&day==6) {
			a="현충일";
		}
		else if(mon==8&&day==15) {
			a="광복절";
		}
		else if(mon==10&&day==3) {
			a="개천절";
		}
		else if(mon==10&&day==9) {
			a="한글날";
		}
		else if(mon==12&&day==25) {
			a="크리스마스";
		}
		return a;
	}
}
