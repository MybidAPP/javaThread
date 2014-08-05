package yeild;

public class yeild_next extends Thread{
	private String name;
	public yeild_next(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
@Override
public void run() {
	// TODO Auto-generated method stub
	super.run();
	System.out.println(this.name + "ÔÚÔËÐÐ");
}
}
