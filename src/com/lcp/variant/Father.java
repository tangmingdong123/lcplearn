package com.lcp.variant;

public class Father {
    private static int mem=1;
    public Father() {
        System.out.println("����汾���캯��");
        this.Cg();
        System.out.println("�����memֵΪ"+mem);
    }
    public   void Cg() {
        System.out.println("�����Cg����"+mem);
        this.mem=5;
    }
}
