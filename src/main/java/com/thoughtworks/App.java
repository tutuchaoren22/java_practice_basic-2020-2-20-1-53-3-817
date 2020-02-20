package com.thoughtworks;

public class App {
//  在 App 类中尝试用MemoryRepository 管理学生。
//  先创建一些学生((3,张三)，(4,李四)，(5,王五)，(6,赵六)，(7,钱七))并保存进仓库，
//  然后从仓库中获取张三并打印，接着从仓库中删除李四。
//  然后新建一个学生(5,冯五)替换仓库中的王五，
//  最后获取仓库中的所有学生并用 printList方法打印到控制台。
  public static void main(String[] args) {
    Student zhangSan =new Student("3","张三");
    Student liSi =new Student("4","李四");
    Student wangWu =new Student("5","王五");
    Student zhaoLiu =new Student("6","赵六");
    Student qianQi =new Student("7","钱七");

    MemoryRepository memoryRepository = new MemoryRepository();
    memoryRepository.save(zhangSan.getName(),zhangSan);
    memoryRepository.save(liSi.getName(),liSi);
    memoryRepository.save(wangWu.getName(),wangWu);
    memoryRepository.save(zhaoLiu.getName(),zhaoLiu);
    memoryRepository.save(qianQi.getName(),qianQi);

    System.out.println(memoryRepository);
    System.out.println(memoryRepository.get("张三"));
    memoryRepository.delete("李四");
    System.out.println(memoryRepository);
    memoryRepository.update("王五",new Student("5","冯五"));
    System.out.println(memoryRepository);

    RepositoryUtil.printList(memoryRepository.list());
  }
}
