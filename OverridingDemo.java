
// Method Overriding
// Related to Inheritance Concept

class Bank
{
    double roi(){
       return 0;
    }
}


class ICICI extends Bank
{
    double roi(){
        // Overriding
        return 3;
    }
}

class SBI extends Bank{
        double roi(){
           // Overriding
            return 5;
        }
}


public class OverridingDemo {
    public static void main(String[] args) {
//        Bank bank = new Bank();
//        System.out.println(bank.roi());

        ICICI i = new ICICI();
        System.out.println(i.roi());

        SBI sbi = new SBI();
        System.out.println(sbi.roi());
    }

}
