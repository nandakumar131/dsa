package org.nanda.leetcode.hard;


import java.util.*;

/**
 * We will consider each route as a node and if there is path between
 * one route to another, we will consider that as an edge.
 */
public class Solution_815 {

  private static class City {

    private static final Map<Integer, City> cities = new HashMap<>();

    private Integer id;
    private Set<Route> routes;

    private City(int id) {
      this.id = id;
      this.routes = new HashSet<>();
    }

    public void addRoute(Route route) {
      routes.add(route);
    } 

    public Set<Route> getAllRoutes() {
      return routes;
    }

    public static City getCity(Integer id) {
      if (!cities.containsKey(id)) {
        cities.put(id, new City(id));
      }
      return cities.get(id);
    }

    @Override
    public int hashCode() {
      return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
      return id.equals(obj);
    }

    @Override
    public String toString() {
      List<Integer> r = routes.stream().map(Route::getID).toList();
      return id + " [" + r + " ]"; 
    }
  }

  private static class Route {

    private int id;

    private Set<City> cities;
    private Set<Route> adjacent;

    private boolean visited;

    private Route(int id) {
      this.id = id;
      this.cities = new HashSet<>();
      this.adjacent = new HashSet<>();
    }

    public Integer getID() {
      return id;
    }
    public void visited() {
      visited = true;
    }

    public boolean isVisited() {
      return visited;
    }

    public void addCity(City city) {
      cities.add(city);
    }

    public boolean contains(City city) {
      return cities.contains(city);
    }

    public void addAdjacentRoute(Route route) {
      adjacent.add(route);
    }

    public Set<Route> getAdjacentRoutes() {
      return adjacent;
    }

    @Override
    public String toString() {
      return "Route: " + id + " Cities: [ " + cities + " ]";
    }

  }

  public static Route[] constructGraph(int[][] routes) {
    final Route[] allRoutes = new Route[routes.length];

    for (int i = 0; i < routes.length; i++) {
      final int[] road = routes[i];
      Route currentRoute = new Route(i);
      allRoutes[i] = currentRoute; 

      for (int j = 0; j < road.length; j++) {
        City city = City.getCity(road[j]);
        currentRoute.addCity(city);
        Set<Route> connected = city.getAllRoutes();
        for (Route r : connected) {
          r.addAdjacentRoute(currentRoute);
          currentRoute.addAdjacentRoute(r);
        }
        city.addRoute(currentRoute);
      }

    }
    return allRoutes;
  }

  public static int getBusCount(Route[] routes, int source, int dest) {

    Map<Route, Route> parentNode = new HashMap<>();
    Queue<Route> queue = new LinkedList<Route>();
    for (Route route : routes) {
      if (route.contains(City.getCity(source))) {
        queue.offer(route);
      }
    }
    /*
     * In BFS we have to pick a source node, process it and have to
     * process all the connected nodes as well.
     */

    Route route = queue.poll();
    while(route != null) {
      route.visited();
      if (route.contains(City.getCity(dest))) {
        return getNumberOfBuses(parentNode, source, route);
      }

      for(Route adjacent : route.getAdjacentRoutes()) {
        if (!adjacent.isVisited())
          queue.offer(adjacent);
          parentNode.put(adjacent, route);
      }
      route = queue.poll();
    }
    return -1;
  }

  private static int getNumberOfBuses(Map<Route, Route> parentMap, int source, Route finalRoute) {
    int busCount = 0;
    Route current = finalRoute;
    while(current != null) {
      busCount++;
      if(current.contains(City.getCity(source))) {
        return busCount;
      }
      current = parentMap.get(current);
    }
    // This should not happen
    return -1;
  }



  public static void main(String[] args) {
    int[][] routes = {
                      {25,33},
                      {3,5,13,22,23,29,37,45,49},
                      {15,16,41,47},
                      {5,11,17,23,33},
                      {10,11,12,29,30,39,45},
                      {2,5,23,24,33},
                      {1,2,9,19,20,21,23,32,34,44},
                      {7,18,23,24},
                      {1,2,7,27,36,44},
                      {7,14,33}
                    };
    Route[] graph = constructGraph(routes);
    int count = getBusCount(graph, 7, 47);
    System.out.println(count);
  }

}
