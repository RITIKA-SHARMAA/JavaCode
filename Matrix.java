
class SpiralMatrix {
    public static void main(String[] args) {
int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
// System.out.println(arr);//this willl the reference of the array

for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
        
        int top=0;
        int bottom= arr.length-1;
        int right=arr[0].length-1; 
        int left=0;
                    //System.out.println(right); 
                    
        while(top<=bottom && left <=right)
        {
            for (int i =left;i<=right;i++ ){
            System.out.println(arr[top][i]+" "); 
        }
        top+=1;
        for (int i =top;i<=bottom;i++ ){
            System.out.println(arr[i][right]+" "); 
        }
        right-=1;
        for (int i =right;i>=left;i-- ){          // mind this step(decrement)
            System.out.println(arr[bottom][i]+" "); 
        }
        bottom-=1;
        for (int i =bottom;i>=top;i-- ){
            System.out.println(arr[i][left]+" "); 
        }
        left+=1;
            
        } 
        
    }
}
//*********************************************************************************************** */

// sum of rows, columns, diagonal elements
class SumOfMatrix{
    public static void main(String[] args){
        int[][] arr= {{1,10,13},{2,14,12},{3,9,8}};
        
        for (int i =0; i<arr.length;i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
       //int t=0;int b=arr.length-1 ;int l=0; int r=arr[0].length-1;
       
       int dsum=0; int sdsum=0; int max=0;
       
       for(int i=0; i<arr[0].length;i++){
           int csum=0;int rsum=0;
           for (int j=0;j<arr.length;j++){
               
              
               rsum+=arr[i][j];
               csum+=arr[j][i];
               if(i==j){
                  dsum+=arr[i][j] ;
               }
               if(i+j == arr.length-1){
                   sdsum+=arr[i][j] ;
               }
           }
        System.out.println("sum of row is: "+ rsum);
         if(max< rsum){
                   max= rsum;
               }
       System.out.println("sum of colomn is: "+ csum);
        if(max< csum){
                   max= csum;
               }
       }
             System.out.println("sum of diagonal is: "+ dsum);
              if(max< dsum){
                   max= dsum;
               }
               
                System.out.println("sum of secondary diagonal is: "+ sdsum);
                
                 if(max< sdsum){
                   max= sdsum;
               }
                 System.out.println(" Max is: "+ max);

    }
}