// neive approach O(n^3)   .................
 public static boolean f(int arr[],int n){
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               for(int k=j+1;k<n;k++){
                   if(arr[i] <arr[k] && arr[k]<arr[j])
                       return true;
               }
           }
       }
return false;
    }
}

// second approach O(n^2)   ................









