import java.util.Scanner;
public class j1
{
  static String findLongest(String s){
      String longestWord="";
      String[] words = s.split("\\s+");
      for(String word:words)
      {
          if(word.length()>longestWord.length())
          {
              longestWord=word;
          }
      }
      return longestWord;
  }
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your string:");
      String k=sc.nextLine();
      String l=findLongest(k);
      System.out.println("The longest word is: " + l);
  }
}
