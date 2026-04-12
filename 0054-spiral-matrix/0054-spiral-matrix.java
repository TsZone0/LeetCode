class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        int startc = 0;
        int endc = matrix[0].length-1;
        int startr = 0;
        int endr = matrix.length-1;

        while(startr <= endr && startc <= endc){
            // insert first row
            for(int j = startc; j<=endc; j++){
                list.add(matrix[startr][j]);
            }

                startr++;
    
            // insert in a down 

            for(int j= startr; j<=endr; j++){
                list.add(matrix[j][endc]);
            }

            endc--;

            //indert from left
            if(startr<=endr){
                 for(int j=endc; j>=startc; j--){
                list.add(matrix[endr][j]);
            }
            endr--;
            }
           

            // go to top
            if(startc<=endc){
            for(int j = endr; j>=startr; j--){
                list.add(matrix[j][startc]);
            }

            startc++;
        }
            }


        return list;
        
    }
}