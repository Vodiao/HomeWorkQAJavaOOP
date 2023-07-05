package HomeWorkQA7Additional;

public class Person {

    private String name;

    private  Bill account;

    public  Person (String name, Bill account){
        this.account = account;
        this.name = name;

    }

    public String getName (){
        return  name;
    }

    public  Bill getAccount(){
        return account;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setAccount (Bill account){
        this.account = account;
    }
}
