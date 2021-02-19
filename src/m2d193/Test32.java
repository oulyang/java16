package m2d193;

import java.util.TreeSet;


public class Test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Costomer c1=new Costomer(1,"lisi");
		Costomer c2=new Costomer(8,"lisan");
		Costomer c3=new Costomer(4,"lier");
		Costomer c4=new Costomer(8,"lian");
		
		TreeSet<Costomer> ts=new TreeSet<>();
		ts.add(c4);
		ts.add(c3);
		ts.add(c2);
		ts.add(c1);
		
		for(Costomer c:ts) {
			System.out.println(c);
		}
		
	}

}
class Costomer implements Comparable<Costomer>{
	int age;
	String name;

	
	public Costomer() {
		super();
	}
	
	public Costomer(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int compareTo(Costomer c) {
		if(this.age==c.age) {
			//±È½ÏÃû×Ö
			return this.name.compareTo(c.name);
		}else {
			return this.age-c.age;
		}
	}
	public String toString() {
		return "User["+age+","+name+"]";
	}
	
}