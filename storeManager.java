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
