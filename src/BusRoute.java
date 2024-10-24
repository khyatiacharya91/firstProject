import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusRoute {
    public static void main(String[] args) {
        int[][] routes = {
                {2, 5, 7}, {4, 6, 7}};
        int src = 2;
        int dest = 6;
        int i = BusRoute.minimumBuses(routes, src, dest);
        System.out.println(i);
    }
    public static int minimumBuses(int[][] busRoutes, int src, int dest) {

        Map<Integer,List<Integer>> map = new HashMap<>();

        for (int i = 0; i < busRoutes.length; i++) {
            for (int j = 0; j < busRoutes[i].length; j++) {
                if(map.containsKey(busRoutes[i][j]))
                {
                    map.get(busRoutes[i][j]).add(i);
                }else {
                    map.put(busRoutes[i][j],new ArrayList<>());
                    map.get(busRoutes[i][j]).add(i);
                }
            }
        }
        List<Integer> Custsrc = new ArrayList<>();
        List<Integer> Custdes = new ArrayList<>();
        int routes=0;
        if (map.containsKey(src)) {
            Custsrc = map.get(src);
            if (map.containsKey(dest)) {
                Custdes = map.get(dest);
            }
            if(!Custsrc.isEmpty() && !Custdes.isEmpty() && map.containsValue(Custsrc) && map.containsValue(Custdes))
            {
                routes = map.values().size();
            }
        }

        if(routes > 0)
        {
            int station =-1;
            for (int i = 0; i < routes; i++) {
                station++;
            }
            return station;
        }

        return -1;
    }
}
