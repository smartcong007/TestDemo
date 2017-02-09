import java.util.List;


public class ThreadList {
private List<Runnable> list;
public ThreadList(List<Runnable> list){
	this.list = list;
}
public void runThreadByOrder(){
	runn(list);
}
public void runn(List<Runnable> Rlist){
	for(int i=0;i<Rlist.size();i++){
		synchronized (this) {
			Thread tr = new Thread(Rlist.get(i),i+"线程");
			tr.start();
			System.out.println(Thread.currentThread().getName()+"启动了");
		}
	}
}
}
