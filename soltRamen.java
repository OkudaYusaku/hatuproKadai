public class soltRamen extends Ramen {

    public int price = 700;

    /**
     * スープを作るメソッドです
     *  
     */
    public void makeSoup() {
        System.out.println("塩ベースのスープを作った!!");
    }

    /**
     * ラーメンを作るメソッドです
     * 
     */
    public void makeRamen() {
        System.out.println("塩ラーメンの完成!! 価格" + price + "円");

    }
}