package runnable;

public class hello implements Runnable{
	private String name;
	private int num=10;//�߳���Դ����
	hello(){};
	hello(String name)
	{this.name=name;}
public void run()
{   System.out.println(Thread.currentThread());
	while(num-->0)
		System.out.println(Thread.currentThread()+name+num+'\n');
}
public static void main(String str[])
{
	hello h1=new hello("hhh");
    Thread hh1=new Thread(h1,"11");
	Thread hh2=new Thread(h1,"22");
	Thread hh3=new Thread(h1);//ϵͳ���Զ���һ���߳���
	hh1.start();
	hh2.start();
	hh3.start();

	
    

}
}
