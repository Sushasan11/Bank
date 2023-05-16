 


/**
 * @author (sushasan Hamal)
 * @version (1.1)
 */
public class CreditCard extends BankCard
{
    //Declaring attributes
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    /**CreditCard Constructor**/
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, int balanceAmount, int cvcNumber, double interestRate, String expirationDate) 
    {
        super(balanceAmount, cardId, bankAccount, issuerBank);
        setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        isGranted = false;
    }
    // Accessor methods for each attribute 
    public int getCvcNumber()
    {
        return cvcNumber;
    }

    public double getCreditLimit() 
    {
        return creditLimit;
    }

    public double getInterestRate() 
    {
        return interestRate;
    }
    public String getExpirationDate() 
    {
        return expirationDate;
    }

    public int getGracePeriod() 
    {
        return gracePeriod;
    }

    public boolean getIsGranted() 
    {
        return isGranted;
    }
    //Using setter method for setting the Credit limit
    public void setCreditLimit(double newCreditLimit, int newGracePeriod) 
    {
        if (newCreditLimit <= 2.5 * getBalanceAmount()) 
        {
            creditLimit = newCreditLimit;
            gracePeriod = newGracePeriod;
            isGranted = true;
        }
        else 
        {
            System.out.println("Credit cannot be issued. It goes over the limit.Please check your account balance and try again.");
        }
    }
    //Method to cancel the Credit Card 
    public void cancelCreditCard() 
    {
        if (isGranted) 
        {
            cvcNumber = 0;
            creditLimit = 0;
            gracePeriod = 0;
            isGranted = false;
            System.out.println("Your credit card has been cancelled successfully.");
        } 
        else 
        {
            System.out.println("No credit card to cancel.");
        }
    }
    // Display method to show details of Credit Card
    public void display() 
    {
        super.display();
        System.out.println("CVC Number: " + cvcNumber);
        System.out.println("Expiration Date: " + expirationDate);
        if (isGranted) 
        {
            System.out.println("Credit Limit: " + creditLimit);
            System.out.println("Grace Period: " + gracePeriod);
        } 
        else 
        {
            System.out.println(" The credit limit has not been granted yet.");
        }
    }
}

