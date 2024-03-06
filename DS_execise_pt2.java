import java.util.LinkedList;

public class DS_execise_pt2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(7);
        linkedList.add(30);

        System.out.println("Elements of LinkedList: ");
        for (int i : linkedList) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i : linkedList) {
            sum += i;
        }
        System.out.println("Sum of all elements: " + sum);

        LinkedList<String> list = new LinkedList<>();
        list.add("Tom");
        list.add("Dick");
        list.add("Harry");
        list.add("Sam");

        int tomIndex = list.indexOf("Tom");
        int samIndex = list.indexOf("Sam");

        list.add(tomIndex, "Bill");
        list.add(samIndex, "Sue");

        list.remove("Bill");
        list.remove("Sam");

        System.out.println("Final LinkedList: ");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
