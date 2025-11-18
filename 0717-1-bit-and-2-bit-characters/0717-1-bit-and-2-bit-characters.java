class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;
        //if it lands on last then true
        while(i < n - 1){
            if(bits[i] == 1){
                i += 2;
            }
            else{
                i++;
            }
        }
        return i == n-1;
    }
}