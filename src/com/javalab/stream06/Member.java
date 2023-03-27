package com.javalab.stream06;

/*
 * 도메인 클래스, vo(Value Object) 클래스
 */

public class Member {
	// 정적 변수, 클래스 변수(field) <-> 인스턴스 변수
	public static int MALE = 0;
	public static int FEMALE = 1;
	
	private String naem;
	private int sex;
	private int age;
	
	public Member() {
		super();
	}
	
	public Member(String naem, int sex, int age) {
		super();
		this.naem = naem;
		this.sex = sex;
		this.age = age;
	}

	public static int getMALE() {
		return MALE;
	}

	public static void setMALE(int mALE) {
		MALE = mALE;
	}

	public static int getFEMALE() {
		return FEMALE;
	}

	public static void setFEMALE(int fEMALE) {
		FEMALE = fEMALE;
	}

	public String getNaem() {
		return naem;
	}

	public void setNaem(String naem) {
		this.naem = naem;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	
	

}
