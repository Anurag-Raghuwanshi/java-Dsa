public class SolutionDsa{
             //   Q = 1 (Two sum problem) 
//     public static int[] sum(int[]arr , int target){
//         for(int i=0;i<arr.length;i++){
//           for(int j=i+1; j<arr.length; j++){
//             if(arr[i]+arr[j]==target){
//                return new int[]{i, j};
//             }
//           }
//         }
//         return new int[]{};
//     }

           //concatenate  arays
          //  public static int[] cancatenate(int[]nums){
          //     int n = nums.length;
          //     int[] ans = new int[2*n];
          //     for(int i=0; i<n; i++){
          //       ans[i] = nums[i];
          //       ans[i+n] = nums[i];
          //     }
          //     return ans;
          //   }

                       //concatenate two arrays 
          // public static int[] concatenatedtwoArrays(int[] arr1 ,int[]arr2){
          //   int n1 = arr1.length;
          //   int n2 = arr2.length;
          //   int[] ans = new int[n1 + n2];
          //   for(int i=0; i<n1; i++){
          //       ans[i] = arr1[i];
          //   }
          //   for(int i=0; i<n2; i++){
          //       ans[i+n1] = arr2[i];
          //   }
          //   return ans;
          // }

                     //contain duplictes
          // public static boolean conatainDuplicates(int[]arr){
          //   for(int i = 0; i<arr.length; i++){
          //     for(int j =i+1; j<arr.length; j++){
          //       if(arr[i]==arr[j]){
          //         return true;
          //       }
          //     }
          //   }
          //   return false;
          // }
           
   public static void main(String[]args){ 
                 // two sum 
//              int[] ans = sum(new int[]{2,7,8,11,5},9);
//              System.out.println("The indices of the pair are: " + ans[0] + " and " + ans[1]);

                 //concatenated arrays
                //  int[] nums = {1,2,3,4,5};
                //   int[] result = cancatenate(nums);
                //   System.out.println("Concatenated array: " + Arrays.toString(result));
                 
                //concatenate two arrays
                // int[] arr1 = {1, 2, 3};
                // int[] arr2 = {4, 5, 6};
                // int[] result = concatenatedtwoArrays(arr1, arr2);
                // System.out.println("Concatenated array: " + Arrays.toString(result));

                //contain dupliucates
                // int[] arr = {1,2,3,4,5,4,6};
                // boolean result = conatainDuplicates(arr);
                // if(result){
                //   System.out.println("The array contains duplicates.");
                // } else {
                //   System.out.println("The array does not contain duplicates.");
                // }
  
                 
        }
 }
