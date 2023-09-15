interface A
{
    final int x=5666;
}
interface B extends A
{
    final int y=457;
}
class sum implements B
{
    void display()
    {
        System.out.println(x+y);
    }
}
class demointerface
{
    public static void main(String argu[])
    {
        sum obj1=new sum();
        obj1.display();
    }
}
