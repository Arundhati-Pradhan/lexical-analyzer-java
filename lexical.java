import java.util.*;
import java.io.*;
import java.io.FileWriter;
public class lexical_analyzer{
    public static void main(String arg[])throws Exception{
        Scanner sc = new Scanner(new File("lexical_input.java"));
        String i[] = {"main","printf"};
        String l[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String t[] = {",",";","{","}","(",")"};
        String o[] = {"+","-","/","*","%","="};
        String k[] = {"int","float","double","boolean","void","if","for","while","else if"};
        int a = 0;
       
        FileWriter fw1 = new FileWriter(new File("identifier.txt"),true);
        FileWriter fw2 = new FileWriter(new File("literal.txt"),true);
        FileWriter fw3 = new FileWriter(new File("terminal.txt"),true);
        FileWriter fw4 = new FileWriter(new File("operator.txt"),true);
        FileWriter fw5 = new FileWriter(new File("keyword.txt"),true);
        while(sc.hasNext()){
            String b = sc.next();
            if((b.equals(i[0]))||(b.equals(i[1]))){
                System.out.println(b+" is an identifier");
                fw1.write(b+" ");
            }
            else if((b.equals(l[0]))||(b.equals(l[1]))||(b.equals(l[2]))||(b.equals(l[3]))||(b.equals(l[4]))||(b.equals(l[5]))||(b.equals(l[6]))||(b.equals(l[7]))||(b.equals(l[8]))||(b.equals(l[9]))||(b.equals(l[10]))||(b.equals(l[11]))||(b.equals(l[12]))||(b.equals(l[13]))||(b.equals(l[14]))||(b.equals(l[15]))||(b.equals(l[16]))||(b.equals(l[17]))||(b.equals(l[18]))||(b.equals(l[19]))||(b.equals(l[20]))||(b.equals(l[21]))||(b.equals(l[22]))||(b.equals(l[23]))||(b.equals(l[24]))||(b.equals(l[25]))){
                System.out.println(b+" is a literal");
                fw2.write(b+" ");
            }
            else if((b.equals(t[0]))||(b.equals(t[1]))||(b.equals(t[2]))||(b.equals(t[3]))||(b.equals(t[4]))||(b.equals(t[5]))){
                System.out.println(b+" is a terminal");
                fw3.write(b+" ");
            }
            else if((b.equals(o[0]))||(b.equals(o[1]))||(b.equals(o[2]))||(b.equals(o[3]))||(b.equals(o[4]))||(b.equals(o[5]))){
                System.out.println(b+" is an operator");
                fw4.write(b+" ");
            }
            else if((b.equals(k[0]))||(b.equals(k[1]))||(b.equals(k[2]))||(b.equals(k[3]))||(b.equals(k[4]))){
                System.out.println(b+" is a keyword");
                fw5.write(b+" ");
            }
           
        }
        fw1.close();
        fw2.close();
        fw3.close();
        fw4.close();
        fw5.close();
    }
}
