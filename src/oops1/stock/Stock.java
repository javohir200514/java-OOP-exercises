package oops1.stock;

class Stock {
    String name;
    String symbol;
    double previousClosingPrice;
    double currentPrice;

    Stock(String name,String symbol){
        this.name=name;
        this.symbol=symbol;
        this.previousClosingPrice=1000000;
        this.currentPrice=10000000;
    }

    void getChangePerent(){
        System.out.printf("name: %s %nsymbol: %s %n",name,symbol);
        System.out.println("Change price persantage :"+(double)(Math.abs(previousClosingPrice-currentPrice)/currentPrice*100));
    }


}
