package thread;

public class hello extends Thread{
    private String name;
	public hello(){};
	public hello(String name){this.name=name;}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<5;i++)
		System.out.printf(name+i+"hello world\n");
	}
   public static void main(String str[])
   {
	   hello h1=new hello("h1");
	   hello h2=new hello("h2");
	   h1.start();
	   h2.start();
   }
	
}
