package oops1.account;

class Account {
    int id;
    double balance;
    double annualInteresestRate;

    Account(){
        annualInteresestRate=0;
        id=0;
        balance=0;
    }
    Account(int id,double balance){
        this.id=id;
        this.balance=balance;
        this.annualInteresestRate=4.5;
    }

    void getMonthlyInterestRate(){
        System.out.printf("Monthly interest rate:%f",annualInteresestRate/12);

    }
    void getMonthlyInterest(){
        System.out.println("Monthly Interest:"+(balance*annualInteresestRate)/(100*12));
    }

    void withdraw(double moneyPop){

        balance=balance-moneyPop;
    }

    void deposit(double moneyPush){

        balance=balance+moneyPush;
    }
    void print(){
        System.out.println("id:"+id);
        System.out.println("annual Interesest Rate:"+ annualInteresestRate);
        System.out.println("balance:"+balance);
    }
}
