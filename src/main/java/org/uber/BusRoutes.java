package org.uber;

import java.util.*;

public class BusRoutes {

    public int numBusesToDestination(int[][] routes, int S, int T) {
        HashSet<Integer> visitedBuses = new HashSet<>();
        Queue<Integer> queueBusStops = new LinkedList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int ret = 0;

        if (S==T) return 0;

        for(int i = 0; i < routes.length; i++){
            for(int j = 0; j < routes[i].length; j++){
                ArrayList<Integer> buses = map.getOrDefault(routes[i][j], new ArrayList<>());
                buses.add(i);
                map.put(routes[i][j], buses);
            }
        }

        queueBusStops.offer(S);
        while (!queueBusStops.isEmpty()) {
            int len = queueBusStops.size();
            ret++;
            for (int i = 0; i < len; i++) {
                int cur = queueBusStops.poll();
                ArrayList<Integer> buses = map.get(cur);
                for (int bus: buses) {
                    if (visitedBuses.contains(bus)) continue;
                    visitedBuses.add(bus);
                    for (int j = 0; j < routes[bus].length; j++) {
                        if (routes[bus][j] == T) return ret;
                        queueBusStops.offer(routes[bus][j]);
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BusRoutes br = new BusRoutes();
        int routes[][] = {{1, 2, 7}, {3, 6, 7}};
        System.out.println( br.numBusesToDestination(routes,1,6));
    }
}
