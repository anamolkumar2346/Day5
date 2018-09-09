import java.util.*;

class Producer{
	
	public boolean IsEmpty(Map map)
	{
		return map.isEmpty();
	}
	public void setvalue(String s, int m)
	{
		map.put(s,m);
	}
}

class Consumer{
	public void consume(Map map)
	{
	if (map.isEmpty())
	{
		System.out.println("No Data.");
	}
	else{
		it.remove();
		// System.out.println()
		}
	
}
}



class ProducerConsumer{
	public Map<String,Integer> map=new HashMap<String,Integer>();
	while(true)
	{
		System.out.println("Enter 1 for Producer \n 2 for consumer \n 3 for exit");
		Scanner sc= new Scanner(System.in);
		int c=sc.nextInt();
		switch(c)
		{
			case 1:
				System.out.println("Enter Name: ");
				String s=nextLine();
				System.out.println("Enter Marks: ");
				int d=sc.nextInt();
				Producer p=new Producer();
				p.setvalue(s,d);
				break;
				
			case 2:
				System.out.println("Consumer Running...");
				Consumer cn=new Consumer();
				consume(map);
				break;
			default:
				return;
			
		}
		
		
	 }
}