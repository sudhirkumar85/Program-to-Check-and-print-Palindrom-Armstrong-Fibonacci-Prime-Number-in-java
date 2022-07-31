import java.io.*;
import java.lang.*;
import java.util.*;
class Check
{
    public static void main(String S[])
    {
        int choise=0;
        int flag=1,i,a,n;
        Scanner sc=new Scanner(System.in);
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("Press 1.If you want to print Armstrong Number as far as you want to print Armstrong Number.");
            System.out.println("Press 2.If you want to print Fibonacci series as far as you want to print Fibonacci Series.");
            System.out.println("Press 3.If you want to Know whoes Number is Armstrong Number.");
            System.out.println("Press 4.If you want to Know whoes Number is palindrome Number.");
            System.out.println("Press 5.If you want to print palindrome Number as far as you want to print palindrome Number.");
            System.out.println("Press 6.If you want to print prime number as far as you want to print Prime Number.");
            System.out.println("Press 0.for exit.");
            System.out.print("Enter your choise:->");
            try
            {
                choise=Integer.parseInt(ob.readLine());
                switch(choise)
                {
                    case 0:
                        System.exit(0);
                    case 1:
                        int num_aa;
                        try
                        {
                            while(true)
                            {
                                System.out.print("Enter Number as far as you want to print Armstrong Number:->");
                                num_aa=Integer.parseInt(ob.readLine());
                                if(num_aa>0)
                                    break;
                                else
                                    System.out.println("Plase Enter Number greater than 0. try again...");
                            }
                            System.out.println("Result:..");
                            int temp_aa,d_aa=0,sum_aa=0,i_aa=1;
                            while(i_aa<=num_aa)
                            {
                                temp_aa=i_aa;
                                while(temp_aa != 0)
                                    {
                                        d_aa++;
                                        temp_aa=temp_aa/10;
                                    }
                                temp_aa=i_aa;
                                while(temp_aa!=0)
                                    { 
                                        sum_aa+=(Math.pow((temp_aa%10),d_aa));
                                        temp_aa=temp_aa/10;
                                    }
                                if(i_aa==sum_aa)
                                    System.out.print(i_aa+","); 
                                i_aa++;
                                sum_aa=0;
                                d_aa=0;
                            } 
                            System.out.println("\b.");    
                        }
                        catch(Exception ex)
                        {
                            System.out.println("You are not Entered valid Number,So Plase try again... ");
                        }
                        break;
                    case 2:
                        int num_f;
                        try
                        {
                            while(true)
                            {
                                System.out.print("Enter Number as far as you want to print Fabonacci series:->");
                                num_f=Integer.parseInt(ob.readLine());
                                if(num_f>0)
                                    break;
                                else
                                    System.out.println("Plase Enter Number greater than 0. \nTry again...");
                            }
                            System.out.println("Result:..");
                            int n1=0,n2=1,s1,i_f;
                            for(i_f=1;i_f<=num_f;i_f++)
                            {
                                System.out.print(n1+",");
                                s1=n1+n2;
                                n1=n2;
                                n2=s1;
                            }
                            System.out.println("\b.");
                        }
                        catch(Exception ex)
                        {
                            System.out.println("You are not Entered valid Number, \nPlase try again....");
                        }
                        break;
                    case 3:
                        int num_a;
                        try
                        {
                            while(true)
                            {
                                System.out.print("Enter the Number you want to check Armstrong Number:->");
                                num_a=Integer.parseInt(ob.readLine());
                                if(num_a>0)
                                    break;
                                else
                                    System.out.println("Plase Enter Number greater than 0.\n Try again...");
                            }
                            int temp_a,d_a=0,sum_a=0;
                            temp_a=num_a;
                            while(temp_a!=0)
                                {
                                    d_a++;
                                    temp_a=temp_a/10;
                                }
                            temp_a=num_a;
                            while(temp_a!=0)
                                { 
                                    sum_a+=(Math.pow((temp_a%10),d_a));
                                    temp_a=temp_a/10;
                                }
                                if(num_a==sum_a)
                                    System.out.println(num_a+" is Armstrong Number.");  
                                else
                                    System.out.println(num_a+" is not Armstrong Number.");      
                        }
                        catch(Exception ex)
                        {
                            System.out.println("You are not Entered valid Number,So Plase try again .....");
                        }
                        break;
                    case 4:
                        int num_pp;
                        try
                        {
                            while(true)
                            {
                                System.out.print("Enter the Number you want to check palindrome Number:->");
                                num_pp=Integer.parseInt(ob.readLine());
                                if(num_pp>0)
                                    break;
                                else
                                    System.out.println("Plase Enter Number greater than 0. try again...");
                            }
                            int temp_pp,cmp_pp=0;
                            temp_pp=num_pp;
                            while(temp_pp!=0)
                                {
                                    cmp_pp = (cmp_pp*10) + (temp_pp%10);
                                    temp_pp=temp_pp/10;
                                }
                                if(num_pp==cmp_pp)
                                    System.out.println(num_pp+" is Palindrome Number.");  
                                else
                                    System.out.println(num_pp+" is not Palindrome Number.");      
                        }
                        catch(Exception ex)
                        {
                            System.out.println("You are not Entered valid Number,So Plase try again......");
                        }
                        break;
                    case 5:
                        int num_p;
                        try
                        {
                            while(true)
                            {
                                System.out.print("Enter Number as far as you want to print palindrome Number:->");
                                num_p=Integer.parseInt(ob.readLine());
                                if(num_p>0)
                                    break;
                                 else
                                    System.out.println("Plase Enter Number greater than 0. try again...");
                            }
                            int i_p,temp_p,cmp_p;
                            for(i_p=1;i_p<=num_p;i_p++)
                            {
                                cmp_p=0;
                                temp_p=i_p;
                                while(temp_p!=0)
                                {
                                    cmp_p = (cmp_p*10) + (temp_p%10);
                                    temp_p=temp_p/10;
                                }
                                if(i_p==cmp_p)
                                    System.out.print(cmp_p+",");
                            }
                            System.out.println("\b.");
                        }
                        catch(Exception ex)
                        {
                            System.out.println("You are not Entered valid Number,So Plase try again .....");
                        }
                        break;
                    case 6:
                        try
                        {
                            
                            while (true)
                                {
                                    System.out.print("Enter Number as far as you want to print prime number:->");
                                    n=sc.nextInt();
                                    if(n<=1)
                                    {
                                        System.out.println("Plase Enter Number Greater then 1. try again... ");
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                for(a=2;a<=n;a++)
                                {
                                    flag=1;
                                    for(i=2;i<=a/2;i++)
                                    {
                                        if(a%i==0)
                                        {
                                            flag=0;
                                            break;
                                        }
                                    }
                                    if(flag==1)
                                    {
                                        System.out.print(a+",");
                                    }
                                }
                            System.out.println("\b.");
                        }
                        catch(Exception exp)
                        {
                            System.out.println("You are not Entered valid Number.\n Plase try again ......");
                        }
                        break;                      
                    default:
                        System.out.println("Plase Entre valid number...");
                        break;
                }
            }
            catch(Exception exp)
            {
                System.out.println("Plase Entre valied number....");

            }
        }

    }
}