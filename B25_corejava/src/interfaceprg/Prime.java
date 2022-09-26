package interfaceprg;

public class Prime implements Accounts
{
	public void deliverycharge()
	{
		System.out.println("No charges for delivery");
	}

	public static void main(String[] args) {
		Prime p = new Prime();
		Nonprime np = new Nonprime();
		p.deliverycharge();
		np.deliverycharge();
		
		

	}

}
