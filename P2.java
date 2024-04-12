import java.util.Scanner;
class P2
{
public static long add(long a, long b)
{
return a+b;
}
public static long sub(long a, long b)
{
return a-b;
}
public static long mul(long a, long b)
{
return a*b;
}
public static long div(long a, long b)
{
return a/b;
}
public static void main(String[] args) 
{
 Scanner sc=new Scanner(System.in);
 
 
long num1=sc.nextLong();
char ope =sc.next().charAt(0);
long num2=sc.nextLong();
long res=0;
while(true)
{
switch (ope)
{
case '+':
 res=add(num1,num2);
break;
case '-':
 res=sub(num1,num2);
break;
case '*':
 res=mul(num1,num2);
break;
case '/':
 res=div(num1,num2);
break;
default:
 System.out.println("Enter Invalid ope");
}
num1=res;
ope =sc.next().charAt(0);
if (ope == '=')
{
 break;
}
num2=sc.nextLong();
}
System.out.println(res);
}
}