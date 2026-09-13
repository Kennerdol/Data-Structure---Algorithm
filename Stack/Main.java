import java.util.Stack;

public class Main{
    public static void main(String[] args){

        // List<String> lst = new List<String>();
        Stack<String> st = new Stack<String>();
        st.push("Hello");
        st.push("World");
        st.push("Ryan");
        st.push("Sechela");
        st.push("Tembo");

        System.out.println("");
        System.out.println(st);

        System.out.println("");
        System.out.println(st.isEmpty());

        System.out.println("");
        System.out.println("Top most item: " + st.peek());

        System.out.println("");
        String removed = st.pop();
        System.out.println("Removed item: " + removed);

        System.out.println("");
        System.out.println(st);

        for(int i = 0; i <= 15; i++){
            st.push("Name");
        }

        System.out.println(st);
    }
}