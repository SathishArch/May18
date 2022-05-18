package org.tcs.test.login;

public class AxisBank implements sbiBank {

	@Override
	public void savings() {
		System.out.println("7%");
	}
public static void main(String[] args) {
	
	AxisBank c=new AxisBank();
	c.savings();
	c.fixed();
}
@Override
public void fixed() {
System.out.println("9%");	
}
	
	
}
