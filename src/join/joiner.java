package join;

public class joiner extends Thread{
private sleeper ss;

joiner(String name,sleeper ss)
{
this.ss=ss;
    start();
}
@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			ss.join();//joiner����ȴ�sleeper����ִ�н������߱����
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.print("is interrupted");
		}
	    System.out.println(ss.getName()+"is finished");
	}
}
