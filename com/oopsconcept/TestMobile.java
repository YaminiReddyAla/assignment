package com.oopsconcept;

public class TestMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sim sim=new Sim(23);
		Mobilr mobilr=new Mobilr(sim);
		mobilr.makeCall();
		mobilr.sendSms();
	}

}
