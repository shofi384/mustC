public class BinarySearch {

    private static boolean binarySearch(int a[], int n, int key) {
        int low = 0; // 1 assignment
        int high = n - 1;    // 1 assignment

        while (low <= high) {    // log n comparisons
            int mid = (low + high)/2; // log n assignments
            if(a[mid]==key) return true;
            if (a[mid] > key) //log n comparisons
                high = mid - 1;    //log n assignments
            else if (a[mid] < key)    //log n comparisons
                low = mid + 1;    //log n assignments
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = new int[args.length];
	for(int i=0; i<args.length; i++)
		a[i] = Integer.parseInt(args[i]);
        System.out.println("\n1 is "+ (binarySearch(a, args.length, 1)? "found." : "not found."));
        System.out.println("5 is "+ (binarySearch(a, args.length, 5)? "found." : "not found."));
    }
}
