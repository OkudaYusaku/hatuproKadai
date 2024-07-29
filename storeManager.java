/**
 * 店主が塩or醤油ラーメンクラスを呼び出してラーメンを作ります。
 */

public class storeManager extends Object {

    public void perform() {
        
        Ramen noodles[] = {
            new soltRamen(),
            new syoRamen()
        };

        for(Ramen aRamens : noodles) {
            aRamens.boilNoodles();
            aRamens.makeSoup();
            aRamens.makeRamen();
        }

        
    }
}

// コードレビュアー
// 野口 裕生
