public class Prime{
public static void main(String[] args){

if(args.length==0){
System.out.println("Please provide a number as a command line argument.");
return;
}

int N = Integer.parseInt(args[0]);

boolean isprime = true;
if(N<=1){
isprime = false;
}
else{
for(int i=2;i<=N/2;i++){
if(N%i == 0){
isprime = false;
break;
}}}

if(isprime){
System.out.println(N + "is a prime number");
}
else{
System.out.println(N + "is not a prime number");
}}}