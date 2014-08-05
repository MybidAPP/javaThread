package join;
/**
 * joiner 类中包含sleeper对象，调用sleeper的join（）后将等待sleeper对象执行完毕或者
 * 被中断，才继续执行。
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
	
	s1.interrupt();//s1被打断使得j2可以立刻继续执行完。
	
}

}
