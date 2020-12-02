package test;

import data.structure.Graph;
import data.structure.ListLinked;
import data.structure.Vertex;
import data.structure.Node;

public class PruebaArticulaciones {
    public static void main(String[] args) {
        Graph graph = new Graph(false);
        ListLinked <Vertex> articulations;
        Node<Vertex> node;
        graph.readFileInput("pruebaArticulacion.txt");
        articulations = graph.listaVerticesArticulados();
        node = articulations.getHead();
        while(node!=null) {
            System.out.print("\nVertice de articulación: "+node.getData().getLabel());            
            node = node.getLink();
        }        
    }
}