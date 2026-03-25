class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        if(houses.length == 0 || heaters.length == 0)
            return 0;
    
        Arrays.sort(houses);
        Arrays.sort(heaters);
        
        int n = houses.length;
        int m = heaters.length; 
        
        int currentHouse = 0;
        int currentHeater = 0;
        
        int radiusRange = 0;
        while(currentHouse < n && currentHeater < m){
            int dist1 = Math.abs(heaters[currentHeater] - houses[currentHouse]);
            int dist2 = Integer.MAX_VALUE;
            if(currentHeater + 1 < m){
                dist2 = Math.abs(heaters[currentHeater + 1] - houses[currentHouse]);
            }
           
            if(dist1 < dist2){
                radiusRange = Math.max(radiusRange, dist1);
                currentHouse++;
            
            }else{
                currentHeater++;
            }
        }
        
        return radiusRange;
        
    }
}