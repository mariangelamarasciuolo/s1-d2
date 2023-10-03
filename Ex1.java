import java.util.concurrent.ThreadPoolExecutor;

public class Ex1 {
    public static void main(String[] args) {
        //PARI DISPARI
        String pariDispari = "epicoder";
        boolean length = strPariDisp(pariDispari);
        System.out.println(pariDispari + " " + "è" + " " + length);

        //ANNI BISESTILI
        int anno = 2024;
        boolean bisestile = annoBisest(anno);
        System.out.println(anno + " " + "è" + " " + bisestile);
    }

    //pari dispari
    public static boolean strPariDisp(String str) {
        int lunghezza = str.length();
        if (lunghezza % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //anno bisestile
    public static boolean annoBisest(int anno) {
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
            return true;
        }
        else {
            return false;
        }
    }
}


