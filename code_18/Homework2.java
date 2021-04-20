package code_18;

public class Homework2 {
    public static void main(String[] args) {
        Account a = new Account("1000",2000,1.23);
        Customer c = new Customer("Smith",a);

        c.getAct().deposit(100);
        c.getAct().withdraw(960);
        c.getAct().withdraw(2000);
    }
}

class Customer{
    private String name;
    private Account act;

    public Customer(){

    }

    public Customer(String name, Account act){
        this.name = name;
        this.act = act;
    }

    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }
    public void setAct(){
        this.act = act;
    }
    public Account getAct(){
        return act;
    }

}


class Account{
    private String id;
    private double balance;
    private double annualInterestRate;
    public Account(){

    }

    public Account(String id, double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(String id){
        this.id = id;
    }

    public  String getId(){
        return id;
    }

    public  void setBalance(double balance){
        this.balance = balance;
    }
    public  double getBalance(){
        return balance;
    }

    public  void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public  double getAnnualInterestRate(){
        return annualInterestRate;
    }
    //取款
    public void withdraw(double money){
        //this.setBalance(balance-=money);
        //setBalance(getBalance()-money);
        if(money>this.getBalance()){
            System.out.println("余额不足");
        }else {
            this.setBalance(this.getBalance()-money);
            System.out.println("成功取出:"+money+" 账户余额："+balance);
        }
    }
    //存款
    public  void deposit(double money){
        this.setBalance(balance+=money);
        System.out.println("成功存入“"+money+" 账户余额："+balance);
        //setBalance(getBalance()+money);
    }


}
