import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.xml.transform.Source;
public class task1 {
  public boolean login()
  {
    String name,pass,res;
    boolean y=false;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter username :  ");
    name=sc.nextLine();
    System.out.println("Enter the password");
    pass=sc.nextLine();
    System.out.println("Are u sure to proceed yes  or no");
     res=sc.nextLine();
    if (res.equals("yes") || res.equals("YES") || res.equals("Yes") || res.equals("yEs") || res.equals("yeS"))  
    {
        if(name.equals("admin") || name.equals("admin") )
        {
            if(pass.equals("admin"))
            y=true;
        }
        else
        y=false;
    }
    return y;
  }  


  public boolean register()
  {
    String arrival_place,destination,name,gender;
    int time,number_of_people,final_amt=0,i,k,count=0,flag=0,age;
  boolean h=false;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter name person");
    System.out.print("\t");
    name=s.nextLine();
    System.out.println("Enter your arrival");
    arrival_place=s.nextLine();
    System.out.println("to destination");
    destination=s.nextLine();
    System.out.println("Available trains are at \n10.00 am\n1.00pm\n5.00pm\n11.00pm\nChoose your suitable time");
    time=s.nextInt();
      System.out.println("Enter age of person");
     age=s.nextInt();
  
      if(age>=18)
      {
        final_amt=final_amt+300;
      }
      else if(age<18 && age>=12)
      {
        final_amt=final_amt+200;
      }
      else if(age>5 && age<12)

      final_amt=final_amt+150;
      else
      final_amt = final_amt+0;
    
    
      System.out.println("-----------------------------------------");
      System.out.println("-----------------------------------------");
      System.out.println(arrival_place+"---->"+destination);
      System.out.println("Time: "+time);
      System.out.println("Train number : 1253");
      System.out.println("Name\t\tAge\t\tGender");
      System.out.println(name+"\t\t"+age);
      System.out.println("-----------------------------------------");
      System.out.println("your final amount is "+final_amt);
      System.out.println("PNR number :");
      System.out.println("-----------------------------------------");
      System.out.println("-----------------------------------------");
      h=true;
    
return h;
  }
  public static void cancel()
  {
    String t;
    Scanner st=new Scanner(System.in);
    System.out.println("Enter your PNR number");
    t=st.nextLine();
    System.out.println("-----------------------------");
    System.out.println("-----------------------------");
    System.out.println(t+" Id SUCCESSFULLY CANCELLED");
    System.out.println("-----------------------------");
    System.out.println("-----------------------------");
  }
  public static void main(String args[])
  {
    int flag=0,count=0,choice;
    String r="yes";
    boolean h=false;
    task1 obj =new task1();
    task1 obj1 =new task1();
    // System.out.println("Enter your choice\t");
    while(flag!=1){
      if(count>=4)
      {
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("ERROR PLEASE TRY AFTER SOME");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        break;
      }
    boolean x=obj.login();
    if(x)
    {
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("Login successful");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        flag=1;
    }
    else{
      count++;
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("Login failed");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }}
    count=0;
    flag=0;
    
    while(r.equalsIgnoreCase("yes")){
      System.out.println("Enter choice\n 1.LOGIN\n2.REGISTERATION\n3.CANCELLATION\n");
      Scanner s = new Scanner(System.in);
      choice = s.nextInt();
      switch(choice){
      case 1:
    while(flag!=1){
      if(count>=4)
      {
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("ERROR PLEASE TRY AFTER SOME");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        break;
      }
    boolean x=obj.login();
    if(x)
    {
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("Login successful");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        flag=1;
    }
    else{
      count++;
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("Login failed");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }}
    break;
    case 2:
        h=obj1.register();   
      flag=0;
      while(flag!=1){    
        
      if(h)
      {
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("REGISTRATION SUCCESSFUL");
        System.out.println("---------------------");
        System.out.println("---------------------");
        flag=1;
      }     
      else{
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("Registration failed");
        System.out.println("---------------------");
        System.out.println("---------------------");
        obj1.register();
      } }
      break;
      case 3:
      Scanner sc=new Scanner(System.in);
      System.out.println("do you want to cancel the registeration\t");
      String res=sc.nextLine();
      if(res.equalsIgnoreCase("yes"))
      {
        cancel();
      }
     break;
  }     
  System.out.println("\nDo you want to continue\t");
  Scanner sk=new Scanner(System.in);
r=sk.nextLine();  
  }
}
}
