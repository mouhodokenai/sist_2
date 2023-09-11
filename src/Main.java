import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ведите кол-во смс");
        int kolvo = in.nextInt();
        int vv = 0;
        System.out.println("введите смс:");
        List<Integer> listOfPeople = new ArrayList<>(kolvo);
        for (int i = 0; i < kolvo; i++)
            listOfPeople.add((in.nextInt()));
        Collections.sort(listOfPeople);
        //System.out.println(listOfPeople);

        Map<Integer, Integer> elementCount = new TreeMap<>();

        for (int para : listOfPeople) {

            if (elementCount.containsKey(para)) {
                elementCount.put(para, elementCount.get(para) + 1);
            } else {

                elementCount.put(para, 1);
            }
        }



        System.out.println("призеры:");
        for (Integer key: elementCount.keySet()){
            System.out.println(key +" "+elementCount.get(key));
        }

        //System.out.println(elementCount);






        //for (int i = 0; i < 3; i++)
        //9System.out.println(elementCount);
    }

}