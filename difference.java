import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;



public class difference {

    public static void diff(int n){
        LinkedList<Integer> MyList = new LinkedList<>();
        for (int i = 0; i < n ;i ++){
            MyList.add(i);
        }

        long start_time = System.currentTimeMillis();

        Iterator<Integer> iter = MyList.iterator();
        while(iter.hasNext()){
            iter.next();
        }

        long end_time = System.currentTimeMillis();

        long time_taken = end_time - start_time;
        System.out.println("Time Taken:" + time_taken);
    }
    public static void main(String[]args){
        diff(5000);
        diff(3000000);
    }
}
