package deamon;

public class deamon implements Runnable{
public void run()
{
	while(true)
{ System.out.println(Thread.currentThread().getName() + "在运行"+this);
   
	}
	}
/**
 *所有非后台的进程全部结束后，程序结束，后台进程全部结束。
 * @param str
 */
public static void main(String str[])
{
	deamon dd=new deamon();
	Thread tt=new Thread(dd,"tt");
	new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				System.out.println("ssssssssss");
				Thread.sleep(100);//此线程暂停让出处理器给别的线程运行
				//调整sleep（）大小可以决定线程tt的停止
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}.run();
	tt.setDaemon(true);//设置成守护进程
	tt.start();
	
	}
}
