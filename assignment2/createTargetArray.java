package assignment2;

public class createTargetArray {
    public static void main(String[] args) {
        int[] target = new int[index.length];
        Arrays.fill(target, -1);//filling entire target array with -1 instead of 0
        
        for (int i = 0; i < index.length; i++) {
            if (target[index[i]] != -1) {//if any position doesnt contain -1, it means there exists some-- 
                for (int j = target.length-1; j > index[i]; j--) {//-value other than -1
                    target[j] = target[j-1];//there maybe a 0 value to store for example nums = {0,1,0} & index = {0,1,0}
                }//will not work in 1st condn
        }
        target[index[i]] = nums[i];
    }
    System.out.print(Arrays.toString(target));    
    }

}