package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.TreeMap;

public class Router {
    TreeMap<String,String> connecter = new TreeMap<>();

    public void add(String path, String controller) {
        connecter.put(path,controller);

    }

    public Integer size() {
        return connecter.size();
    }

    public String getController(String path) {
        return connecter.get(path);
    }

    public void update(String path, String studentController) {
        connecter.put(path,studentController);
    }

    public void remove(String path) {
        connecter.remove(path);
    }
}
//Where is the toString Test