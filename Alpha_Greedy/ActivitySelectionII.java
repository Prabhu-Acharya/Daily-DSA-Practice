package Alpha_Greedy;
import java.util.*;
public class ActivitySelectionII {
    public static void main(String[] args){
        int start[] = {1,3,0,5,8,5};
        int end[] =  {2,4,6,7,9,9};

        // Sorting -> for Unsorted Array

        int activities[][]= new int[start.length][3];
        for(int i =0;i<start.length;i++){

            // Original index stored (because after sorting we need original index )
            activities[i][0] = i;
            activities[i][1] = start[i];  // Start Array Stored
            activities[i][2] =  end[i];   // end Array Stored
        }

        //Lambda function -> shortForm
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        // o[2] use because end time sorting required 



        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans= new ArrayList<>();

        // first activity
        maxAct = 1;
        ans.add(activities[0][0]);   //Adding Index
        int lastEnd = activities[0][2];  // end time basis comparision

        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){  //comparision for disjoint set of start and end

                //Activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activities =" +maxAct);
        for(int i =0;i<ans.size();i++){
            System.out.println("A" +ans.get(i)+ " ");
        }
        System.out.println();
    }
}
