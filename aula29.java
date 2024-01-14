/*import java.util.*;

class aula29
{
    static Queue<Integer> q = new LinkedList<Integer>();
    static boolean checkSorted(int n)
    {
        Stack<Integer> st = new Stack<Integer>();
        int expected = 1;
        int fnt;

        while(q.size() != 0)
        {
            fnt = q.peek();
            q.poll();

            if(fnt == expected)
                expected++;
            else
            {
                if(st.size() == 0)
                {
                    st.push(fnt);
                }
                else if(st.size() != 0 && st.peek() < fnt)
                {
                    return false;
                }
                else
                st.push(fnt);
            }

            while(st.size() != 0 && st.peek() == expected)
            {
                st.pop();
                expected++;
            }
        }

        if(expected -1 == n && st.size() == 0)
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        q.add(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        int n = q.size();
        if(checkSorted(n))
            System.out.println("yes");
        else
            System.out.println("No");
    }   

}
 */

//https://www.geeksforgeeks.org/check-queue-can-sorted-another-queue-using-stack/?ref=lbp