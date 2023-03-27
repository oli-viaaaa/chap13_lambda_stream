package com.javalab.stream01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("김자바");
		set.add("정명훈");
		set.add("김재훈");
		
		Stream<String> stream = set.stream();
		stream.forEach(i-> System.out.println(i)); // stream.forEach(i-> System.out.println(i)); 속 i는 개발자가 입력하기 나름. 
												   // 앞과 뒤의 용어만 맞춰주면 됨.
		
		
	} // main end

} // class end
