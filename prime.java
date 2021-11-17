import java.util.Scanner;
class prime 
{  
        public static void main(String args[])
        { Scanner sr=new Scanner(System.in);
         int i,flag=0,n;      
         n=sr.nextInt();   
         if(n==0||n==1)       
          {
              System.out.println(n+" is not prime number");
              flag=1;
          }
          if (flag==0)
          {
              for(i=2;i<n;i++)
            {      
           if(n%i==0)
           {      
            System.out.println(n+" is not prime number");      
            flag=1;      
            break;      
           }    
           }  
          }    
          if(flag==0)  { System.out.println(n+" is prime number"); }  
         }
        }

