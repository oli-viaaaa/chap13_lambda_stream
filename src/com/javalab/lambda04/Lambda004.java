package com.javalab.lambda04;


 // 함수형 인터페이스
 @FunctionalInterface
 interface MyFunctionalInterface{
	 // 반환형이 있고 매개 변수가 두개인 추상메소드
	 public int run(int x, int y); //유일한 메소드
 }
 
 // 매개 변수가 있고 return 문이 있는 경우의 람다 함수
public class Lambda004 {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		int sum = 0;
		
		// 람다식 사용하지 않고 익명 구형 객체 생성
		fi = new MyFunctionalInterface() {
			
			@Override
			public int run(int x, int y) {
				return x+y;
			}
		};
		
		
		/*
		 * [1] 실행문이 여러줄일 경우 람다식
		 * 	- 실행문이 여러줄이면 중괄호 {} 있어야 함
		 */
		
		fi = (a, b) -> {
			System.out.println("run 메소드콜1");
			return a+b;
		};
		sum = fi.run(2, 3);
		System.out.println(sum);
		
		/*
		 * [2] 실행문이 return 구문 한줄인 람다식
		 * 	a와 b를 받아서 작은 수를 반환해주는 람다식 구현
		 */
		fi = (a,b)-> {return a>b?a:b;}; // 익명구현객체 생성(run()메소드 있다)
		sum = fi.run(6, 7);
		System.out.println(sum);
		System.out.println(fi);
	}
}
