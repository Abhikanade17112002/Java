package OOPS;

public class BankAccount {
    private String accountNumber  ;
    private String accountHolderName ;
    private double accountBalance ;

    public BankAccount( String accountNumber , String accountHolderName ){
        this.accountBalance = 0 ;
        this.accountHolderName = accountHolderName ;
        this.accountNumber = accountNumber ;
    }



    public void getAccountBalance(){
        System.out.println("Current Available Account Balance : "+ this.accountBalance) ;
    }

    public void depositeMoney( double depositeAmmount ){
        if( depositeAmmount <= 0 ){
            System.out.println("Ammount Deposited must Be A Positive Interger ");
            return ;
        }

        this.accountBalance += depositeAmmount ;
        System.out.println(" Ammount Deposited Succesfully ");
        System.out.println("Current Balance : " + this.accountBalance);
        System.out.println();
    }




    public void withdrawMoney( double withdrawAmmount ){
        if( this.accountBalance < withdrawAmmount ){
            System.out.println("Insufficient Balance Available ");
            return ;
        }


        this.accountBalance -= withdrawAmmount ;

        System.out.println(" Ammount : " + withdrawAmmount + " , Withdrawl Succesfully ");
        System.out.println(" Current Available Balance : " + this.accountBalance ) ;
        return ;


    }
}
