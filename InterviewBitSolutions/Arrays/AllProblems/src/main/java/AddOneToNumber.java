import java.util.ArrayList;

/**
 * Created by kartikbh on 8/3/2016.
 */
public class AddOneToNumber {

    public static void main(String [] args) {

//    System.out.println("Hello World");


        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(6);
        arr.add(0);
        arr.add(6);
        arr.add(4);
        arr.add(8);
        arr.add(8);
        arr.add(1);
       // arr.add(8);

        int carry = 0;
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i <= arr.size() - 1; i++){
        if(i==0){
            sum = arr.get(arr.size() - 1 - i) + 1;
        }
        else {
            sum = arr.get(arr.size() - 1 - i) + carry;
        }
            if(carry==1){
                carry=0;
            }
        if (sum > 9) {
            sum = sum % 10;
            carry = 1;
        }
        ans.add(sum);
            if(i==arr.size()-1 && carry!=0){
                ans.add(carry);
            }
    }
        ArrayList<Integer>arr1= new ArrayList<Integer>();
        for(int i = 0; i<=ans.size()-1; i++) arr1.add(ans.get(ans.size() - 1 - i));
        System.out.println(arr1);
int i =0;

        while(arr1.get(i)==0){
            arr1.remove(i);
            if(arr1.get(i+2)==0)
                i++;
            else break;

        }
        System.out.println(arr1);
    }

}
