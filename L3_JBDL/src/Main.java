import Functional.FunctionInter;
import Functional.FunctionInterImpl;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

      //  System.out.printf("Hello and welcome!");
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list.addAll(list2);

        //System.out.print(list);

        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(2);
        st.push(5);
        //System.out.print(st.pop());

        HashSet<Integer> set = new HashSet<>();
        set.add(2);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(1);
        pq.add(5);

       /* while (pq.size()>0){
            System.out.println(pq.remove());
        }*/

       /* HashMap<Integer,Integer> map = new HashMap<>();
        map.put(2,3);
        map.put(1,2);

        for (int key: map.keySet()){
            System.out.println(map.get(key));
        }*/
       /* FunctionInter obj = new FunctionInterImpl();
        obj.show();*/

        //FunctionInter obj = (a,b)->  a+b;
      /*  Function<Integer,Integer> function = (integer)-> integer*integer;
        Predicate<Integer> predicate = (a)->a%2==0;


        System.out.println(square(2));
        System.out.println(function.apply(2));
        System.out.println(predicate.test(3));*/


        List<Integer> l = Arrays.asList(2,3,1,4,5,6,7);

        /*List<Integer> even = new ArrayList<>();
        for (int i=0;i<l.size();i++){
            int val = l.get(i);
            if (val%2==0){
                even.add(val);
            }
        }

        System.out.println(even);*/

        List<Integer> even = l.stream().filter(i->i%2==0).collect(Collectors.toList());

        //System.out.println(even);
       List<Integer> square = l.stream().mapgmail((a)->a*a).collect(Collectors.toList());
        System.out.println(square);

    }

    public static int square(int a){
        return a*a;
    }
}