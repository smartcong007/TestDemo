
public class Ticket {
private int tickets;
public Ticket(int tickets){
	this.tickets=tickets;
}
public int getTickets(){
	return tickets;
}
public void sell(){
	System.out.print(Thread.currentThread().getName()+"售出前余票数:"+tickets+"  ");
	if(tickets>0)
		tickets--;
	System.out.println(Thread.currentThread().getName()+"售出后余票数:"+tickets);
}
}
