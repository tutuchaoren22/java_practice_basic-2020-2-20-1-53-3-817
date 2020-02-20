package com.thoughtworks;
//首先定义一个Repository泛型接口，包含以下5个方法：
//        save(id, entity), 保存对象，并与一个String类型的 id 关联起来
//        get(id), 根据 id 获取对象
//        delete(id), 删除 id 对应的对象
//        update(id, entity), 替换 id 对应的对象为新对象
//        list(), 列出仓库中的所有对象

import java.util.List;

public interface Repository<E> {
    public abstract void save(String id, E entity);

    public abstract E get(String id);

    public abstract E delete(String id);

    public abstract E update(String id, E entity);

    public abstract List<E> list();

}
