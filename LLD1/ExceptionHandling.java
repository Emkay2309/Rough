package LLD1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//                                        EXCEPTION  HANDLING
//                                   *****************************
// What is an Exception --> Un excepted events that occurs during program execution , during runtime.
//Reasons : ~Invalid User Input  ~Connection to DB  ~Heap Space is full  ~Coding errors by developers
// ~Access a file - fie doesn't exist - no permission to open a file
// ~ Multithreading

// JAVA --> In java exception is a special type of Objects.It will contain information about the event that triggered exception.


                            //                    Throwable
                            //                 /             \
                            //              Error           Exception
                            //             /              /           \
                            //        Out of memory    Runtime         IO exception,Checked
                            //                       (Unchecked)

// Errors : -- Scenario that are not possible to anticipate and recover from them.
//          -- Hardware failure , Memory limit full
//          -- Should not try to handle these situations : OutOfMemoryError , StackOverFlow errors

// Checked Exceptions : -- Scenarios which we can anticipate and try to recover from it.
//                      -- FileNotFoundException , if the file is not available , provide a useful message to the user
//                         throw this exception with a useful message.
//                       -------> If the
//

// Runtime Exceptions : -- are caused by bad programming
//                       -- try to access an element which is outside array bounds .
//                       -- a/b if b is zero
//                       -- It can be avoided by writing better code.



// Try     --   put the code where you anticipate an exception.
// Catch   --   catch the exception , this will execute.
// Finally --   Always executed no matter whether exception or not.  // optional to write

// throw ---> Some exception object is there .
// throws---> This method can throw an exception.

public class ExceptionHandling {
    public static void main(String[] args)  {
        int a = 5;
        int b = 2;
        int result = 0;

        try{
            result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException err) {
            err.printStackTrace();
            System.out.println(err.getMessage());
        }
        System.out.println("This is still running , still with the error. So we handled the error and ran complete code");

        try {
            findFile("abc.txt");
        }
        catch(IOException err) {
            System.out.println("file not found " + err );
        }
    }

    public static void findFile(String name)  throws IOException {
        File newFile = new File(name);
        FileInputStream stream =  new FileInputStream(newFile);

    }
}



