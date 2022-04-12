package com.github.xuchengen.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Loadblance {

    static final List<String> list = new ArrayList<String>() {{
        add("张三");
        add("李四");
        add("王五");
        add("赵六");
    }};

    public static void main(String[] args) {
        randomLoadblance();
        roundRobinLoadblance();
        ipHashLoadblance();
    }

    public static void randomLoadblance() {
        System.out.println("-----------------------------");
        System.out.println("随机算法");
        System.out.println("-----------------------------");
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            System.out.println(list.get((random.nextInt() & 0x7FFFFFFF) % list.size()));
        }
    }

    public static void roundRobinLoadblance() {
        System.out.println("-----------------------------");
        System.out.println("轮询算法");
        System.out.println("-----------------------------");

        for (int i = 0; i < 12; i++) {
            System.out.println(list.get((i & 0x7FFFFFFF) % list.size()));
        }
    }

    public static void ipHashLoadblance() {
        System.out.println("-----------------------------");
        System.out.println("IP-HASH算法");
        System.out.println("-----------------------------");
        ArrayList<String> ipList = new ArrayList<>();
        ipList.add("172.17.0.1");
        ipList.add("172.18.0.1");
        ipList.add("172.19.0.1");
        ipList.add("172.20.0.1");
        ipList.add("172.21.0.1");
        ipList.add("172.22.0.1");
        ipList.add("172.23.0.1");
        ipList.add("172.24.0.1");
        ipList.add("172.25.0.1");
        ipList.add("172.26.0.1");
        for (String ip : ipList) {
            System.out.println(list.get((ip.hashCode() & 0x7FFFFFFF) % list.size()));
        }
    }
}
