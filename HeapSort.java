public class HeapSort {

    public static void maxHeapify(int a[], int i, int n) {
        int l = 2*i;
        int r = 2*i+1;

        int larger = i;
        if(l<n && a[l]>a[i])
            larger=l;
        if(r<n && a[r]>a[larger])
            larger=r;
        if(i!=larger)
        {
            int temp = a[i];
            a[i] = a[larger];
            a[larger] = temp;
            maxHeapify(a, larger, n);
        }
    }

    public static void buildHeap(int a[], int n) {
        for(int i=n/2+1; i>=0; i--)
        {
            maxHeapify(a, i, n);
        }

        for(int i=n-1; i>0; i--)
        {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            n=n-1;
            maxHeapify(a, 0, n);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[args.length];
        for(int i=0; i<args.length; i++)
            a[i] = Integer.valueOf(args[i]);
        buildHeap(a, args.length);

        System.out.println("\nThe elements in increasing order: ");
        for(int i =0; i<a.length; i++)
            System.out.print(a[i]+" ");
	System.out.println();
    }
}
