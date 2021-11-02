package com.codewithsri;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Box1");
        System.out.println(textBox1.text.toUpperCase(Locale.ROOT));

        var textbox2 = new TextBox();
        textbox2.setText("Box2");
        System.out.println(textbox2.text);
    }

}
