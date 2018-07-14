package com.lizhy.composite;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-14 17:10
 */
public class Main {
    public static void main(String[] args) {
        File txt = new File("文本.txt");
        File mp3 = new File("音乐.mp3");
        File img = new File("图片.png");

        Folder f1 = new Folder("我的收藏");
        f1.add(txt);
        f1.add(mp3);

        Folder f2 = new Folder("下载");
        f2.add(img);

        Folder f3 = new Folder("我的电脑");
        f3.add(f1);
        f3.add(f2);

        f3.operate();
    }
}



