package join;

public class sleeper extends Thread{

	private int duration;
	public sleeper(String name,int sleeptime)
	{
		super (name);
		duration=sleeptime;
		start();
	}
	public void run()
	{
		try {
			Thread.sleep(duration);//sleeper�������interrupt�����Ϳ��Դ�ϸ��߳�
			                       //���׳�isinterrupted���쳣
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block 
			System.out.print(getName()+"was interruped.\n");
			return;
		}
		System.out.println(getName()+"is awakened");
	}
}
