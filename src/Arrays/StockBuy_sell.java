package Arrays;



class StockBuy_sell {
    class Interval {
        int buy, sell;
    }   public void stockBuySell(int[] price, int n) {
        int count = 0; // count of solution pairs

        // solution array
        Interval[] res = new Interval[(n / 2) + 1];
        // Traverse through given price array
        int i = 0;
        while (i < n - 1) {
            // Find Local Minima. Note that the limit is (n-2) as we are
            // comparing present element to the next element.
            while ((i < n - 1) && (price[i + 1] <= price[i])) i++;

            // If we reached the end, break as no further solution possible
            if (i == n - 1) break;

            // Store the index of minima
            Interval index = new Interval();
            index.buy = i++;

            // Find Local Maxima.  Note that the limit is (n-1) as we are
            // comparing to previous element
            while ((i < n && i > 0) && (price[i] >= price[i - 1])) i++;

            // Store the index of maxima
            index.sell = i - 1;
            res[count] = index;
            // Increment count of buy/sell pairs
            count++;
        }

        // print solution
        if (count == 0)
            System.out.print("No Profit");
        else {
            for (int j = 0; j < count; j++)
                System.out.print("(" + res[j].buy + " " + res[j].sell + ") ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        StockBuy_sell stock = new StockBuy_sell();

        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = price.length;

        stock.stockBuySell(price, n);
    }
}
