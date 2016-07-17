import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by kartikbh on 7/15/2016.
 */
public class Distance {
    public static void main(String[] args) {

        System.out.println("Running program");
        ArrayList<Integer> X = new ArrayList<Integer>();
        ArrayList<Integer> Y = new ArrayList<Integer>();


        X.add(-7);
        X.add(-13);

        Y.add(1);
        Y.add(-5);

        System.out.println(coverPoints(X,Y));

    }


    public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {

        int xLen = X.size();
        int dist=0;
        for (int i=1;i<xLen;i++)
            dist= dist+(Math.abs(X.get(i)-X.get(i-1))<Math.abs(Y.get(i)-Y.get(i-1))?Math.abs(Y.get(i)-Y.get(i-1)):Math.abs(X.get(i)-X.get(i-1)));

        return dist;


    }

}
