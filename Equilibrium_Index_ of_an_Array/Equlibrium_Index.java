class Equilibrium_Index{
    int equilibrium(int arr[], int n){
        int sum = 0; // initialize sum of whole array 
        int leftsum = 0; // initialize leftsum 
  
        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i) 
            sum += arr[i]; 
  
        for (int i = 0; i < n; ++i) { 
            sum -= arr[i]; // sum is now right sum for index i 
            leftsum += arr[i]; 
            if (leftsum == sum) 
                return i; 
        } 
  
        /* If no equilibrium index found, then return -1 */
        return -1; 
    } 
    
    public static void main(String args[]){
        Equilibrium_Index i = new Equilibrium_Index();
        int arr[] = {-2 , 1 , 0 ,1  , -2 }; 
        int n=arr.length; 
        int k = i.equilibrium(arr, n);
        if(k!=-1){
            System.out.println("First Equilibrium Index is : "+k);
        }
        else{
            System.out.println("No equilibrium Index found");
        }
    }
}