public class multidimensionalarray{
    public static void main(String[] args) {
        int[][] a = {{2,3,3},{8,5,6}};
        int[][] b = {{3,4,6},{6,4,0}};
        int[][] c = new int[2][3];
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
          c[i][j]= a[i][j]+b[i][j];   //data store    
            }
        }
        System.out.println("the output of the sum of matrix: ");
         for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(c[i][j] + " ");

     }
   }
   System.out.println();

   
    }
}