package deamon;

public class deamon implements Runnable{
public void run()
{
	while(true)
{ System.out.println(Thread.currentThread().getName() + "������"+this);
   
	}
	}
/**
 *���зǺ�̨�Ľ���ȫ�������󣬳����������̨����ȫ��������
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
				Thread.sleep(100);//���߳���ͣ�ó�������������߳�����
				//����sleep������С���Ծ����߳�tt��ֹͣ
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}.run();
	tt.setDaemon(true);//���ó��ػ�����
	tt.start();
	
	}
}
