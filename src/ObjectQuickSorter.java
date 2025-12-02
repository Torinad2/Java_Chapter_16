/***********************************************************
 * ObjectQuickSorter                                       *
 * Performs quicksort on an array of Comparable            *
 * objects.                                                *
 ***********************************************************/

public class ObjectQuickSorter {

    //******************************************************
    // Public quickSort method                             *
    // Calls the recursive doQuickSort method.             *
    //******************************************************
    public static void quickSort(Comparable[] array)
    {
        doQuickSort(array, 0, array.length - 1);
    }

    //******************************************************
    // Recursive quicksort method                          *
    // Divides the array around a pivot and sorts each     *
    // sublist.                                            *
    //******************************************************
    private static void doQuickSort(Comparable[] array, int start, int end)
    {
        int pivotPoint;

        if (start < end)
        {
            //**********************************************
            // Get the pivot point.                        *
            //**********************************************
            pivotPoint = partition(array, start, end);

            //**********************************************
            // Sort the first sublist.                     *
            //**********************************************
            doQuickSort(array, start, pivotPoint - 1);

            //**********************************************
            // Sort the second sublist.                    *
            //**********************************************
            doQuickSort(array, pivotPoint + 1, end);
        }
    }

    //******************************************************
    // partition method                                    *
    // Chooses a pivot, divides elements into left and     *
    // right lists, then returns pivot index.              *
    //******************************************************
    private static int partition(Comparable[] array, int start, int end)
    {
        Comparable pivotValue;  // Hold the pivot value
        int endOfLeftList;      // Last element in the left sublist
        int mid;                // Midpoint index

        //**************************************************
        // Find midpoint                                   *
        //**************************************************
        mid = (start + end) / 2;

        //**************************************************
        // Swap midpoint with first element to pivot moves *
        // to start                                        *
        //**************************************************
        swap(array, start, mid);

        //**************************************************
        // Save pivot                                      *
        //**************************************************
        pivotValue = array[start];

        //**************************************************
        // End of left list starts at the first element    *
        //**************************************************
        endOfLeftList = start;

        //**************************************************
        // Scan and move items < pivot to the left side    *
        //**************************************************
        for (int scan = start + 1; scan <= end; scan++)
        {
            if (array[scan].compareTo(pivotValue) < 0)
            {
                endOfLeftList++;
                swap(array, endOfLeftList, scan);
            }
        }

        //**************************************************
        // Move pivot to final location                    *
        //**************************************************
        swap(array, start, endOfLeftList);

        return endOfLeftList;
    }

    //******************************************************
    // swap method                                         *
    // Swaps two elements in the array.                    *
    //******************************************************
    private static void swap(Comparable[] array, int a, int b)
    {
        Comparable temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}

