package Q;

public class Q7_1person {
	String name=null;
	int age=0;
	
//	void hello(){System.out.println("hi");}
//	를 갖는 person 클래스를 만드시오
//
//	문제7-1
//	문제 7을 이용하여 아래 생성자가 가능하도록 생성자를 추가하세요
//	person p = new person("홍길동",20);
//
//
//	문제7-2
//	문제 7을 이용하여 아래 생성자가 가능하도록 생성자를 추가하세요
//	person p = new person();
	
	public Q7_1person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void hello() {
		System.out.println("hi");
	}
}
