public class Main {

    public static void main(String[] args) {

        IntegerLinkedList lists = new IntegerLinkedList();
        lists.add(75);
        lists.add(43);
        lists.add(6);
        lists.add(4);
        lists.add(100);
        lists.add(55);

        System.out.println("The size is: "+ lists.size());
        System.out.println("Does number 4 exists int list? "+ lists.find(4) );
        System.out.println("The largest integer in the list is: "+ lists.max());
        System.out.println("The smallest integer in the list is: "+ lists.min());
    }
}
