//WAP to check if the given contact number is valid or invalid using regular
//expressions
import java.util.regex.*;
import java.io.*;
 
class validphone{
 
    public static boolean Validno(String phonenumber)
    {
       
        String regex= phonenumber.replaceAll("[^a-zA-Z0-9]","");
 
        Pattern p = Pattern.compile("[0-9]*");
        Matcher m = p.matcher(regex);
      
        
	System.out.println(phonenumber);
	
	if (phonenumber == null) {
           return false;
        }
 
        
	return m.matches();
    }
 
    
    public static void main(String args[])
    {
        String str1 = "2124567890";
       	System.out.println(Validno(str1));
 	System.out.println("");
       
	String str2 = "212-456-7890";
       	System.out.println(Validno(str2));
	System.out.println();
       
 	String str3 = "(212)456-7890";
        System.out.println(Validno(str3));
	System.out.println();
 
        String str4 = "(212)-456-7890";
        System.out.println(Validno(str4));
	System.out.println();
	

	String str5 = "212.456.7890";
        System.out.println(Validno(str5));
	System.out.println();

	String str6 = "212 456 7890";
        System.out.println(Validno(str6));
	System.out.println();

	String str7 = "+12124567890";
        System.out.println(Validno(str7));
	System.out.println();

	String str8 = "+12124567890";
        System.out.println(Validno(str8));
	System.out.println();


	String str9 = "+1 212.456.7890";
        System.out.println(Validno(str9));
	System.out.println();

	String str10 = "+212-456-7890";
        System.out.println(Validno(str10));
	System.out.println();

	String str11 = "1-212-456-7890";
        System.out.println(Validno(str11));
	System.out.println();
	
    }
}
