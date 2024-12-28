package dayOne;

class Child extends Father 
{
		public  Child(String name, double amount, int accNumber, double initialBalance) 
		{
	        super(name, amount, accNumber, initialBalance);
		}
		
		@Override
		public void shareWisdom()
		{
			System.out.println(Name + " says: 'Grandpa taught me to be kind and helpful'");
		}
		
		public void play() 
		{
			System.out.println(Name + " is playing video games");
		}
		
		// New method: Withdraw money from Father's account
	    public void withdraw(Father father, double amount) {
	        System.out.println(this.Name + " wants to withdraw " + amount + " from " + father.Name + "'s account.");
	        father.deductAmount(amount); // Calls Father's `deductAmount` method
	    }
	    
	    public void getBalanceDetails() 
	    {
	    	System.out.println("Current balance in " + Name + "'s account: " + Amount);
	    }
}
