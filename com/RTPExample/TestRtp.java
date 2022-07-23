package com.RTPExample;

import com.inheritanceexp.SoftwareEngineer;

public class TestRtp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Doctor doctor=null;
      int x=(int)(Math.random()*10);
      if(x<5)
      doctor=new Cardialogist();
      else
      doctor=new Neurologist();
      doctor.treatment();
      if (doctor instanceof Cardialogist) {
    	  Cardialogist cardialogist = (Cardialogist) doctor;
    	  cardialogist.setRoomNumber(10);;
    	}

	}

}
