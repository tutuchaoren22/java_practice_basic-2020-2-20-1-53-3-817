package com.thoughtworks;
//定义一个工具类 RepositoryUtil，包含一个静态方法 printList, 可以将任何对象列表打印到控制台。

import java.util.List;

public class RepositoryUtil{
    public static void printList(List<?> list){
        System.out.println(list);
    }
}
