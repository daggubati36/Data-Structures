package com.passion2code.datastructures.graphs;
/**
 * This is implementation of Simple Undirected Graph
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph<T extends Comparable<T>> {
    private final int initialCapacity = 5;
    private ArrayList<Vertex<T>> vertices;
    private int[][] adjMatrix;

    public Graph() {
        vertices = new ArrayList<>(initialCapacity);
        adjMatrix = new int[initialCapacity][initialCapacity];
    }

    public void addVertex(T data) {
        Vertex<T> vertex = new Vertex<>(data);
        vertices.add(vertex);
    }

    public void addEdge(T vertex1, T vertex2) {
        // check if both vertices are available
        int v1 = getIndexOfVertex(vertex1);
        int v2 = getIndexOfVertex(vertex2);

        // If true, add an edge in Adj Matrix
        // if false, create the vertex and add edge
        if (v1 >= 0 && v2 >= 0) {
            addEdgeToAdjMatrix(v1, v2);
        } else if (v1 < 0) {
            addVertex(vertex1);
            v1 = getIndexOfVertex(vertex1);
            addEdgeToAdjMatrix(v1, v2);
        } else {
            addVertex(vertex2);
            v2 = getIndexOfVertex(vertex2);
            addEdgeToAdjMatrix(v1, v2);
        }
    }

    public void printVertex() {
        for (Vertex<T> v : vertices)
            System.out.print(v.getData() + " ");
        System.out.println();
    }

    public void printAdjMatrix() {
        for (int[] i : adjMatrix) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    // Depth First Search Implementation
    public void dfs() {
        Stack<Vertex<T>> stack = new Stack<>();
        vertices.get(0).setVisited(true);
        stack.push(vertices.get(0));
        System.out.print(vertices.get(0).getData() + " ");

        while (!stack.isEmpty()) {
            Vertex<T> current = getUnvisitedVertex(stack.peek()); // Get unvisited vertex
            if (current != null) {
                current.setVisited(true); // Mark it
                System.out.print(current.getData() + " ");
                stack.push(current); // Push it Stack
            } else {
                stack.pop();
            }
        }
        System.out.println();

        for (Vertex<T> vertex : vertices) {
            vertex.setVisited(false);
        }
    }

    public void bfs() {
        Queue<Vertex<T>> q = new LinkedList<>();
        vertices.get(0).setVisited(true);
        System.out.print(vertices.get(0).getData() + " ");
        q.add(vertices.get(0));

        while (!q.isEmpty()) {
            Vertex<T> unvisited = getUnvisitedVertex(q.peek());
            if (unvisited != null) {
                unvisited.setVisited(true);
                System.out.print(unvisited.getData() + " ");
                q.add(unvisited);
            } else
                q.remove();
        }
        System.out.println();

        for (Vertex<T> v : vertices)
            v.setVisited(false);
    }

    private Vertex<T> getUnvisitedVertex(Vertex<T> current) {
        int v = getIndexOfVertex(current.getData());

        for (int i = 0; i < vertices.size(); i++) {
            if (adjMatrix[v][i] == 1 && !vertices.get(i).isVisited()) {
                return vertices.get(i);
            }
        }
        return null;
    }

    private int getIndexOfVertex(T ver) {
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).getData() == ver) {
                return i;
            }
        }
        return -1;
    }

    private void addEdgeToAdjMatrix(int v1, int v2) {
        adjMatrix[v1][v2] = 1;
        adjMatrix[v2][v1] = 1;
    }
}
