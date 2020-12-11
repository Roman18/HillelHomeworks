package com.company.Homeworks.Homework5;

public class StringCrypter {
   private SymbolCrypter symbolCrypter;
    public StringCrypter(SymbolCrypter symbolCrypter){
        this.symbolCrypter=symbolCrypter;
    }
    public String crypt(String text){
        String newText="";
        for (int i = 0; i <text.length() ; i++) {
            newText+=symbolCrypter.crypt(text.charAt(i));
        }
        return newText;
    }
    public String decrypt(String text){
        String newText="";
        for (int i = 0; i <text.length() ; i++) {
            newText+=symbolCrypter.decrypt(text.charAt(i));
        }
        return newText;
    }
}
