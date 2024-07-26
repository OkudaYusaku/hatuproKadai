public abstract class Ramen extends Object {
    
    
    /**
     * 麺を茹でるメソッドです
     *  
     */
    public void boilNoodles() { 
        System.out.println("麺をゆでた!!");
    }
    
    /**
     * 
     * スープを作るメソッドです(抽象メソッド)
     * スープは味によって変化するので抽象化しています
     * 
     */
    public abstract void makeSoup();

    /**
     * 
     * ラーメンを作るメソッドです(抽象メソッド)
     * 出来上がるラーメンは味によって変化するため抽象化しています
     *  
     */
    public abstract void makeRamen();
}
