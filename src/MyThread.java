



public class MyThread implements Runnable {
    private Ticket ticket;
    public MyThread(Ticket ticket){
    	this.ticket=ticket;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(ticket.getTickets()>0){
				ticket.sell();
				Thread.sleep(10);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
