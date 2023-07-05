package HomeWorkQA7Task2;

public class C extends B{
    void print (){

        System.out.println("This is method C");
    }
    public void printing(){
        super.print();
    }
    /**
     * Класс С будет наследоваться от родителького класса, потому что super обращается к родительскому классу к методу print,
     * для него это будет класс B
     * по этому будет вызываться метод из класса B
     */
}
