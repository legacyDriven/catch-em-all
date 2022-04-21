package com.rpam.rd.autotasks;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {

    //You may set another exception in this field;
    static Exception exception = new FileNotFoundException();
    public static void riskyMethod() throws Exception {

        throw exception;
    }

    public static void main(String[] args) throws Exception {

        try {
            riskyMethod();
        }   catch (FileNotFoundException ex) {
                throw new IllegalArgumentException("Resource is missing", ex);}
            catch (IOException ex2) {
                throw new IllegalArgumentException("Resource error", ex2);}
            catch (ArithmeticException|NumberFormatException ex3){
                System.err.println(ex3.getMessage());}

    }
}
