import java.util.ArrayList;

/**
 * Created by kartikbh on 8/3/2016.
 */
public class MaxSumContiguous {


    public static void main(String [] args){
   //     System.out.println("Hello World");


        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        arr1.add(-2);
        arr1.add(1);
        arr1.add(-3);arr1.add(4);arr1.add(-1);arr1.add(2);arr1.add(1);arr1.add(-5);arr1.add(4);


        int sum=0;
        int max=0;
        int startIndex=0;
        int endIndex=0;
        int currentStartIndex=0;
        boolean flag = false;
        max=arr1.get(0);
      /*  for(int i=0;i<arr1.size();i++){
            if(arr1.get(i)>=max){
                max=arr1.get(i);
            }

        }*/

        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<arr1.size();i++) {
            sum=sum+arr1.get(i);
            if (sum >max)
            {

                max=sum;
                endIndex=i;
                startIndex=currentStartIndex;

            }
            else if(sum+arr1.get(i)<0){
                currentStartIndex = i+1;
                sum=0;
            }


        }

        System.out.println(max);

        ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i= startIndex;i<=endIndex; i++){
                arr.add(arr1.get(i));

            }
        }

    }

