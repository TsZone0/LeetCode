class Solution {
    public void setZeroes(int[][] matrix) {
        boolean rows = false, colomn = false;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    if(i==0){
                        rows = true;
                    }
                    if(j==0){
                        colomn = true;
                    }
                    matrix[0][j] = 0;
                    matrix[i][0]= 0;
                }
            }
        }

        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }

    if(rows){
        for(int j = 0; j < matrix[0].length; j++){
        matrix[0][j] = 0;
    }
}

    if(colomn){
        for(int i = 0; i < matrix.length; i++){
        matrix[i][0] = 0;
    }
}
    }
}