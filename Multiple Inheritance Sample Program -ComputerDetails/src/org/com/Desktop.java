package org.com;


public class Desktop implements HardWare,Software{

	@Override
	public void hardwareResources() {
		System.out.println("Hardware resources are Memory,disk,CPU");
		
	}

	@Override
	public void softwareResources() {
		System.out.println("Software resources are OS,DBMS,SU");}
	
	private void desktopModel() {
	   System.out.println("Desktop model is compact ");

	}
	public static void main(String[] args)
	{
		Desktop c = new Desktop();
		c.hardwareResources();
		c.softwareResources();
	    c.desktopModel();  }}
		
	
		
	


