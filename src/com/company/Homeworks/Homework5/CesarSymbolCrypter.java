package com.company.Homeworks.Homework5;

public class CesarSymbolCrypter implements SymbolCrypter{

    private static final int KEY=5;
    @Override
    public char crypt(char c) {
        int newSymbol=c+KEY;
        return (char) newSymbol;
    }

    @Override
    public char decrypt(char c) {
        int newSymbol=c-KEY;
        return (char) newSymbol;
    }
}
