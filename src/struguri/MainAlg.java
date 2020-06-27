//package struguri;
//
//import java.util.*;
//
//public class MainAlg {
//    public static void main(String[] args) {
//        Graph graph = new Graph();
//        Set<Node> unvisitedNodes;
//        unvisitedNodes = graph.addAllNodes();
//        Set<Node> visitedNodes;
//        List<DistanceMatrix> distanceMatrixList = new ArrayList<>();
//        for(Node node: unvisitedNodes) {
//            getLowestDistance(node, distanceMatrixList);
//        }
//    }
//
//    private static Node getLowestDistance(Node node, List<DistanceMatrix> distanceMatrixList) {
//        node.neighbours.forEach(k, v -> {
//            for (DistanceMatrix element : distanceMatrixList) {
//                if (element.nodeValue(k)) {
//                    if (element.cost < v) {
//                        element.cost = v;
//                        element.nodeValue = k;
//                        element.previousNode = node.value;
//                    }
//                }
//            }
//        });
//
//    }
//}
//
//class Graph {
//    Set<Node> nodes;
//
//    public Set<Node> addAllNodes() {
//        return new HashSet<>();
//    }
//}
//
//class DistanceMatrix {
//   public String nodeValue;
//   public Integer cost;
//   public String previousNode;
//}
//
//class Node {
//    public String value;
//    public Map<Node, Integer> neighbours;
//}