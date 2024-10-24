import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PathsInMaze {
    public static int numberOfPaths(int n, int[][] corridors) {
        HashMap<Integer, Set<Integer>> neighbor = new HashMap<>();
        int cycle = 0;
        for (int[] corridor : corridors) {
            int node1 = corridor[0];
            int node2 = corridor[1];
            neighbor.put(node1, new HashSet<>());
            neighbor.put(node2, new HashSet<>());
            neighbor.get(node1).add(node2);
            neighbor.get(node2).add(node1);
            cycle += calculateCycle(neighbor.get(node1), neighbor.get(node2));
        }
        return cycle;
    }

    private static int calculateCycle(Set<Integer> node1, Set<Integer> node2) {
        int count = 0;
        for (int ele : node1) {
            if(node2.contains(ele))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nList = {5, 4, 5, 5, 4};
        int[][][] corridorsList = {
                {{1, 2}, {5, 2}, {4, 1}, {2, 4}, {3, 1}, {3, 4}},
                {{1, 2}, {3, 4}},
                {{1, 2}, {5, 2}, {4, 1}, {3, 1}, {3, 4}},
                {{1, 2}, {5, 2}, {4, 1}, {2, 4}, {3, 1}, {3, 4}, {1, 5}},
                {{1, 2}, {2, 3}, {3, 4}}
        };

        for (int i = 0; i < nList.length; i++) {
            System.out.println((i + 1) + ".\t n: " + nList[i]);
            System.out.println("\t corridors: " + Arrays.deepToString(corridorsList[i]));
            System.out.println("\t cycles: " + numberOfPaths(nList[i], corridorsList[i]));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }
}
