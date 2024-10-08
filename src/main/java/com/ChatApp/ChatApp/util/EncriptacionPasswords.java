/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ChatApp.ChatApp.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptacionPasswords {
    public static void main(String[] args) {
       
    var password = "Ingrid2312IVAH";
     System.out.println("PasswordComun" + password);
        System.out.println("PasswordEncrypt:" +encriptar(password));
    }
    private static String encriptar(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
