
public enum Result {
SYSERROR(-1,"ϵͳ����"),NULLDATE(0,"��ѯ����Ϊ��"),SUCCESS(1,"�����ɹ�");
private int state;
private String msg;
private Result(int state,String msg){
	this.state=state;
	this.msg=msg;
}
public String getMsg(){
	return msg;
}
}
