public class syoRamen extends Ramen {

    public int price = 650;

    /**
     * スープを作るメソッドです
     *  
     */
    public void makeSoup() {
        System.out.println("醤油ベースのスープを作った!!");
    }

    /**
     * スープを作るメソッドです
     *  
     */
    public void makeRamen() {
        System.out.println("醤油ラーメンの完成!! 価格" + price + "円");

    }
    
}
