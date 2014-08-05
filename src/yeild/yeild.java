package yeild;

public class yeild implements Runnable{
@Override
/*
 * yield()从未导致线程转到等待/睡眠/阻塞状态。在大多数情况下，
 * yield()将导致线程从运行状态转到可运行状态，但有可能没有效果。
 * @see java.lang.Runnable#run()
 */
public void run() {
	// TODO Auto-generated method stub
	for(int i=0;i<5;i++)
	{
		System.out.println(Thread.currentThread().getName() + i+"在运行");
		if(i==2)
		{
		System.out.println("线程的礼让");
        Thread.currentThread().yield();
		}
	}
}
public static void main(String str[])
{
	yeild yy=new yeild();
	yeild_next yy_next=new yeild_next("yy_next");
	Thread tt=new Thread(yy,"yy");
	tt.start();
	yy_next.start();
	}
}
