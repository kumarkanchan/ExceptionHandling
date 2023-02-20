package com.java.customexception2;

public class Candidate {

	public void pm(int vote) throws PMException {
		if (vote >= 500000) {
			System.out.println("PM Total vote is : " + vote);
		} else
			throw new PMException("PM");
	}

	public void cm(int vote) throws CMException {
		if (vote >= 50000) {
			System.out.println("CM Total vote is : " + vote);
		} else
			throw new CMException("CM");
	}

	public void mp(int vote) throws MPException {
		if (vote >= 5000) {
			System.out.println("MP Total vote is : " + vote);
		} else
			throw new MPException("MP");
	}

	public void mla(int vote) throws MLAException {
		if (vote >= 1000) {
			System.out.println("MLS Total vote is : " + vote);
		} else
			throw new MLAException("MLA");
	}
}