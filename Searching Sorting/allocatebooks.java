import java.util.*;

class BooksAllocate {

    public static boolean isPossible(int[] arr, int n, int m, int mid) {
        // let's have Student count
        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < n; i++) {
            if (pageSum + arr[i] <= mid) {
                // allocate the page to the current Student
                pageSum += arr[i];
            } else {
                // now the new student should get the pages
                studentCount++;
                // check the condition
                if (studentCount > m || arr[i] > mid) {
                    // no partition can be done
                    return false;
                }
                // otherwise allocate the page to the new student
                pageSum = 0;
                pageSum = arr[i];
            }

        }
        return true;

    }

    // Function to find minimum number of pages.
    public static int findPages(int[] arr, int N, int M) {
        // Your code here
        // if no. of books is less than the no. of students
        if (N < M)
            return -1;

        int start = 0;
        int end = 0;
        for (int i = 0; i < N; i++) {
            end += arr[i];
        }

        int ans = -1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            // if mid is a possible solution then
            if (isPossible(arr, N, M, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {

        // Book Allocation to Students
        int arr[] = { 12, 34, 67, 90 };
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students ");
        int TotalStudents = sc.nextInt();

        int res = findPages(arr, arr.length, TotalStudents);

        System.out.println(res == -1 ? "Books cannot be allocated"
                : "Minimum Books ALlocated Successfully with minimum pages => " + res);

        sc.close();

    }
}