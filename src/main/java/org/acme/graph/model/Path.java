package org.acme.graph.model;

import java.util.List;

public class Path {
    // Attribute
    private List<Edge> edges;

    // Constructor
    public Path(List<Edge> edges) {
        assert edges != null;
        this.edges = edges;
    }

    // Method
    public double getLength(){
        return this.edges.size();
    }

    public Edge getEdgeN(int n){
        return this.edges.get(n);
    }
    
}