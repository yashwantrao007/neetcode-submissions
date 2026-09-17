class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> hash = new PriorityQueue<>((a,b)->{return b[0]-a[0];});

        for(int i = 0; i<points.length; i++){
            int[] point = points[i];

            int x = point[0], y = point[1];

            int dist = (x*x)+(y*y);

            hash.add(new int[]{dist,i});

            if(hash.size()>k){
                hash.poll();
            }
        }

        int[][] res = new int[k][2];
        int i = 0;

        while(i<k){
            int[] ele = hash.poll();

            int dst = ele[0], coorIdx = ele[1];

            res[i][0] = points[coorIdx][0];
            res[i][1] = points[coorIdx][1];

            i++;
        }

        return res;
        

    }
}
