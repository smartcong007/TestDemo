
public class Ticket {
private int tickets;
public Ticket(int tickets){
	this.tickets=tickets;
}
public int getTickets(){
	return tickets;
}
public void sell(){
	System.out.print(Thread.currentThread().getName()+"�۳�ǰ��Ʊ��:"+tickets+"  ");
	if(tickets>0)
		tickets--;
	System.out.println(Thread.currentThread().getName()+"�۳�����Ʊ��:"+tickets);
}
}
