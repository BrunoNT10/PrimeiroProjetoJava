import java.util.*;

public class HelloWorld {
	
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		System.out.print("Temperatura da GPU: ");
		int temp = sc.nextInt();
				
		if(temp < 0)
		{
			System.out.println("Valor invalido de temperatura da GPU!");
		}		
		else if(temp > 100)
		{
			System.out.println("CUIDADO! A temperatura da GPU esta extremamente elevada!");
			
		}
		else if(temp > 50)
		{
			System.out.println("CUIDADO! A temperatura da GPU elevada!");
		}
		
		else
		{
			System.out.println("A temperatura da GPU esta normal!");			
		}
	}
}
