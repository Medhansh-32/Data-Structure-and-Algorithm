package binary_search.binary_search_on_ans;

import java.util.PriorityQueue;


public class Gas_Stations {

    public static double minmaxGasDist(int[] stations, int k) {


        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) ->
                Double.compare(b.getMaxSegment(), a.getMaxSegment()));


        int between[] = new int[stations.length - 1];

        for (int i = 1; i < stations.length; i++) {
            Double temp = (double) (stations[i] - stations[i - 1]);
            pq.add(new Pair(temp, i - 1));

        }

        for (int i = 0; i < k; i++) {

            Pair pair = pq.remove();
            int newA = stations[pair.b + 1] - stations[pair.b];
            between[pair.b]++;
            Double space = newA / (double) (between[pair.b] + 1);

            pq.add(new Pair(space, pair.b));

        }
        return pq.remove().a;
    }

    public static void main(String[] args) {
        System.out.println("Maximum distance will be : " + minmaxGasDist(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 9));
    }

    static class Pair {
        Double a;
        int b;

        public Pair(Double a, int b) {
            this.a = a;
            this.b = b;
        }

        public double getMaxSegment() {
            return a;
        }
    }
}