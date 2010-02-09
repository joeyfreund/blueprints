package com.tinkerpop.blueprints.pgm.impls.neo4j.util;


import org.neo4j.graphdb.Node;

import java.util.Iterator;

import com.tinkerpop.blueprints.pgm.Vertex;
import com.tinkerpop.blueprints.pgm.impls.neo4j.Neo4jGraph;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class Neo4jVertexIterable implements Iterable<Vertex> {

    Iterable<Node> nodes;
    Neo4jGraph graph;

    public Neo4jVertexIterable(final Iterable<Node> nodes, final Neo4jGraph graph) {
        this.nodes = nodes;
        this.graph = graph;
    }

    public Iterator<Vertex> iterator() {
        return new Neo4jVertexIterator(this.nodes, this.graph);
    }
}