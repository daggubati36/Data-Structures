package com.passion2code.datastructures.graphs;

public class GraphApp {
    public static void main(String[] args) {
        Graph<Character> graph = new Graph<>();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');

        graph.printVertex();

        graph.addEdge('A', 'B');
        graph.addEdge('A', 'D');
        graph.addEdge('B', 'C');
        graph.addEdge('D', 'E');
        //graph.addEdge(2, 9);

        graph.printAdjMatrix();
        //graph.printVertex();

        graph.dfs();
        graph.bfs();
    }
}
