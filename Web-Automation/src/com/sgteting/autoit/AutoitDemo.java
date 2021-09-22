package com.sgteting.autoit;

public class AutoitDemo {

	public static void main(String[] args) {
		try
		{
			Runtime.getRuntime().exec("F:\\Autoit\\Test.exe");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
