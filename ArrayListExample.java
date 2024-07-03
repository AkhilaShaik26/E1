import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 1. add(E e): Appends the specified element to the end of this list.
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After add: " + list);

        // 2. add(int index, E element): Inserts the specified element at the specified position in this list.
        list.add(1, "Orange");
        System.out.println("After add with index: " + list);

        // 3. addAll(Collection<? extends E> c): Appends all of the elements in the specified collection to the end of this list.
        ArrayList<String> moreFruits = new ArrayList<>();
        moreFruits.add("Grapes");
        moreFruits.add("Pineapple");
        list.addAll(moreFruits);
        System.out.println("After addAll: " + list);

        // 4. addAll(int index, Collection<? extends E> c): Inserts all of the elements in the specified collection into this list, starting at the specified position.
        ArrayList<String> tropicalFruits = new ArrayList<>();
        tropicalFruits.add("Mango");
        tropicalFruits.add("Papaya");
        list.addAll(2, tropicalFruits);
        System.out.println("After addAll with index: " + list);

        // 5. clear(): Removes all of the elements from this list.
        list.clear();
        System.out.println("After clear: " + list);

        // Re-add elements for further operations
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // 6. contains(Object o): Returns true if this list contains the specified element.
        boolean containsApple = list.contains("Apple");
        System.out.println("Contains Apple: " + containsApple);

        // 7. get(int index): Returns the element at the specified position in this list.
        String fruit = list.get(1);
        System.out.println("Element at index 1: " + fruit);

        // 8. indexOf(Object o): Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        int indexOfBanana = list.indexOf("Banana");
        System.out.println("Index of Banana: " + indexOfBanana);

        // 9. isEmpty(): Returns true if this list contains no elements.
        boolean isEmpty = list.isEmpty();
        System.out.println("Is list empty: " + isEmpty);

        // 10. remove(int index): Removes the element at the specified position in this list.
        list.remove(1);
        System.out.println("After remove index 1: " + list);

        // 11. remove(Object o): Removes the first occurrence of the specified element from this list, if it is present.
        list.remove("Apple");
        System.out.println("After remove 'Apple': " + list);

        // Re-add elements for further operations
        list.add("Banana");
        list.add("Cherry");

        // 12. removeAll(Collection<?> c): Removes from this list all of its elements that are contained in the specified collection.
        list.removeAll(tropicalFruits);
        System.out.println("After removeAll: " + list);

        // 13. retainAll(Collection<?> c): Retains only the elements in this list that are contained in the specified collection.
        list.add("Mango");
        list.add("Apple");
        list.retainAll(moreFruits);
        System.out.println("After retainAll: " + list);

        // 14. set(int index, E element): Replaces the element at the specified position in this list with the specified element.
        list.set(1, "Strawberry");
        System.out.println("After set: " + list);

        // 15. size(): Returns the number of elements in this list.
        int size = list.size();
        System.out.println("Size of list: " + size);

        // 16. toArray(): Returns an array containing all of the elements in this list in proper sequence (from first to last element).
        Object[] array = list.toArray();
        System.out.println("Array: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 17. subList(int fromIndex, int toIndex): Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        list.add("Pineapple");
        list.add("Grapes");
        ArrayList<String> subList = new ArrayList<>(list.subList(1, 3));
        System.out.println("Sublist: " + subList);

        // 18. clone(): Returns a shallow copy of this ArrayList instance.
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList);
    }
}

