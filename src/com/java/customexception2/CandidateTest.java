package com.java.customexception2;

public class CandidateTest {

	public static void main(String[] args)throws MLAException, MPException, CMException, PMException {
		Candidate c = new Candidate();
		
		//c.mla(500);
		//c.mp(20000);
		c.cm(500);

	}

}
