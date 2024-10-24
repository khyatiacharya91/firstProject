import java.util.*;

public class NetworkDelay {

    public static int networkDelayTime(int[][] times, int n, int k) {

        HashMap<Integer, List<int []>> hashMap =new HashMap<>();

        for(int[] time : times)
        {
            int[] arr = new int[2];
            int source = time[0];
            int destination = time[1];
            int timeTravel = time[2];
            arr[0] =source;
            arr[1] =destination;
            List<int[]> list = new ArrayList<>();
            list.add(arr);
            hashMap.put(source, list);
        }
        PriorityQueue<int[]> min = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        min.add(new int[]{0, k});
        Set<Integer> visited = new HashSet<>();
        int delays = 0;
        while (!min.isEmpty()) {
            int[] curr = min.poll();
            int time = curr[0];
            int node = curr[1];

            if (visited.contains(node))
                continue;

            visited.add(node);

            delays = Math.max(delays, time);
            List<int[]> neighbors = hashMap.getOrDefault(node, new ArrayList<>());

            for (int[] neightbor : neighbors) {
                int newNode = neightbor[0];
                int newNodetime = neightbor[1];
                if (!visited.contains(newNode)) {
                    int newTime = time + newNodetime;
                    min.add(new int[]{newTime, newNode});
                }
            }
        }

        if (visited.size() == n)
            return delays;

        return -1;
    }
}

