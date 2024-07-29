/**
 * ラーメンを作るクラスです
 */

public class syoRamen extends Ramen {

    /**
     * 価格を入れるための変数
     */
    public int price = 650;

    /**
     * スープを作るメソッドです
     *  
     */
    public void makeSoup() {
        System.out.println("醤油ベースのスープを作った!!");
    }

    /**
     * ラーメンを作るメソッドです
     *  
     */
    public void makeRamen() {
        System.out.println("醤油ラーメンの完成!! 価格" + price + "円");

    }
    
}

// コードレビュアー
// 野口 裕生
