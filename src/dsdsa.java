
public class dsdsa {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public synchronized static void test1(){
		System.out.println(Thread.currentThread().getName()+"进入test1方法");
		test2();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"test1方法执行结束");
	}
	
	public synchronized static void test2(){
		System.out.println(Thread.currentThread().getName()+"进入test2方法");
		System.out.println(Thread.currentThread().getName()+"test2方法执行结束");
	}
    
}
