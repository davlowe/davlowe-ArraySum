public class ArraySum {
    /**
     * This method should return the sum of all ints in an array - this is a very useful trick to know!
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints
     * @return the sum of all values in arr.
     */
    public int sum(int[] arr){
        
        int sum=0;
        if(arr.length==0){
            sum=-1;
        }
        else if(arr.length==1){
            sum=arr[0];
        }

        else{
            int pos = 1;
            int temp = 0;

            for(int i=1; i<arr.length; i++){
                sum += arr[temp] + arr[pos];
                temp = temp + 2;
                pos = pos + 2;

                if(pos > arr.length-1 && temp == arr.length) {
                    break;
                }
                else if (pos > arr.length-1 && temp != arr.length){
                    sum+=arr[temp];
                    break;
                }
            }
        }
        return sum;
    }
    } 

