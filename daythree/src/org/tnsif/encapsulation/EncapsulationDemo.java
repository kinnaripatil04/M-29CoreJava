package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		//object creation
		HDFCBank h = new HDFCBank();
		h.setCardNo(234589000);
		h.setCardType("Debit");
		h.setCVVNo(234);
		h.setPinNo(1001);
		
		//getters is added to return a value
		System.out.println(h.getCardNo());
		System.out.println(h.getCardType());
		System.out.println(h.getCVVNo());
		System.out.println(h.getPinNo());
		

	}

}
