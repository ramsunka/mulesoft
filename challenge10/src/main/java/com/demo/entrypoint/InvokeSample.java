package com.demo.entrypoint;

public class InvokeSample {
	
	public String ReturnPayload(int a){
		
		return "The Square of "+String.valueOf(a)+" is "+String.valueOf(a*a)+"\n The Cube of "+ String.valueOf(a)+" is "+String.valueOf(a*a*a);
	}

}
