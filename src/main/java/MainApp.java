import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {

        Object[] a = {1,"Два",3.154,null,5};

        swapTwoElements(a, 1, 4);

        for (Object i: a){
            System.out.print(i + " ");
        }

        System.out.println();
        convertToArrayList(a);


    }

    public static void swapTwoElements (Object[] arr, int i1, int i2){
        Object b = arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=b;
    }

    public static void convertToArrayList (Object[] a){
        ArrayList<Object> c = new ArrayList<>();
        for (Object i: a){
            c.add(i);
        }
        for (Object i: c){
            System.out.printf(i + " ");
        }
    }

}
