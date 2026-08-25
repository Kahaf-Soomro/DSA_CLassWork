package Queue;

public class Main {
    
    
    public static void main(String[] args) {
        
        LinkedQueue Credit  = new LinkedQueue();

            Credit.add(5000);
            Credit.add(2000);
            Credit.add(1000);
            Credit.add(500);
            Credit.add(250);
            Credit.add(100);
            Credit.add(50);
            Credit.add(20);
            Credit.add(10);
                    LinkedQueue Debit  = new LinkedQueue();

                    Debit.add(10);
                    Debit.add(50);
                    Debit.add(20);
                    Debit.add(250);
                    Debit.add(100);
                    Debit.add(500);
                    Debit.add(1000);
                    Debit.add(2000);
                    Debit.add(5000);

                    int totalcredit = 0;
                    int totalDebt = 0;
                    LinkedQueue temp1, temp2;
                    temp1 = Credit;
                    temp2 = Debit;

System.out.println("size = " + Credit.size());
                      int newSize =Credit.size(); 
                   while(Credit.size()>0){
                        
                        totalcredit += (int) temp1.remove();
                        totalDebt += (int) temp2.remove();
                        
                    }
                    System.out.println("total credit:"+ totalcredit);
                    System.out.println("total devit:"+ totalDebt);
                int dif = totalcredit-totalDebt;

                System.out.println("Difference from Credit-Debt:" + dif);
}

}
