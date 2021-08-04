package seaFight;

import java.util.ArrayList;

public class DotCom {
    private String name;
    private ArrayList<String> locationCells;

    public void setName(String n){
        name = n;
    }

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }


    public String checkYourself(String userInput){

        String result = "Мимо";

        int index = locationCells.indexOf(userInput);

        if (index >= 0){
            locationCells.remove(index);
        }

        if (locationCells.isEmpty()){
            result = "Потопил";
        } else {
            result = "Попал";
        }
        return result;
    }
}

class DotComTestDrive{
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int [] locations = {2,3,4};

        dot.setLocationCells(locations);

        String userGuess = "2";

        String result = dot.checkYourself(userGuess);

//        String testResult = "Неудача";
//
//        if (result.equals("Попал")){
//            testResult = "Пройден";
//        }
//        System.out.println(testResult);
    }
}
