class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n =position.length;
        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));
            int fleets = 0;
        double slowestFleetTime = 0;

        for (int[] car : cars) {
            int pos = car[0];
            int spd = car[1];

            double timeToTarget = (double) (target - pos) / spd;

            // This car cannot catch the fleet ahead
            if (timeToTarget > slowestFleetTime) {
                fleets++;
                slowestFleetTime = timeToTarget;
            }
            // Otherwise, it catches up and joins the existing fleet
        }

        return fleets;
    }
}
