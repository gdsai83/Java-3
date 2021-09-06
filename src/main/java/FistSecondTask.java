import java.util.ArrayList;

public class FistSecondTask {
    public static void main(String[] args) {

        Object[] a = {1,"Два",3.154,null,5};

        swapTwoElements(a, 1, 4);

        for (Object i: a){
            System.out.print(i + " ");
        }

        System.out.println();
        ArrayList b = new ArrayList<>(convertToArrayList(a));


    }

    public static <T> void swapTwoElements (T[] arr, int i1, int i2){
        T b = arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=b;
    }

    public static <T> ArrayList convertToArrayList (T[] a){
        ArrayList<T> c = new ArrayList<>();
        for (T i: a){
            c.add(i);
        }
        return c;
    }

}
