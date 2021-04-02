import java.util.HashMap;

public class HashMapsCool {

    public static void main(String[] args){

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();

//        map.put("ecombee","Jorden2009");
//        map.put("jcombee","November5");
//        map.put("jorden","Jorden2009");
//        map.put("ellie","Ellie2011");
//        map.put("jonah","jonah2013");

        String search = "aaabcccdeeefffgeeffffff";




        for(int i=0;i<search.length();i++){
            char input = search.charAt(i);
            map.putIfAbsent(input, 1);
        }

        System.out.println(map);

        for(int i=0;i<search.length();i++){
            char input = search.charAt(i);

//            if(map.containsKey(input)){
//                int crt = map.get(input) + 1;
//                map.get(input,crt);
//            }

            map.putIfAbsent(input, 1);
        }

        System.out.println(map);

    }
}
