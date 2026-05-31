package org.example;

import com.microsoft.playwright.*;
import org.example.playWright.CodeGen;
import org.example.playWright.Inputs;
import org.example.playWright.ScreenShot;
import org.example.playWright.Title;

import java.nio.file.Paths;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //  get title of the page
        Title title = new Title();
//        title.printTitle();
        //  get screenShot of the page
        ScreenShot screenShot = new ScreenShot();
//        screenShot.getScreenShot();
        //  get inputs
        Inputs inputs = new Inputs();
//        inputs.getInputs();

        CodeGen codeGen = new CodeGen();
        codeGen.codeGenerator();
    }
}
