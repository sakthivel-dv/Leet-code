

int fib(int n){
if(n<=1) return n;
int l;
l=fib(n-1)+fib(n-2);
return l;

}