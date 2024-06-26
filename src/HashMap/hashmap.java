package HashMap;

//HashMap implementations and Problems

//Different ways to creating Hashmaps

import java.security.Key;
import java.util.HashMap;
class HashMapInitialize
{
    public static void main(String[] args)
    {
        //Creating HasMap with default method and syntax
        //1.Syntax-HashMap<key,value> var_name=new HashMap<>();
        HashMap<Integer, String> map=new HashMap<>();
        //Methods in HashMap
        map.put(256,"Rithickshan"); //Put method is used to mapping into its map with key-value Pairs
        map.put(282,"Vignesh");
        System.out.println(map);


        System.out.println(map.get(256));//get()-Get used to accessing value using the key
        System.out.println(map.clone());//clone()-Returns the shallow copy of the map
        map.put(186,"Aadhi");
        System.out.println(map);

        //compute()-remapping function to manipulate/update existing values in HashMap
        map.compute(186,(Key, val)->val.concat("sheshan"));
        System.out.println(map);
    }
}