import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int count = 0;
        for(int x: list){
            if (x%2==1||x%2==-1){
                count+=1;
            }
        }
        return count;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for(int x:list1){
            for(int y:list2){
                if (x==y){
                    return true;
                }
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> out = new ArrayList<Integer>();
        if(arr.length==0){
            return out;
        }
        
        for(int i = 0;i<arr.length;i++){
            out.add(arr[i]);
        }
        return out;

    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
        // I did make test and it ran so I am good.
    }
}
