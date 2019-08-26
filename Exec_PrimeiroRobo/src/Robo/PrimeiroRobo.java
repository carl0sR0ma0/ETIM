package Robo;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
/**
 *
 * @author Carlos
 */
public class PrimeiroRobo {

    public static void main(String[] args) {
        try{
            Robot visao = new Robot();
            visao.delay(50);
            visao.setAutoDelay(50);
            visao.mouseMove(600, 400);
            visao.mousePress(InputEvent.BUTTON1_MASK);
            visao.mouseRelease(InputEvent.BUTTON1_MASK);
            visao.keyPress(KeyEvent.VK_S);
            visao.keyRelease(KeyEvent.VK_S);
            visao.keyPress(KeyEvent.VK_E);
            visao.keyRelease(KeyEvent.VK_E);
            visao.keyPress(KeyEvent.VK_U);
            visao.keyRelease(KeyEvent.VK_U);
            visao.keyPress(KeyEvent.VK_SPACE);
            visao.keyRelease(KeyEvent.VK_SPACE);
            visao.keyPress(KeyEvent.VK_P);
            visao.keyRelease(KeyEvent.VK_P);
            visao.keyPress(KeyEvent.VK_C);
            visao.keyRelease(KeyEvent.VK_C);
            visao.keyPress(KeyEvent.VK_SPACE);
            visao.keyRelease(KeyEvent.VK_SPACE);
            visao.keyPress(KeyEvent.VK_F);
            visao.keyRelease(KeyEvent.VK_F);
            visao.keyPress(KeyEvent.VK_O);
            visao.keyRelease(KeyEvent.VK_O);
            visao.keyPress(KeyEvent.VK_I);
            visao.keyRelease(KeyEvent.VK_I);
            visao.keyPress(KeyEvent.VK_SPACE);
            visao.keyRelease(KeyEvent.VK_SPACE);
            visao.keyPress(KeyEvent.VK_H);
            visao.keyRelease(KeyEvent.VK_H);
            visao.keyPress(KeyEvent.VK_A);
            visao.keyRelease(KeyEvent.VK_A);
            visao.keyPress(KeyEvent.VK_C);
            visao.keyRelease(KeyEvent.VK_C);
            visao.keyPress(KeyEvent.VK_K);
            visao.keyRelease(KeyEvent.VK_K);
            visao.keyPress(KeyEvent.VK_E);
            visao.keyRelease(KeyEvent.VK_E);
            visao.keyPress(KeyEvent.VK_A);
            visao.keyRelease(KeyEvent.VK_A);
            visao.keyPress(KeyEvent.VK_D);
            visao.keyRelease(KeyEvent.VK_D);
            visao.keyPress(KeyEvent.VK_O);
            visao.keyRelease(KeyEvent.VK_O);
        } catch(AWTException e){
            e.printStackTrace();
          }
    }    
}