package com.example.jstore_android_dhio;

public class Configuration {

//    IP jika pakai emulator
//    public static final String IP = "10.0.2.2";
//    IP jika pakai HP
//    public static final String IP = "192.168.43.165";
    public static final String IP = "localhost";

    public static final String PORT = ":8080";

//    URL to send data to database
    public static final String URL_REGIS = "http:/" + IP + PORT +"/newcustomer";
    public static final String URL_ITEM = "http:/" + IP + PORT +"/items";
    public static final String URL_LOGIN = "http:/" + IP + PORT +"/logincust";
    public static final String URL_SELL_PAID = "http:/" + IP + PORT +"/createinvoicepaid";
    public static final String URL_SELL_UNPAID = "http:/" + IP + PORT +"/createinvoiceunpaid";
    public static final String URL_SELL_INSTALLMENT = "http:/" + IP + PORT +"/createinvoiceinstallment";
    public static final String URL_GET_INVOICE = "http:/" + IP + PORT +"/invoicecustomer";
    public static final String URL_FINISH_TRANSACTION = "http:/" + IP + PORT +"/finishtransaction";
    public static final String URL_CANCEL_TRANSACTION = "http:/" + IP + PORT +"/canceltransaction";

//    URL to get data from database

}
