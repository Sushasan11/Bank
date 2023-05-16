 


/**
 * @author (Sushasan)
 * @version (1.1)
 */
public class BankCard
{
    //Declaring attributes
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
    
    /**BankCard Constructor**/
    public BankCard(int balanceAmount, int cardId, String bankAccount, String issuerBank) 
    {
        this.cardId = cardId;
        this.clientName = "";//client name is intialized to an empty string
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.balanceAmount = balanceAmount;
    }
    //Getter(Acessor)methods//
    public int getCardId() 
    {
        return cardId;
    }

    public String getClientName() 
    {
        return clientName;
    }

    public String getIssuerBank() 
    {
        return issuerBank;
    }

    public String getBankAccount() 
    {
        return bankAccount;
    }

    public int getBalanceAmount() 
    {
        return balanceAmount;
    }

    public void setClientName(String newName) 
    {
        clientName = newName;
    }

    public void setBalanceAmount(int newBalance) 
    {
        balanceAmount = newBalance;
    }
    //The above method will display CardID, ClientName, IssuerBank, BankAccount and BalanceAmount.
    //This method displays the details entered.
    public void display() 
    {
        System.out.println("Card ID: " + cardId);
        if (clientName.equals(""))
        {
            System.out.println("Client name: Client name hasn't been assigned");
        } 
        else 
        {
            System.out.println("Client name: " + clientName);
        }
        System.out.println("Issuer Bank: " + issuerBank);
        System.out.println("Bank Account: " + bankAccount);
        System.out.println("Balance Amount: " + balanceAmount);
    }
}


