package Ex1;

public class FenceLength {
    public static void IsOk(String string, int length){

        int space = 12;
        double letter = (double)62/3;

        //Посчитать количество пробелов
        int spaceNum = 0;
        for (char sp: string.toCharArray()){
            if(sp == ' ') spaceNum++;
        }

        //Посчитать кличество букв
        int lettersSize = string.length() - spaceNum;

        //Посчитать размер строки и сравнить с введенным
        double size =(double) (spaceNum * space + lettersSize * letter);
        //System.out.println(size);

        if(size < length){
            System.out.println("Надпись помещается на забор");
        }
        else {
            System.out.println("Надпись НЕ помещается на забор");
        }
    }
}
