/**********************************************************
 * This program tests the quickSort method in the         *
 * ObjectQuickSorter class.                               *
 **********************************************************/

public class ObjectQuickSortDemo
{
    public static void main(String[] args)
    {
        //*************************************************
        // Create a String array with test values.        *
        // String implements Comparable.                  *
        //*************************************************
        String[] values = { "David", "Abe", "Katherine", "Beth", "Jeff", "Daisy" };

        //*************************************************
        // Display the array's original contents.         *
        //*************************************************
        System.out.println("Original order:");
        for (String element : values) System.out.print(element + " ");
        System.out.println();

        //*************************************************
        // Sort the array using ObjectQuickSorter.        *
        //*************************************************
        ObjectQuickSorter.quickSort(values);

        //*************************************************
        // Display the array's sorted contents.           *
        //*************************************************
        System.out.println("\nSorted order:");
        for (String element : values) System.out.print(element + " ");
        System.out.println();

        //*************************************************
        // Developer Credit                               *
        //*************************************************
        System.out.println();
        System.out.println("Developed by: Nikita Baiborodov");
    }
}