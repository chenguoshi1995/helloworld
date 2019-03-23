
public class HelloWorld {
	public int c;
	public int d;
	static String F;
    void Startup(int a,int b) {
    	System.out.println(a+b);	
	}
    void getup(){
    	int sum=0;
    	for(int i=c;i<d+1;i++) {
    		sum=sum+i;
    		System.out.println(sum);
    	}
    	System.out.println(sum);
    }
	public static void main(String[] args) {
	HelloWorld cd=new HelloWorld();
	cd.c=10;
	cd.d=20;
	cd.Startup(10,20);
	cd.getup();
	System.out.println(F);
	}
}
