import java.util.*;

public class Main{
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[] args) {
        int vertices = 5;
        visited = new boolean[vertices];
        for(int i=0; i<vertices; i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(2).add(0);
        graph.get(2).add(4);
        graph.get(3).add(1);
        graph.get(4).add(2);

        dfs(0);
    }
    public static void dfs(int source){
        visited[source] = true;
        System.out.print(source + " ");
        for(int neighbour : graph.get(source)){
            if(!visited[neighbour]){
                dfs(neighbour);
            }
        }   


        
    }
}