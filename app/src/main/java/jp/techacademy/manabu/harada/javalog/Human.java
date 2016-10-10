package jp.techacademy.manabu.harada.javalog;


import android.util.Log;

class Human extends Animal implements Thinkable {
    // クラス変数
    static String to_jp = "人間";
    private String hobby;

    // コンストラクタ
    public Human(String name, int age, String hobby) {
            this.name = name;
            this.age = age;
            this.hobby = hobby;
        }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは人間クラスです。");
    }

    // メンバ関数
    @Override
    public void say() { Log.d("javatest", "私の名前は"+this.name + "です。年は"+this.age + "歳です。" );

    }
    public void think(){

        Log.d("javatest", "私は"+hobby+"について考える");
    }

}
