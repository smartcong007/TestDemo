
public class dsdsa {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public synchronized static void test1(){
		System.out.println(Thread.currentThread().getName()+"����test1����");
		test2();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"test1����ִ�н���");
	}
	
	public synchronized static void test2(){
		System.out.println(Thread.currentThread().getName()+"����test2����");
		System.out.println(Thread.currentThread().getName()+"test2����ִ�н���");
	}
    
}
