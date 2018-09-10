import java.util.*;

class Producer{
	
	public boolean IsEmpty()
	{
		return ProducerConsumer.map.isEmpty();
	}
	public void setvalue(String s, int m)
	{
		ProducerConsumer.map.put(s,m);
	}
}

class Consumer{
	public void consume(String name)
	{
	if (ProducerConsumer.map.isEmpty())
	{
		System.out.println("No Data.");
	}
	else if(ProducerConsumer.map.containsKey(name)){
	ProducerConsumer.map.remove(name);
		// System.out.println()
		}
		else {System.out.println("key not found");}
	
}
}



public class ProducerConsumer{
	public static Map<String,Integer> map=new HashMap<String,Integer>();
	public static void main(String args[]){
	
	while(true)
	{
		System.out.println("Enter 1 for Producer \n 2 for consumer \n 3 for exit");
		Scanner sc= new Scanner(System.in);
		int c=sc.nextInt();
		switch(c)
		{
			case 1:
				System.out.println("Enter Name: ");
				String s=sc.next();
				System.out.println("Enter Marks: ");
				int d=sc.nextInt();
				Producer p=new Producer();
				p.setvalue(s,d);
				break;
				
			case 2:
				System.out.println("Consumer Running...");
				Consumer cn=new Consumer();
				System.out.println("Enter Name: ");
				String st=sc.next();
				cn.consume(st);
				break;
			default:
				return;
			
		}
		
		
	 }
}
}
