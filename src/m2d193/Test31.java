package m2d193;

import java.util.TreeSet;

public class Test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new User(1);
		User u2=new User(2);
		User u3=new User(3);
		User u4=new User(4);
		
		TreeSet<User> ts=new TreeSet<>();
		ts.add(u1);
		ts.add(u2);
		ts.add(u3);
		ts.add(u4);
		
		for(User u:ts) {
			System.out.println(u);
		}
	}
}

class User implements Comparable<User>{
	int age;
	public User() {	
	}
	public User(int age) {
		super();
		this.age = age;
	}
	public int compareTo(User u) {
		
		//return this.age-u.age;
		
		int a1=this.age;
		int a2=u.age;
		if(a1==a2) {
			return 0;
		}else if(a1<a2) {
			return -1;
		}else {
			return 1;
		}
	}
	public String toString() {
		return "User["+age+"]";
	}
	
}