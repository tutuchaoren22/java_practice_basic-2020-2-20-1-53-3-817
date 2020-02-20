package com.thoughtworks;

import java.util.*;

//定义一个实现类 MemoryRepository 实现在内存中管理对象
//        save(id, entity), 保存对象，并与一个String类型的 id 关联起来
//        get(id), 根据 id 获取对象
//        delete(id), 删除 id 对应的对象
//        update(id, entity), 替换 id 对应的对象为新对象
//        list(), 列出仓库中的所有对象
public class MemoryRepository<E> implements Repository<E> {
    private Map<String, E> allObj = new HashMap<>();

    public MemoryRepository() {
    }

    @Override
    public void save(String id, E entity) {
        this.allObj.put(id, entity);
        System.out.println( this.allObj.size());
    }

    public E get(String id) {
        return this.allObj.get(id);
    }

    @Override
    public E delete(String id) {
        return this.allObj.remove(id);
    }

    @Override
    public E update(String id, E entity) {
        return this.allObj.put(id, entity);
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
        return "MemoryRepository{" +
                "allObj=" + allObj +
                '}';
    }
}
