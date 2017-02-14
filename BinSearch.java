/*  Zaki G Lindo
    CIS 303 - Algorithm Analysis and Design
    Assignment II - BinSearch.java
    2/14/17
*/
import java.util.*;

public class BinSearch {

    public static int BIN_CALLS;


    public static int binSearch(int [] a, int target) {
	BIN_CALLS = 0;
        return binSearch(a, 0, a.length-1, target);
    }

    public static int binSearch(int [] a, int low, int high, int target) {
        BIN_CALLS++;									// Keep track of number of calls
        int middle = (int)Math.floor((low + high)/2);	// To split array into halves
        if (a[high] < target || a[low] > target)		// Check to see if a.contains(target)
        	return -1;	//Indicates Failure
        if (a[low] == target)							// Base case to return lowest value
        	return low;									
        if (a[middle] >= target)						// Run search on bottom half
        	return binSearch(a, low + 1, middle - 1, target);
        if (a[middle] < target)							// Run search on top half
        	return binSearch(a, middle + 1, high, target);
        return middle;									// Return index of target
    }
}
