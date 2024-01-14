class aula34{
    static void lefSmaller(int arr[], int n,  int SE[])
    {
        java.util.Stack<Integer> S = new java.util.Stack<>();
        for(int i = 0; i < n; i++)
        {
            while(!S.empty() && S.peek() >= arr[i])
            {
                S.pop();
            }
            if(!S.empty())
            {
                SE[i] = S.peek();
            }
            else{
                SE[i] = 0;
            }
            S.push(arr[i]);
        }
    }
    static int findMaxDiff(int arr[], int n)
    {
        int[] LS = new int[n];
        lefSmaller(arr, n, LS);
        int[]RRS = new int[n];
        reverse(arr);
        lefSmaller(arr, n, RRS);
        int result = -1;
        for(int i = 0; i < n; i++){
            result = Math.max(result, Math.abs(LS[i] - RRS[n -1 - i]));
        }
        return result;
    }
    static void reverse(int a[])
    {
        int i, n = a.length;
        int t;
        for(i = 0; i < n /2; i++)
        {
            t = a[i];
            a[i] = a[n -i -1];
            a[n -i -1] = t;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {2, 4, 8, 7, 7, 9, 3};
        int n = arr.length;
        System.out.println("maximum diff : " + findMaxDiff(arr, n));
    }
}
//https://www.geeksforgeeks.org/find-maximum-difference-between-nearest-left-and-right-smaller-elements/?ref=lbp