public class ArrayOps {
    public static void main(String[] args) {
        int [] arr = new int[] {2,8,3,7,8,8,8};
    System.out.println(secondMaxValue(arr));
      
    }
    
    public static int findMissingInt (int [] array) {
        int ans = -1;
        for (int num=0;num<=array.length;num++){
            int counter = 0;
            for (int i=0;i<array.length;i++){
                if(num==array[i]){
                    counter++;
                }    
            }
            if (counter==0){
                ans=num;
            }
        }
        return ans;
    }    

    public static int maxValue(int [] array){
        int maxNum = array[0];
        for (int i=0;i<array.length;i++){
            maxNum = Math.max(maxNum, array[i]);
        }
        return maxNum;
    }
    

    public static int secondMaxValue(int [] array) {
        int counter=0;
        for (int i=0;i<array.length;i++){
           if (maxValue(array)==array[i]) {
                counter++;
           }
        }
        if (counter>1){
            return maxValue(array);
        }
    
        int secMax = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]!=maxValue(array)) {
                secMax = Math.max(secMax, array[i]);
            }
        }    
        return secMax;
    }

    public static boolean contains(int[] arr, int value, int index) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false ;
    }

    public static int countUnique(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = contains(arr, arr[i], i) ? count : count + 1;
        }
        return count;
    }

    public static int [] set (int[] arr) {
        int [] res = new int [countUnique(arr)];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!contains(arr, arr[i], i)){
                res[index++] = arr[i];
            }
        }
        return res;
    }
            

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int [] comp1 = set(array1);
        int [] comp2 = set (array2);

        if (comp1.length!=comp2.length){
            return false;
        }
        else{
            for(int i=0;i<comp1.length;i++){
                int counter=0;
                for (int t=0;t<comp2.length;t++){
                    if(comp1[i]!=comp2[t]){
                        counter++;
                    }
                }
                if (counter==comp2.length){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        if (maxValue(array)!= array[0] && maxValue(array)!= array[(array.length-1)]){
            return false;
        }
        
        else{
            if (maxValue(array) == array[0]){
                for (int i=0;i<array.length-1;i++){
                    if (array[i]<array[i+1]){
                        return false;
                    }else{
                        return true;
                    }
                }
            }

            if (maxValue(array) == array[(array.length-1)]){
                for (int i=(array.length-1);i>0;i--){
                    if (array[i]<array[i-1]){
                        return false;
                    }else{
                        return true;
                    }
                }
            }
        }
        return false;
    }

}

