package dayOne;

public class FamilyTest {

	public static void main(String[] args) {
		
		Family family=new Family();
		family.Studying();
		family.business();
		family.Employee();
		family.farming();
		family.housewife();
		family.playing();
		family.Schooling();
		
		System.out.println("------------------------------------");
		
		GrandFather gf =new GrandFather("Dhoopya Nayak",5000, 1111, 5000.0);
		gf.giftToFamily("a Apple watch");
		gf.saveMoney(10000.0);
		gf.shareWisdom();
		
		System.out.println("------------------------------------");
		
		Father f=new Father("Devoji Nayak",5000.0,2222,1000.0);
		f.saveMoney(5000.0);
		f.work();
		f.getBalanceDetails();
		
		gf.transferAmount(f, 2000.0);
		gf.getBalanceDetails();
				
		System.out.println("------------------------------------");
		
		Child c=new Child("Narendar Nayak",1000.0,3333,2000.0 );
		c.shareWisdom();
		c.play();	
		c.withdraw(f, 500.0);
		c.getBalanceDetails();

	}
}
