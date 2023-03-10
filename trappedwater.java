 public class trappedwater {
    public static void trappedWater(int height[]){
        //calculate left max heights 
        int left[] = new int[height.length];
        left[0]=height[0];
        for(int i=1;i<left.length;i++){
            left[i] = Math.max(height[i],left[i-1]);
        }
        // for(int i=1;i<left.length;i++){
        //     System.out.println(left[i]);
        // }

         //calculate right max heights 
        int rgt [] =new int[height.length];
        rgt[rgt.length-1]=height[height.length-1]; 

        for(int i = rgt.length-2;i>=0;i--){
            rgt[i] = Math.max(height[i],rgt[i+1]);
        }
        // for(int i=0;i<left.length;i++){
        //     System.out.println(rgt[i]);
        // }

        //water at each heigth
        int water=0;
        for(int i = 0;i<rgt.length;i++){
             water += (Math.min(left[i],rgt[i]) - height[i]);
        }
        System.out.println(water);
        
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        trappedWater(height);
    }
}
