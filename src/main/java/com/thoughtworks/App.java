package com.thoughtworks;

public class App {
    public static void main(String[] args) {
        Student zhangSan = new Student("3", "张三");
        Student liSi = new Student("4", "李四");
        Student wangWu = new Student("5", "王五");
        Student zhaoLiu = new Student("6", "赵六");
        Student qianQi = new Student("7", "钱七");

        MemoryRepository<Student> memoryRepository = new MemoryRepository<>();
        memoryRepository.save(zhangSan.getId(), zhangSan);
        memoryRepository.save(liSi.getId(), liSi);
        memoryRepository.save(wangWu.getId(), wangWu);
        memoryRepository.save(zhaoLiu.getId(), zhaoLiu);
        memoryRepository.save(qianQi.getId(), qianQi);

        System.out.println(memoryRepository.get(zhangSan.getId()));
        memoryRepository.delete(liSi.getId());
        memoryRepository.update(wangWu.getId(), new Student("5", "冯五"));

        RepositoryUtil.printList(memoryRepository.list());
    }
}
