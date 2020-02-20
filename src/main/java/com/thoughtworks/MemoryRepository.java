package com.thoughtworks;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class MemoryRepository<E> implements Repository<E> {
    private Map<String, E> allObj = new HashMap<>();

    public MemoryRepository() {
    }

    @Override
    public void save(String id, E entity) {
        this.allObj.put(id, entity);
    }

    public E get(String id) {
        return this.allObj.get(id);
    }

    @Override
    public E delete(String id) {
        return this.allObj.remove(id);
    }

    @Override
    public void update(String id, E entity) {
        if (this.allObj.containsKey(id)) {
            this.allObj.replace(id, entity);
        }
    }

    @Override
    public List<E> list() {
        Iterator<Map.Entry<String, E>> iterator = this.allObj.entrySet().iterator();
        List<E> list = new ArrayList<>();
        while (iterator.hasNext()) {
            list.add(iterator.next().getValue());
        }
        return list;
    }

    @Override
    public String toString() {
        return  this.allObj.toString();
    }
}
