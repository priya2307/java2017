package vector;
//add,add all,size,clear,remove
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector<String>v= new Vector<String>();
           v.add("Student1");
           v.add("Student2");
           v.add("Student3");
           v.add("Student4");
           v.add("Student5");
          System.out.println("Vector="+v);   
  		Vector<String>v2= new Vector<String>();
        v2.add("Employee1");
        v2.add("Employee2");
        v2.add("Employee3");
        v2.add("Employee4");
        v2.add("Employee5");
        System.out.println("Vector="+v2);   
        v.addAll(2,v2);
        System.out.println("Vector="+v);
        v.remove(3);
        System.out.println("Vector="+v);
        v.size();
        System.out.println("Vector="+v.size());
        v.clear();
        System.out.println("Vector="+v);
        v2.remove(1);
        System.out.println("After Vector="+v2);
	}

}
