class test
{
 int a,b;

 test(int i,int j)
 {
  a=i;
  b=j;
 }

  
  void meth (test o)
 {
  o.a*=2;
  o.b/=2;
 }
}
 class cbr
{
 public static void main (String args[])
 {
   test ob = new test (15,20 );
    System.out.println("ob.a ans ob.b before call"+ob.a+" "+ob.b);
    ob.meth(ob);
   System.out.println("ob.a ans ob.b after call"+ob.a+" "+ob.b);
 }
}