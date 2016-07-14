package meirdev.simulator.gui.hexEditor.folder;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: laullon
 * Date: 08-abr-2003
 * Time: 13:16:06
 */
public class Test extends WindowAdapter
{
    private JFrame win;

    public Test() throws IOException
    {
        byte[] ar;
        ar=new byte[16*16*100];
        Arrays.fill(ar,(byte)0);


        win=new JFrame();
        win.getContentPane().add(new JHexEditor(ar));
        win.addWindowListener(this);
        win.pack();
        win.show();
    }

    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }



    public static void main(String arg[]) throws IOException
    {
        new Test();
    }
}
