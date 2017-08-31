/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiber.calciserviceclient;

/**
 *
 * @author SHWETA
 */
public class CalciServiceClient {

    public static void main(String[] args) {
        try {
            int i = 7;
            int j = 26;
            int result = add(i, j);
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

    private static int add(int i, int j) {

        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.add(i, j);

    }

}
