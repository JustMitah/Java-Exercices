/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP3;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author Kazwell
 */
public class Cas1_Client {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws Exception{
        boolean finished = false;
        String msg;
        while(!finished){
        System.out.println("Creation du socket");    
        Socket socket = new Socket("10.11.1.172",9999);
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        DataInputStream input = new DataInputStream(System.in);
        System.out.print("> ");
        System.out.flush();
        msg = input.readLine();
        output.writeUTF(msg);
        if (msg.equals("END")){
            finished = true;
        }
        socket.close();
    }
}}
