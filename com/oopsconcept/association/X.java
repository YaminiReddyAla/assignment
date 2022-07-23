package com.oopsconcept.association;

public class X {
private Y y; //proof of association
private Z z; //proof of association


public X()
{
	y=new Y();// observe Y object is getting created
	//inside the class y reference is not local hence it is a composition
}
public void putZ(Z z)
{
	this.z=z; //observe z obj is not createwd inside the class
	//it is created outside the class and needs to be supplied
	//while calling this func called putZ this is called aggregation
}
}
