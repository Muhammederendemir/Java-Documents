package operation;

public class Operation implements Runnable {
    int x,y,sonuc;
    String operation;
    Transactions transactions=new TransactionsImpl();


    public void processing(int x,int y,String operation){
        //Transactions transactions=new TransactionsImpl();
        this.x=x;
        this.y=y;
        this.operation=operation;

    }

    public void run() {
        if(operation=="+"){
            System.out.println("Sonuc :"+transactions.toplama(x,y));
        }
        if(operation=="-"){
            System.out.println("Sonuc :"+transactions.cikartma(x,y));
        }
        if(operation=="*"){
            System.out.println("Sonuc :"+transactions.carpma(x,y));
        }
        if(operation=="/"){
            System.out.println("Sonuc :"+transactions.bolme(x,y));
        }
    }
}
