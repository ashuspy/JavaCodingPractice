package SDE_SHeet;

import java.util.ArrayList;
 class Interval {
    int buy,sell;
}
 class StockBuySell{
    void stockbuysell(int price[] , int n){
        int count = 0;
        if(n==1)
        return;


        ArrayList<Interval> res = new ArrayList<Interval>();
        int i=0;
        while (i<n-1){
            while ((i<n-1) && (price[i] <= price[i+1]))
                i++;

            if (i==n-1)
                break;

            Interval e = new Interval();
            e.buy = i++;

            while ((i<n) && (price[i] >= price[i-1]))
                i++;
            e.sell = i-1;
            res.add(e);
            count++;
        }
        if (count == 0)
            System.out.println("There is no day when buying the stock "
                    + "will make profit");
        else
            for (int j = 0; j < count; j++)
                System.out.println("Buy on day: " + res.get(j).buy
                        + "        "
                        + "Sell on day : " + res.get(j).sell);

        return;

    }
    public static void main(String args[])
    {
        StockBuySell stock = new StockBuySell();

        // stock prices on consecutive days
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = price.length;

        // function call
        stock.stockbuysell(price, n);
    }
}
