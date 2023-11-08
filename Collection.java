import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Map;


//import javax.swing.text.html.HTMLDocument.Iterator;


public class Collection {
    public static void main (String[] args){

        // list supports similar values addition
        List<Integer> a=new ArrayList<Integer>();     // ArrayList class implements List Interface wich further implemennts Collection interface
        //List<Integer> a=new LinkedList<Integer>();
        a.add(2);
        a.add(3);
        a.add(6);
        a.add(8);
        a.add(3);        // adding same value
        System.out.println(a);                    // printing array
        System.out.println(a.get(1));       // printing the value at index


        //Set interface don't support duplicate values
        //Set<Integer> s=  new HashSet<Integer>();
        Set<Integer> s=  new TreeSet<Integer>();     // it will print the arranged set

        s.add(2);
        s.add(3);
        s.add(6);
        s.add(8);
        s.add(3);        // adding same value
        System.out.println(s); 

        // Iterator
        Iterator<Integer> inn= s.iterator();
        while(inn.hasNext()){
            System.out.println(inn.next());
        }

        Map<String, Integer> m =new HashMap<>();
        m.put("naveen", 25);
        m.put("kiran", 55);
        System.out.println(m.keySet());
        for( int i=0; i<m.keySet(),i++){
            System.out.println(key+" : "+m.get(key));
        }


    }
    
}
