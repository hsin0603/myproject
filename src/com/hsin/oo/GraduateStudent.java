package com.hsin.oo;

public class GraduateStudent extends Student{
//繼承student
	int thesis;
	public GraduateStudent(){
		super();
//		super只能用在第一行，呼叫父類別的建構值
	}
	@Override
//	@annotation 標示
//	可以擴大範圍 不可以縮小
	public void print(){
        super.print();
		System.out.println(pass);
		System.out.println(english + "\t" + math + "\t" + chinese +"\t"+thesis);
	}
	
	@Override
	public int gitAverage() {
		return (english + math + chinese + thesis) / 4;
}
}