package yeild;

public class yeild implements Runnable{
@Override
/*
 * yield()��δ�����߳�ת���ȴ�/˯��/����״̬���ڴ��������£�
 * yield()�������̴߳�����״̬ת��������״̬�����п���û��Ч����
 * @see java.lang.Runnable#run()
 */
public void run() {
	// TODO Auto-generated method stub
	for(int i=0;i<5;i++)
	{
		System.out.println(Thread.currentThread().getName() + i+"������");
		if(i==2)
		{
		System.out.println("�̵߳�����");
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
