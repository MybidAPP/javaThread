package product_customer;

import yeild.yeild;

/**
 * 生产者消费者的同步问题
 * 线程之间保持同步，是指不同的线程在执行同一个对象的同步代码块时，
 * 因为要获得这个对象的锁二相互牵制
 * @author xianyu422
 *
 */


class Stack{
	private String name;
	private String[] buffer =new String[100];
	int point =-1;
	public Stack(String name){this.name=name;}
	public String getname(){return name;}
	public  synchronized int getPoint(){return point;}
	public  String pop(){
		synchronized (this) {
			String goods=buffer[point];
			buffer[point]=null;
			Thread.yield();
			point--;
			return goods;
		}
		
	}
	public void push(String goods){
		synchronized (this) {

		++point;
		Thread.yield();
		buffer[point]=goods;
		}
	}
	
}
class Producer extends Thread{
	
	private Stack theStack;
	public Producer (Stack s,String name)
	{
		super (name);
		theStack=s;
		start();
	}
	public void run()
	{
		String goods;
		for(int i=0;i<200;i++)
		{
			synchronized (this) {
				goods="goods"+(theStack.getPoint()+1);
				theStack.push(goods);
				System.out.println(getName()+": Push "+goods+"to "+theStack.getname());
			}
			
		
		    yield();
		}
	}
}
class Customer extends Thread{
	private Stack theStack;
	public Customer(Stack s,String name)
	{
		super (name);
		theStack=s;
		start();
	}
	public void run(){
		String goods;
		for(int i=0;i<200;i++)
		{
			synchronized (this) {
				goods=theStack.pop();
				System.out.println(getName()+": Pop "+goods+"from "+theStack.getname());
			}
			
			yield();
		}
	}
}
public class Synctest {
public static void main(String str[])
{
	Stack stack=new Stack("stack1");
	Producer producer1=new Producer(stack, "producer1");
	Producer producer2=new Producer(stack, "producer2");
	Customer customer1=new Customer(stack, "Customer1");

	
}
}
