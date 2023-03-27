package com.javalab.stream03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 스트림 반복문, mapToInt() 중간연산 메소드
 */
public class MapToInt02 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동",90));
		list.add(new Student("신용권",92));
		list.add(new Student("유미선",100));
		
		Stream<Student> studentStream = list.stream();

		// 중간 연산 메소드인 MapToInt
		// IntStream 얻기 (int값만 들어있는 별도의 스트림)
		// mapToInt -> 스트림을 intStream으로 변환해주는 메소드
		IntStream scoreStream = 
				studentStream
				//.mapToInt(Student::getScore)
				.mapToInt(student -> student.getScore());
		
		double avg = scoreStream.average().getAsDouble();
		System.out.println("평균 점수는 : " + avg);
		
		//////////////////////////////////////////////////////////////////////////////////
		
		double avg2 = list.stream() // Stream<Student> 객체 생성
				// [중간처리] 학생 객체를 점수로 매핑해서 score를 요소로 갖는 새로운 스트림 생성
				// 그 스트림이 IntStream이다.
		// mapToInt는 함수형 인터페이스인 ToIntFunction타입을 매개변수로 갖고 IntStream을 리턴해줌
				.mapToInt(student -> student.getScore())
				//.mapToInt(Student::getScoer)
				// 최종처리(평균점수)
				.average() // score요소들의 평균을 계산해줌.(IntStream에서 평균 구해주는 메소드)
				.getAsDouble(); // 평균을 Double 타입으로 얻어줌.
		System.out.println(avg2);
	}

}
