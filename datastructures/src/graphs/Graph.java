package graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjacentList = new HashMap<>();
    public boolean addVertex(String vertex){
        if(null==adjacentList.get(vertex)){
            adjacentList.put(vertex,new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        if(null != adjacentList.get(vertex2) && null != adjacentList.get(vertex2))
        {
            adjacentList.get(vertex1).add(vertex2);
            adjacentList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if (null != adjacentList.get(vertex1) && null != adjacentList.get(vertex2)){
            adjacentList.get(vertex1).remove(vertex2);
            adjacentList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
        if(null == adjacentList.get(vertex)) return false;
        for (String otherVertex : adjacentList.get(vertex)){
            adjacentList.get(otherVertex).remove(vertex);
        }
        adjacentList.remove(vertex);
        return true;
    }

    public void printGraph(){
        System.out.println(adjacentList);
    }
}
