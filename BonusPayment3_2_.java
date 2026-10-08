public class BonusPayment3_2_
{
    public static void main (String[] args){
        int itemsSold = 2, totalValue = 1000;
        if(itemsSold > 3 || totalValue > 1000)
            System.out.println("Received Php100 bunus");
        else
            System.out.println("No bonus for you");
    }
}