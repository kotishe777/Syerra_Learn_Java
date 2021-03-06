package constructor;

import java.util.ArrayList;

public class V2Radiator {
    V2Radiator(ArrayList list){
        for (int x = 0; x < 5; x++){
            list.add(new SimUnit("V2Radiator"));
        }
    }
}
class V3Radiator extends V2Radiator{
    V3Radiator(ArrayList lglist){
        super(lglist);
        for (int g = 0; g < 10; g++){
            lglist.add(new SimUnit("V3Radiator"));
        }
    }
}
class RetentionBoot{
    RetentionBoot(ArrayList rlist){
        rlist.add(new SimUnit("Тепловая машина"));
    }
}
class TestLifeSupportSim{
    public static void main(String[] args) {
        ArrayList alist = new ArrayList();
        V2Radiator v2 = new V2Radiator(alist);
        V3Radiator v3= new V3Radiator(alist);
            for (int z = 0; z < 20; z++) {
                RetentionBoot ret = new RetentionBoot(alist);
            }
        }
    }
class SimUnit{
    String botType;
    SimUnit(String type){
        botType = type;
    }
    int powerUse(){
        if("Тепловая машина".equals(botType)){
            return 2;
        } else {
            return 4;
        }
    }
}

