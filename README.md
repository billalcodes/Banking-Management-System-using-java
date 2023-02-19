# Banking Management System using java
 Following repo contains the complete code for implementing a complete banking management system in java implementing the following use case:

  An account management system needs to store information about Bank Accounts and Customers.
 This system supports two different types of accounts (Checking and Savings).
 All customers have a name, address, and phone number. Each customer has their unique account
number and the bank will identify customers by only that account number.
 A customer may open both a savings account and a checking account. However, a customer must not
have more than one savings account or checking account. 
 All bank accounts must have the account number, balance, and date created.
 There are some features that are defined for all accounts, checkBalance(), printStatement(),
makeDeposit(), transferAmount(), calculateZakat() and makeWithdrawal() but the withdrawal limit is
different based on the account type. Savings account customers cannot withdraw more than their
balance but the checking account holders can withdraw more than their account balance (up to a
maximum of 5000 PKR).
 makeDeposit(): The Deposit Function will deposit the specified amount in the account. amount
will be deducted
 makeWithdrawal(): Withdraw function to withdraw an amount
 checkBalance(): Display function to display name and balance.
 printStatement(): show the complete details of the customer, account number, time of the
transaction, date of transaction, transaction amount, and remaining balance.
 transferAmount(): The transfer method transfers the amount from one bank account to the bank
account selected by the user.
 calculateZakat() : This function will calculate zakat annually. It should ensure that the zakat will
be calculated if the total balance is greater than or equal to 20,000. Zakat will be calculated using
this formula (TotalBalance*2.5)/100. Zakat is only calculated for Savings accounts.
 displayAllDeductions(): This function displays all deductions made along with their details on the
said account (e.g., Zakat for Savings and Tax for Checking).
 Checking accounts have additional functionality that may have transaction fees for deposits and
withdrawals. The account holder will get only 2 free transactions per month. After that, the
account holder must pay a transaction fee (10 Rs) for each additional transaction such as deposit
and withdrawal. A record of all transaction fees should be calculated.
 Saving accounts have an additional attribute for interest rate and an operation for
calculatelnterest(). The interest rate remains the same for all accounts and can be changed at
runtime.
 The console interface will allow the Admin (the only type of user) to
o Open a New Account, Close an account
o Login to a specific account by providing the unique account number
o Perform account operations as mentioned earlier
o Specify the Interest Rate, applicable to all Saving Accounts
o Display all account details, including the bank owner details
o Display all accounts deductions along with account details
