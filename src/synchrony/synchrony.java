package synchrony;

public class synchrony implements Runnable{
	private int ticket=10;
@Override
public void run() {
	// TODO Auto-generated method stub
	while(--ticket>0)
	{
		synchronized(this)//ȷ���߳�ͬ������ticket��Դsynchronized{}�еĴ�����ͬ����
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread()+" "+ticket);
		}
	}
		
	
}
public static void main(String str[])
{
	synchrony sy=new synchrony();
	Thread s1=new Thread(sy,"s1  ");
	Thread s2=new Thread(sy,"s2  ");
	s1.start();
	s2.start();
}
}
