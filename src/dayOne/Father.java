package dayOne;

class Father extends GrandFather
{
	public Father(String name, double amount, int accNumber, double initialBalance) 
	{
        super(name, amount, accNumber, initialBalance); // Passing all parameters to the GrandFather constructor
    }
		@Override
		public void saveMoney(double amount)
		{
			System.out.println(Name + " saved " + amount + " in his personal savings");
		}
		
		public void work()
		{
			System.out.println(Name + " is working hard to support the family");
		}
		
		// New method to receive the transferred amount
	    public void receiveAmount(double amount)
	    {
	        this.Amount += amount; // Add amount to Father's balance
	        System.out.println(Name + "'s new balance after receiving funds: " + this.Amount);
	    }
	    
	    // New method to deduct money (used by Child for withdrawal)
	    public void deductAmount(double amount) 
	    {
	        if (this.Amount >= amount) {
	            this.Amount -= amount; // Deduct amount from Father's balance
	            System.out.println(Name + "'s new balance after withdrawal: " + this.Amount);
	        } 
	        else 
	        {
	            System.out.println("Insufficient balance in " + Name + "'s account to withdraw " + amount);
	        }
	    }
	    
	    public void getBalanceDetails() 
	    {
	    	System.out.println("Current balance in " + Name + "'s account: " + Amount);
	    }
}	


