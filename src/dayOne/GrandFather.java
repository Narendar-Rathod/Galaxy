package dayOne;

class GrandFather extends Family
{
	protected String Name;
	protected double Amount;
	protected int AccNumber;
	protected double InitialBalance;
	
	
	public GrandFather(String name, float amount,int accNumber, double initialBalance)
	{
		Name=name;
		Amount=amount;
		AccNumber=accNumber;
		InitialBalance=initialBalance;
	}
	
	public void saveMoney(double amount)
	{
		System.out.println(Name + " saved " + amount + " in the family fund");
	}
	
	public void deposit(float amount) 
	{
		Amount=Amount+amount;         //Amount+=amount
		System.out.println("New Current Family Account Balance is "+ Amount);
	}
	
	public void shareWisdom()
	{
		System.out.println(Name + " says: 'Hard work and honesty lead to success'");
	}
	
	public void giftToFamily(String gift) 
	{
		System.out.println(Name + " gifted " + gift + " to the family");
	}	
	
	// New Method: Transfer Amount
    public void transferAmount(Father father, double amount)
    {
        if (Amount >= amount) 
        {
            Amount -= amount; // Deduct from GrandFather's account
            father.receiveAmount(amount); // Add to Father's account
            System.out.println(Name + " transferred " + amount + " to " + father.Name);
        } 
        else 
        {
            System.out.println("Insufficient balance in " + Name + "'s account to transfer " + amount);
        }
    }
    public void getBalanceDetails() 
    {
    	System.out.println("Current balance in " + Name + "'s account: " + Amount);
    }
}




