package hello;
/*
 hello package의 HelloJava class
 화면에 Hello Java 라는 문장을 출력한다.
 
 package 는 소스 코드의 묶음.
 package name convention 은 모두 소문자. 클래스 내의 다른 변수와 중복되는 걸 막기 위해.
 
 작성한 소스코드는 HelloJava/src/hello.HelloJava.java 로,
 컴파일 된 바이트코드는 HelloJava/bin/hello.HelloJava.class 로 저장되어있다.
 컴파일 된 바이트코드는 실행환경에 맞는 자바 가상머신이 실행해 준다.
 */
public class HelloJava {

	public static void main(String[] args) {
		// 화면에 "Hello Java" 라는 문장을 출력함
		System.out.println("Hello, Java");
	}

}
