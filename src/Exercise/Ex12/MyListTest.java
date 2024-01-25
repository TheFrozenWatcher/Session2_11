package Exercise.Ex12;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println("Original List: " + myList.toString());

        myList.add(1, "D");
        System.out.println("After adding 'D' at index 1: " + myList);

        myList.remove(2);
        System.out.println("After removing element at index 2: " + myList);

        System.out.println("Size of the list: " + myList.size());

        MyList<String> clonedList = myList.duplicate();
        System.out.println("Cloned List: " + clonedList);

        System.out.println("Does the list contain 'B'? " + myList.contains("B"));
        System.out.println("Index of 'A': " + myList.indexOf("A"));

        myList.add("E");
        System.out.println("After adding 'E': " + myList);

        System.out.println("Element at index 2: " + myList.get(2));

        myList.clear();
        System.out.println("After clearing the list: " + myList);
    }
}
