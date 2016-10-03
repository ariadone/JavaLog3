package jp.techacademy.manabu.harada.javalog;

import android.util.Log;

/**
 * Created by harada on 2016/10/02.
 */

class Human extends Animal {
    // クラス変数
    static String to_jp = "人間";

    // コンストラクタ
    public Human(String name, int age) {
        this.name = name;
        this.age = age;

    }

   String hobby="政治";


    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは人間クラスです。");
    }

    // メンバ関数
    public void say() {

    }
    public void think(){
        Log.d("javatest", "私は"+hobby+"について考える");

    }


}
