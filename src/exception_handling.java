import java.util.HashSet;
import java.util.Iterator;

class HashSetExample{
    public static void main(String[] args){
        //creating HashSet and adding elements to it 
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(3);
        //getting an iterator for the collection 
        Iterator<Integer> i=hashSet.iterator();
        //iterating over the value 
        while(i.hasNext())  {
            System.out.println(i.next());
        }
    }
} 