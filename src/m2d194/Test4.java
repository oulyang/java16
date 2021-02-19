package m2d194;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 自平衡二叉树遵循左小右大原则存放数据
 * 遍历二叉树的三种方式：前序遍历->根左右
 * 						中序遍历->左根右（TreeSet集合、Iterator）
 * 						后序遍历->左右根
 * 						（根的位置）
 * 
 * 比较规则不变用comparable接口，若多种比较规则变用comparator
 * @author yyds
 *
 */
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*匿名内部类
		TreeSet<Animal> animal=new TreeSet<>(new Comparator<Animal>(){
		public int compare(Animal a1,Animal a2){
			return a1.age-a2.age;
		}
	});
		*/
		AnimalComparator ac=new AnimalComparator();
		TreeSet<Animal> animal=new TreeSet<>(ac);
		
		animal.add(new Animal(12));
		animal.add(new Animal(123));
		animal.add(new Animal(1234));
		
		for(Animal a:animal) {
			System.out.println(a);
		}
	}

}


class Animal{
	int age;

	public Animal() {
		super();
	}

	public Animal(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + "]";
	}
	
}

class AnimalComparator implements Comparator<Animal>{
	public int compare(Animal a1,Animal a2) {
		return a1.age-a2.age;
	}
}
