
public class removeOuter {
    public static String removeOuterParantheses(String s)
    {  int counter=0;
         StringBuilder st=new StringBuilder();
         for(int i=0;i<s.length();i++)
         {
            if(s.charAt(i)=='(')
            {
                if(counter>0)
                st.append('(');

                counter++;
            }
            else
           {
            counter--;

            if(counter>0)
            st.append(')');
           }
         }
         return st.toString();
    }
    public static void main(String[] args) {
        String s="(()())(())";
        System.out.println("String :"+s);
        System.out.println("String after removing outermost parenthesis"+removeOuterParantheses(s));
    }
}
