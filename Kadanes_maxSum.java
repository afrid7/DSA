

public class Kadanes_maxSum {
    public static void main(String[] args) {
        int a[]={1,-2,3,4,-7,5};
        int cursum=0;
        int maxsum=0;
        for(int i=0;i<a.length;i++){
            cursum=cursum+a[i];
            if(maxsum<cursum)
                maxsum=cursum;
            if(cursum<0)
                cursum=0;
        }   
        System.out.println(maxsum);
    }
}
    

