import java.util.Scanner;
public class j2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        char op=' ';
        int pos=-1;
        for(int i=0;i<line.length();i++)
        {
            char ch=line.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' ||ch=='/'){
                op=ch;
                pos=i;
                break;
        }
    }
    String l=line.substring(0,pos);
    String right=line.substring(pos+1);
    double a=Double.parseDouble(l);
    double b=Double.parseDouble(right);
    double r=0;
    switch(op)
        {
            case '+':r=a+b;break;
            case '-':r=a-b;break;
            case '*':r=a*b;break;
            case '/':r=a/b;break;
        }
      long ans=Math.round(r);
      System.out.println(line+" = "+ans);
}}
