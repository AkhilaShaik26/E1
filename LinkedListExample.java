import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 1. add(E e): Appends the specified element to the end of this list.
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After add: " + list);

        // 2. add(int index, E element): Inserts the specified element at the specified position in this list.
        list.add(1, "Orange");
        System.out.println("After add with index: " + list);

        // 3. addAll(Collection<? extends E> c): Appends all of the elements in the specified collection to the end of this list.
        LinkedList<String> moreFruits = new LinkedList<>();
        moreFruits.add("Grapes");
        moreFruits.add("Pineapple");
        list.addAll(moreFruits);
        System.out.println("After addAll: " + list);

        // 4. addAll(int index, Collection<? extends E> c): Inserts all of the elements in the specified collection into this list, starting at the specified position.
        LinkedList<String> tropicalFruits = new LinkedList<>();
        tropicalFruits.add("Mango");
        tropicalFruits.add("Papaya");
        list.addAll(2, tropicalFruits);
        System.out.println("After addAll with index: " + list);

        // 5. addFirst(E e): Inserts the specified element at the beginning of this list.
        list.addFirst("Strawberry");
        System.out.println("After addFirst: " + list);

        // 6. addLast(E e): Appends the specified element to the end of this list.
        list.addLast("Kiwi");
        System.out.println("After addLast: " + list);

        // 7. clear(): Removes all of the elements from this list.
        list.clear();
        System.out.println("After clear: " + list);

        // Re-add elements for further operations
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // 8. contains(Object o): Returns true if this list contains the specified element.
        boolean containsApple = list.contains("Apple");
        System.out.println("Contains Apple: " + containsApple);

        // 9. get(int index): Returns the element at the specified position in this list.
        String fruit = list.get(1);
        System.out.println("Element at index 1: " + fruit);

        // 10. getFirst(): Returns the first element in this list.
        String first = list.getFirst();
        System.out.println("First element: " + first);

        // 11. getLast(): Returns the last element in this list.
        String last = list.getLast();
        System.out.println("Last element: " + last);

        // 12. indexOf(Object o): Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        int indexOfBanana = list.indexOf("Banana");
        System.out.println("Index of Banana: " + indexOfBanana);

        // 13. isEmpty(): Returns true if this list contains no elements.
        boolean isEmpty = list.isEmpty();
        System.out.println("Is list empty: " + isEmpty);

        // 14. remove(int index): Removes the element at the specified position in this list.
        list.remove(1);
        System.out.println("After remove index 1: " + list);

        // 15. remove(Object o): Removes the first occurrence of the specified element from this list, if it is present.
        list.remove("Apple");
        System.out.println("After remove 'Apple': " + list);

        // Re-add elements for further operations
        list.add("Banana");
        list.add("Cherry");

        // 16. removeFirst(): Removes and returns the first element from this list.
        String removedFirst = list.removeFirst();
        System.out.println("After removeFirst: " + removedFirst + ", List: " + list);

        // 17. removeLast(): Removes and returns the last element from this list.
        String removedLast = list.removeLast();
        System.out.println("After removeLast: " + removedLast + ", List: " + list);

        // Re-add elements for further operations
        list.add("Banana");
        list.add("Cherry");

        // 18. set(int index, E element): Replaces the element at the specified position in this list with the specified element.
        list.set(1, "Strawberry");
        System.out.println("After set: " + list);

        // 19. size(): Returns the number of elements in this list.
        int size = list.size();
        System.out.println("Size of list: " + size);

        // 20. toArray(): Returns an array containing all of the elements in this list in proper sequence (from first to last element).
        Object[] array = list.toArray();
        System.out.println("Array: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 21. subList(int fromIndex, int toIndex): Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        list.add("Pineapple");
        list.add("Grapes");
        LinkedList<String> subList = new LinkedList<>(list.subList(1, 3));
        System.out.println("Sublist: " + subList);

        // 22. clone(): Returns a shallow copy of this LinkedList instance.
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList);

        // 23. peek(): Retrieves, but does not remove, the head (first element) of this list.
        String peek = list.peek();
        System.out.println("Peek: " + peek);

        // 24. poll(): Retrieves and removes the head (first element) of this list.
        String poll = list.poll();
        System.out.println("Poll: " + poll + ", List: " + list);

        // 25. offer(E e): Adds the specified element as the tail (last element) of this list.
        list.offer("Kiwi");
        System.out.println("After offer: " + list);
    }
}

