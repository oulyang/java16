package m2d191;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		
		map.put(null, null);
		System.out.println(map.size());
		
		map.put(null, 100);
		System.out.println(map.size());
		
		System.out.println(map.get(null));
	}

}
