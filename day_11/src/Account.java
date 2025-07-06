public class Account {


    String id;
    String name;
    int balance = 0;



    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }



    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }


    public int credit(int amount){
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount){
        this.balance -= amount;
        return this.balance;
    }

    public int transferTo(Account another, int amount){
        if (this.balance >= amount) {
            this.balance -= amount;
            another.balance += amount;
        }        return this.balance;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Balance: " + balance;
    }





}
