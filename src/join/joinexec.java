package join;
/**
 * joiner ���а���sleeper���󣬵���sleeper��join�����󽫵ȴ�sleeper����ִ����ϻ���
 * ���жϣ��ż���ִ�С�
 * @author xianyu422
 *
 */
public class joinexec {



public static void main(String str[])
{
	sleeper s1=new sleeper("s1",1000);
	sleeper s2=new sleeper("s2",1000);
	joiner j1=new joiner("j1",s1);
	joiner j2=new joiner("j2",s2);
	
	s1.interrupt();//s1�����ʹ��j2�������̼���ִ���ꡣ
	
}

}
