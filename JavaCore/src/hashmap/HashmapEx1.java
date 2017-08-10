package hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashmapEx1 {

	public static void main(String[] args) {
          HashMap hm=new HashMap();
          
          boolean x=hm.isEmpty();//is empty
          System.out.println("HashMap is Empty="+x);

          hm.put(1,"Bank1");
          hm.put(2,"Bank2");
          hm.put(3,"Bank3");
          hm.put(4,"Bank4");
          hm.put(5,"Bank5");
          hm.put(6,"Bank6");
          System.out.println("HashMap="+hm);
          
          hm.size();
          System.out.println("HashMap Size="+hm.size());
          
          System.out.println("HashMap after remove="+hm.remove(2));//remove

          System.out.println("HashMap only values="+hm.values());//values

          
          String p=(String)hm.put(3,"Bank");//put
          System.out.println("Hasmap put="+hm);
          
          Set k=hm.keySet();//key set
          System.out.println("HashMap with only keyset="+k);
          
          boolean x1=hm.isEmpty();//is empty
          System.out.println("HashMap is Empty="+x1);
          
           String x2 = (String) hm.get(2);//get
           System.out.println("HashMap get key 2="+x2);
          
          System.out.println("HashMap Contains Key="+hm.containsKey(5));//contains key
          
          System.out.println("HashMap Contains Value="+hm.containsValue("Bank1"));//contains value
          System.out.println("HashMap Contains Value="+hm.containsValue("Bank8"));
          
          Set y = hm.entrySet();//entry set
          System.out.println("Hashmap Entryset="+y);

          
          HashMap hm1=(HashMap)hm.clone();//clone
          System.out.println("HahMap after cloning="+hm1);

          
          hm.clear();//clone
          System.out.println("HahMap after clear="+hm);

	}

}
