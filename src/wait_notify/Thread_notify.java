package wait_notify;

public class Thread_notify extends Thread{
	private int sum=0;
@Override
public void run() {
	// TODO Auto-generated method stub
	synchronized (this) {
		for(int i=0;i<101;i++)
		{
			sum=sum+i;
			if(i==20){
				try {
					sleep(20000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//notify();
				}
		}
		//notify();//对此线程的锁进行解锁
	}
	
}
public int getsum()
{
	return this.sum;
}
}
