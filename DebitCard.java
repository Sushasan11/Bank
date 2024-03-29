 

/**
 * @author (Sushasan Hamal)
 * @version (1.1)
 */
public class DebitCard extends BankCard
{
    //Declaring attributes
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;

    /**DebitCard Constructor**/
    public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber) 
    {
        super(balanceAmount, cardId, bankAccount, issuerBank);
        this.pinNumber = pinNumber;
        setClientName(clientName);
        hasWithdrawn = false;
    }
    //Getter(Acessor)methods//
    public int getPinNumber() 
    {
        return pinNumber;
    }

    public int getWithdrawalAmount() 
    {
        return withdrawalAmount;
    }

    public String getDateOfWithdrawal() 
    {
        return dateOfWithdrawal;
    }

    public boolean getHasWithdrawn() 
    {
        return hasWithdrawn;
    }
      // Mutator method for withdrawalAmount attribute
    public void setWithdrawalAmount(int withdrawalAmount) 
    {
        this.withdrawalAmount = withdrawalAmount;
    } 
     // Withdraw method to deduct money from client account
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int enteredPin)
    {
        ///If the entered pin is the required pin then money will be withdrawn
        if (enteredPin == pinNumber) 
        {
            ///If the withdrawal amount less than or equal to Balance Amount then the money will be deducted 
            if (withdrawalAmount <= getBalanceAmount()) 
            {
                setBalanceAmount(getBalanceAmount() - withdrawalAmount);
                this.withdrawalAmount = withdrawalAmount;
                this.dateOfWithdrawal = dateOfWithdrawal;
                hasWithdrawn = true;
                System.out.println("Withdrawal successful. Your new balance is : " + getBalanceAmount());
            } 
            else 
            {
                System.out.println("You don't have sufficient balance. Please try again.");
            }
        } 
        else
        {
            System.out.println("The PIN entered by youis wrong. Please try again .");
        }
    }
    // Display method to show details of DebitCard
    public void display() 
    {
        super.display();
        System.out.println("PIN Number: " + pinNumber);
        if (hasWithdrawn) 
        {
            System.out.println("Withdrawal Amount: " + withdrawalAmount);
            System.out.println("Date of Withdrawal: " + dateOfWithdrawal);
        }
        else
        {
            System.out.println("No withdrawal has been made yet.");
        }
    }
}


