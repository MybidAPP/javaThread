package wait_notify;

import synchrony.synchrony;

public class Thread_wait implements Runnable{
  @Override
public void run() {
	// TODO Auto-generated method stub
	Thread_notify th=new Thread_notify();
            th.start();
	synchronized (th) {
		System.out.println("等待th线程计算完毕");
		try {
			th.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("th"+th.getsum());
	}
}
  public static void main(String str[])
  {
	  Thread_wait wa=new Thread_wait();
	  new Thread(wa).start();
  }
}
