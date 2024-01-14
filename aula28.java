import java.util.Stack;
import java.util.Vector;

public class aula28
{
    public static void main(String[] args)
    {
        Stack<Character> st = new Stack<Character>();
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        st.push('7');
       
        Vector<Character> v = new Vector<Character>();
        while(!st.empty())
        {
            v.add(st.pop());
        }
        int n = v.size();
        if(n %2 == 1 )
        {
            int target = (n / 2);
            for(int i = 0; i < n; i++)
            {
                if(i == target) continue;
                st.push(v.get(i));
            }
        }
        System.out.print("Pirntin stack depois de deletar o item do meio: ");
        while(!st.empty())
        {
            char p = st.pop();
            System.out.print(p + " ");
        }
    }
}
