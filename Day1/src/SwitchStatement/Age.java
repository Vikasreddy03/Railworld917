package SwitchStatement;

public class Age 
{
public static void main(String[] args) 
 {
	int age=99;
	int y=age>=18?1:0;
	switch (y)
	{
	case 1:
		System.out.println("You are Eligible for Voting");
		break;
	case 0:
		System.out.println("You are Not Eligible for Voting");
		break;
		
		default :
			System.out.println("No data");
	}
 }
}
