
import java.util.Stack;
import java.util.Scanner;
public class infixtopostfix {

    static int prec(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
               return 3;
        }
 return -1;
    }

   static String infix_post(String exp){
       String result = new String();
       Stack<Character>stack=new Stack<>();
        for (int i=0;i<exp.length();i++){
            char c=exp.charAt(i);

            if(Character.isLetterOrDigit(c)){
                result+=c;
            }
            else if (c=='('){
                stack.push(c);
            }
            else if(c==')') {
                while (!stack.isEmpty() && stack.peek()!='(')
                    result += stack.pop();

                if(!stack.isEmpty() && stack.peek()!='('){
                    return "invalid expression";
                }
                else stack.pop();


            }
            else{
                while(!stack.isEmpty() && prec(stack.peek())>=prec(c))
                  result+=stack.pop();

                stack.push(c);
            }

        }
        while(!stack.isEmpty())
            result+=stack.pop();

            return result;
    }




   public static void main(String []args){
       Scanner in=new Scanner(System.in);
       String exp=in.nextLine();
       System.out.println(infix_post(exp));
   }

}
