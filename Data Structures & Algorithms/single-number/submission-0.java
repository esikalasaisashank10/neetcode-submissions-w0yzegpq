class Solution {
    public int singleNumber(int[] nums) {

       HashSet<Integer> x =new HashSet<>(); 
       
        for(int num:nums){
            if(x.contains(num)){
                x.remove(num);
            }
            else{
                x.add(num);
            }
        }
       return  x.iterator().next();

                
        

    }
}
