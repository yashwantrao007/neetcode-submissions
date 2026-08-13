class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        //pair up each car position to with the time it takes to reach the target
        double[][] cars = new double[position.length][2];

        for(int i = 0; i<position.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = (double)(target-position[i])/speed[i];
        }

        Arrays.sort(cars,(a,b) -> Double.compare(b[0],a[0]));

        int count = 0;
        double prevTime = 0;

        for(double[] car : cars){
            if(car[1]>prevTime){
                count++;
                prevTime=car[1];
            }
        }

        return count;
        
    }
}
