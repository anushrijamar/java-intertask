import java.util.*;
public class account
{
   // int choice;
    int withdraw(int amount,String name,long account_no)
    {
        account obj3=new account();
        Scanner s=new Scanner(System.in);
        int withdraw;
        System.out.println("Enter the money to be withdraw");
        Scanner sc = new Scanner(System.in);
        withdraw=sc.nextInt();
        if(amount>withdraw){
            int bal=amount-withdraw;
            System.out.println("-----------------------------------------");
            System.out.println("-----------------------------------------");
            System.out.println("Account holder:"+name);
            System.out.println("Account number"+account_no);
        System.out.println("You have withdraw "+withdraw+"Rs money.");
        System.out.println("The balanced amount is "+bal+"Rs");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");}
        else
        {
            System.out.println("-----------------------------------------");
      System.out.println("-----------------------------------------");
            System.out.println("Insufficient balance");
            System.out.println("-----------------------------------------");
      System.out.println("-----------------------------------------");
        }
        System.out.println("Want to continue \n y or n");
        char ch=s.next().charAt(0);
        if(ch=='y')
{
   // System.out.println("YO");
    obj3.e();

}
     // return bal;
     return 0;
    }
    int deposit(int amount,String name,long account_no)
    {
        int deposit;
        account obj4=new account();
       // Scanner s=new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount for deposit");
        deposit=sc.nextInt();
        int total_amt=deposit+amount;
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("Account holder:"+name);
        System.out.println("Account number"+account_no);
        System.out.println("The total amount in your account is"+total_amt+"Rs");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
       // return total_amt;

       return 0;

    }
    void term(){
        int amount=5000;
        System.out.println("Enter the account holder name");
        Scanner s = new Scanner(System.in);
        String name=s.nextLine();
        System.out.println("Enter the account number");
        long account_no=s.nextLong();
        System.out.println("Enter the choice\nEnter 1 for withdraw\nEnter 2 for deposit\nEnter 3 for display amount\nEnter 4 for exit");
        int choice=s.nextInt();
        account obj2= new account();
       if(choice==1){
                obj2.withdraw(amount,name,account_no);
                   
            }
            if(choice==2){
                obj2.deposit(amount, name, account_no);
                System.out.println("Want to continue \n y or n");
                char ch=s.next().charAt(0);
                if(ch=='y')
         {
            obj2.e();
         
         }
            }
            if(choice==3)
            {
                System.out.println("Your account amount is "+amount+"Rs");
            }
            System.out.println("Want to continue \n y or n");
            char ch=s.next().charAt(0);
            if(ch=='y')
     {
       // System.out.println("YO");
        obj2.e();
     
     }
     if(choice==4)
     {
        System.out.println("THANK YOU");
     }
        }
            
         
        
        
       
  void e(){
       /*  System.out.println("Enter the choice\nEnter 1 for withdraw\nEnter 2 for deposit\nEnter 3 for display amount\nEnter 4 for exit");
       Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
   return choice;*/
   account obj1=new account();
obj1.term();
}
    public static void main(String args[])
    {
        int pin;
        int user_id;
        account obj= new account();   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your user id\t");
        user_id = sc.nextInt();
        System.out.println("Enter your pin");
        pin = sc.nextInt();
        if(pin==1234 && user_id==789)
        obj.term();
    }

}
