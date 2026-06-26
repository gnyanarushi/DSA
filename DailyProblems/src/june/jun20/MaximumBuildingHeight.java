package june.jun20;

import java.util.ArrayList;

public class MaximumBuildingHeight {

    public static void main(String[] args) {

        int n = 10 ;
//        int[][] restrictions = {{2,1} , {4,1}};
//        int[][] restrictions = {};
        int[][] restrictions = {
                {8, 5},
                {9, 0},
                {6, 2},
                {4, 0},
                {3, 2},
                {10, 0},
                {5, 3},
                {7, 3},
                {2, 4}
        };
//        int[][] restrictions ={{5,3},{2,5},{7,4},{10,3}};

        MaximumBuildingHeight maximumBuildingHeight = new MaximumBuildingHeight();

        int maxheight = maximumBuildingHeight.maxBuilding(n ,restrictions);

        System.out.println(maxheight);
    }


    public int maxBuilding(int n, int[][] restrictions) {

        ArrayList<Integer> heights = new ArrayList<>();

        int height = 1;
        heights.add(0);
        for(int i = 2 ; i <= n ; i++){
            int pres = isRestricted(restrictions , i-1);
            int res = isRestricted(restrictions , i) ;
            int fres = isRestricted(restrictions , i + 1);

            if((heights.getFirst() - height) == 1 || (heights.getFirst() + height )== 1 ){
                if(res != -1){
                    if(restrictions[res][1] > height){
                        // future
                        if(fres != 1 && restrictions[fres][1] > height){
                            heights.add(height);
                            height++;
                        }
                        else {

                        }

                    }
                    else{
                        // future
                    }
                }
            }


        }


        return max(heights);
    }

    public int isRestricted(int[][] restrictions , int i ){
        for(int j = 0 ; j < restrictions.length; j++){
            if(restrictions[j][0] == i){
                return j;
            }
        }
        return -1;
    }

    public  int  max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i  : list){
            if(i >  max ){
                max = i ;
            }
        }
        return max ;
    }



}
