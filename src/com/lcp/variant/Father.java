package com.lcp.variant;

public class Father {
    private static int mem=1;
    public Father() {
        System.out.println("基类版本构造函数");
        this.Cg();
        System.out.println("基类的mem值为"+mem);
    }
    public   void Cg() {
        System.out.println("基类的Cg方法"+mem);
        this.mem=5;
    }
}
