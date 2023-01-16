package HashTable;

public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();

        myHashTable.set("paint", 20);
        myHashTable.set("bolts", 40);
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println( myHashTable.keys() );

    	/*
        	EXPECTED OUTPUT:
        	----------------
        	[paint, bolts, nails, tile, lumber]


           INTERVIEWS QUESTION

           Problem:
           See if two arrays contains the items in common
           example int[] arr1 =[1,3,5] and int [] arr2 = [2,4,5]

           Answer 1:  Using ARRAYS

           public class Main {

    public static boolean itemInCommon(int[] array1, int[] array2) {
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));

    }

}
     ANSWER 2: USING HASHMAP

     public class Main {

    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<Integer, Boolean>();

        for (int i : array1) {
            myHashMap.put(i, true);
        }

        for (int j : array2) {
            if (myHashMap.get(j) != null) return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));
    }

}



    	*/

    }

}

