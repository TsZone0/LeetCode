class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int i = 0;
        int j = 0;
        int maxradius = 0;

        while(i< houses.length){
            while(j+1 < heaters.length && Math.abs(heaters[j+1]-houses[i]) <= Math.abs(heaters[j]-houses[i])){
                j++;
            }
            int currentradius = Math.abs(heaters[j]-houses[i]);

            maxradius = Math.max(maxradius,currentradius);
            i++;
        }
        return maxradius;
    }
}