import java.util.HashMap;
import java.util.Map;

public class Ex3{
    public static void main(String []args){
        HashMap<String,String> map = new HashMap<>();
        map.put("Andrew","001");
        map.put("John","002");
        map.put("Hao Yi","003");
        map.put("Appu","004");
        map.put("Yin Shen","005");

        System.out.println("\nmap 1:");
        for(Map.Entry e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println("Map size: "+map.size());  

        HashMap<String,String> map2 = new HashMap<>();
        map2.put("Pang","006");
        map2.put("Alessa","007");
        map2.put("Nicola","008");

        System.out.println("\nmap 2:");
        for(Map.Entry e : map2.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println("\nAfter adding map 1 to map 2:");
        map2.putAll(map);
        for(Map.Entry e : map2.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        map.clear();
        System.out.println("\nAfter clearing map 1:");
        map2.putAll(map);
        for(Map.Entry e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

       System.out.println("Prints true if empty / false if not empty: "+map.isEmpty());

       HashMap<String,String> map3 = map2;
       System.out.println("shallow copy of map2 to map3\n "+map3);

       String name="John";
       if(map2.containsKey(name))
            System.out.println(name+" exists");
        else System.out.println("kk");
    
        String num="004";

        if(map2.containsValue(num))
            System.out.println(num+" exits");

        if(map2.containsKey(name))
            System.out.println(name+" value is "+map2.get(name));
        
        if(map2.containsValue(num))
            System.out.println(num+" key is "+map2.get(num));
        
        


    }
}