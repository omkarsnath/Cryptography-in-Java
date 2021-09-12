/*
 * ICSE Std. 10 Computer Science Project (Java)
 * 
 * Title: Implementation Of Cryptography In Java
 * 
 * Number of Lines of Code: 10,160
 * 
 * 
 * 
 * Summary:
 * 
 * This Program Is A Menu Driven Program Demonstrating
 * The Implementation of Various Ciphers In Java. This
 * Program Also Includes Code For Validating The Input
 * Format Received From The User.
 * 
 * The Following Ciphers Have Been Implemented In Java
 * 
 * 1. Rotation Cipher
 * 2. Atbash Cipher
 * 3. Caesar Positive Shift Cipher
 * 4. Caesar Negative Shift Cipher
 * 5. One Time Pad Cipher
 * 6. Monoalphabetic Substitution Cipher
 * 7. Polyalphabetic Substitution Cipher
 * 8. Autokey Cipher
 * 9. Running Key Cipher
 * 10. Polybius Square Cipher
 * 11. Bifid Cipher
 * 12. Trifid Cipher
 * 13. Bitwise Rotation Cipher
 * 14. Bitwise Atbash Cipher
 * 15. Bitwise Binary Compliment Cipher
 * 16. Bitwise Left Shift Cipher
 * 17. Bitwise Right Shift Cipher
 * 18. Bitwise Exclusive Or Cipher
 * 19. Bitwise One Time Pad Cipher
 * 20. Square Transposition Cipher
 * 21. Columnar Transposition Cipher
 * 22. Double Transposition Cipher
 * 23. Myszkowski Transposition Cipher
 * 24. Chinese Transposition Cipher
 * 25. Rail Fence Cipher
 * 
 * 
 * 
 * Author Details:
 * 
 * Name: Omkar S. Nath
 * Class: 10-D
 * Roll Number: 35
 * Computer Code: 230438
 * 
 * School: The Bishop's School, Camp, Pune
 */

import java.io.*;

class Cryptography
{
    public static int indent=1;
    
    public static void main()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int f1;
        int f2;
        int f3;
        int ch1;
        int ch2;
        int ch3;
        int temp;
        
        ch1=0;
        f1=0;
        do
        {
            temp=0;
            while(temp==0)
            {
                System.out.println();
                System.out.println("HOME: IMPLEMENTATION OF CRYPTOGRAPHY IN JAVA");
                System.out.println("1. About");
                System.out.println("2. Ciphers");
                System.out.println("3. Author");
                System.out.println("4. Exit");
                System.out.print("Enter Choice: ");
                
                try
                {
                    ch1=Integer.parseInt(bfrd.readLine());
                    temp=1;
                }
                catch(NumberFormatException E1nfe)
                {
                    System.out.println("Choice Should Be A Number");
                    temp=0;
                }
            }
            
            switch(ch1)
            {
                case 1:
                    f1=0;
                    if(indent==1)System.out.print("\t");
                    System.out.println();
                    if(indent==1)System.out.print("\t");
                    System.out.println("HOME.1. ABOUT: IMPLEMENTATION OF CRYPTOGRAPHY IN JAVA");
                    if(indent==1)System.out.print("\t");
                    System.out.println("");
                    if(indent==1)System.out.print("\t");
                    System.out.println("Cryptography is the practice and study of techniques");
                    if(indent==1)System.out.print("\t");
                    System.out.println("for secure communication in the presence of third");
                    if(indent==1)System.out.print("\t");
                    System.out.println("parties (called adversaries). This program demonstrates");
                    if(indent==1)System.out.print("\t");
                    System.out.println("various ciphers in java. It accepts the Plain Text and");
                    if(indent==1)System.out.print("\t");
                    System.out.println("Key (wherever applicable) from the user and generates");
                    if(indent==1)System.out.print("\t");
                    System.out.println("the Cipher Text using various Encryption algorithms. The ");
                    if(indent==1)System.out.print("\t");
                    System.out.println("Plain Text is then obtained from the Cipher Text using");
                    if(indent==1)System.out.print("\t");
                    System.out.println("the same Key by applying the respective Decryption");
                    if(indent==1)System.out.print("\t");
                    System.out.println("algorithm.");
                    break;
                    
                case 2:
                    f1=0;
                    
                    ch2=0;
                    f2=0;
                    do
                    {
                        temp=0;
                        while(temp==0)
                        {
                            if(indent==1)System.out.print("\t");
                            System.out.println();
                            if(indent==1)System.out.print("\t");
                            System.out.println("HOME.2. CIPHERS");
                            if(indent==1)System.out.print("\t");
                            System.out.println("1. Rotation Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("2. Atbash Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("3. Caesar Positive Shift Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("4. Caesar Negative Shift Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("5. One Time Pad Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("6. Monoalphabetic Substitution Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("7. Polyalphabetic Substitution Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("8. Autokey Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("9. Running Key Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("10. Polybius Square Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("11. Bifid Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("12. Trifid Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("13. Bitwise Rotation Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("14. Bitwise Atbash Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("15. Bitwise Binary Compliment Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("16. Bitwise Left Shift Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("17. Bitwise Right Shift Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("18. Bitwise Exclusive Or Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("19. Bitwise One Time Pad Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("20. Square Transposition Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("21. Columnar Transposition Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("22. Double Transposition Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("23. Myszkowski Transposition Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("24. Chinese Transposition Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("25. Rail Fence Cipher");
                            if(indent==1)System.out.print("\t");
                            System.out.println("26. Back To HOME");
                            if(indent==1)System.out.print("\t");
                            System.out.print("Enter Choice: ");
                            
                            try
                            {
                                ch2=Integer.parseInt(bfrd.readLine());
                                temp=1;
                            }
                            catch(NumberFormatException E1nfe)
                            {
                                if(indent==1)System.out.print("\t");
                                System.out.println("Choice Should Be A Number");
                                temp=0;
                            }
                        }
                        
                        switch(ch2)
                        {
                            case 1:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.1. ROTATION CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.1.1. ABOUT: ROTATION CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Rotation Cipher is implemented as ROT48");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("('rotate by 48 places'). It is a simple");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("character substitution cipher that replaces");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("a character with the character 48 places");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("after it in the ASCII table.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.1.2. ENCRYPTION: ROTATION CIPHER");
                                            Rotation_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.1.3. DECRYPTION: ROTATION CIPHER");
                                            Rotation_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 2:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.2. ATBASH CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.2.1. ABOUT: ATBASH CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Atbash is a simple substitution cipher");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("for the Hebrew alphabet. It consists");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("of substituting aleph (the first letter)");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("for tav (the last), beth (the second)");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("for shin (one before last), and so on,");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("reversing the alphabet. The same");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("algorithm is applied to the ASCII");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("character.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.2.2. ENCRYPTION: ATBASH CIPHER");
                                            Atbash_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.2.3. DECRYPTION: ATBASH CIPHER");
                                            Atbash_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 3:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.3. CAESAR POSITIVE SHIFT CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.3.1. ABOUT: CAESAR POSITIVE SHIFT CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Caesar Positive Shift Cipher is implemented");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("as a rotation cipher. It is a simple character");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("substitution cipher that replaces a character");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("with the character ‘Key’ number of places after");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("it in the ASCII table. The value of ‘Key’ is taken");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("as input from the user.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.3.2. ENCRYPTION: CAESAR POSITIVE SHIFT CIPHER");
                                            CaesarPositiveShift_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.3.3. DECRYPTION: CAESAR POSITIVE SHIFT CIPHER");
                                            CaesarPositiveShift_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 4:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.4. CAESAR NEGATIVE SHIFT CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.4.1. ABOUT: CAESAR NEGATIVE SHIFT CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Caesar Negative Shift Cipher is implemented");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("as a rotation cipher. It is a simple character");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("substitution cipher that replaces a character");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("with the character ‘Key’ number of places before");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("it in the ASCII table. The value of ‘Key’ is taken");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("as input from the user.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.4.2. ENCRYPTION: CAESAR NEGATIVE SHIFT CIPHER");
                                            CaesarNegativeShift_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.4.3. DECRYPTION: CAESAR NEGATIVE SHIFT CIPHER");
                                            CaesarNegativeShift_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 5:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.5. ONE TIME PAD CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.5.1. ABOUT: ONE TIME PAD CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The One Time Pad Cipher is implemented");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("as a rotation cipher. It is a simple");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("character substitution cipher that");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("replaces a character of the Plain");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Text by the number of places");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("represented by the corresponding");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("character in the ‘Keyword’. For this");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("the length of the ‘Keyword’ should be");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("at least as long as the Plain Text.");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("This is considered to be an unbreakable");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Cipher.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.5.2. ENCRYPTION: ONE TIME PAD CIPHER");
                                            OneTimePad_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.5.3. DECRYPTION: ONE TIME PAD CIPHER");
                                            OneTimePad_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 6:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.6. MONOALPHABETIC SUBSTITUTION CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.6.1. ABOUT: MONOALPHABETIC SUBSTITUTION CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Monoalphabetic Substitution Cipher is implemented");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("as a substitution cipher where each character is");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("replaced by another character based on the ‘Key’. The");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("‘Key’ is prepared from the ‘Keyword’.");
                                            System.out.println("");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.6.2. ENCRYPTION: MONOALPHABETIC SUBSTITUTION CIPHER");
                                            MonoalphabeticSubstitution_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.6.3. DECRYPTION: MONOALPHABETIC SUBSTITUTION CIPHER");
                                            MonoalphabeticSubstitution_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 7:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.7. POLYALPHABETIC SUBSTITUTION CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.7.1. ABOUT: POLYALPHABETIC SUBSTITUTION CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Polyalphabetic Substitution Cipher is implemented");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("as a substitution cipher where each character is");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("replaced by another character which is obtained by");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("shifting the Plain Text character by the");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("corresponding Keyword character.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.7.2. ENCRYPTION: POLYALPHABETIC SUBSTITUTION CIPHER");
                                            PolyalphabeticSubstitution_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.7.3. DECRYPTION: POLYALPHABETIC SUBSTITUTION CIPHER");
                                            PolyalphabeticSubstitution_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 8:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.8. AUTOKEY CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.8.1. ABOUT: AUTOKEY CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Autokey Substitution Cipher is");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("implemented as a substitution cipher");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("where each character is replaced by");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("another character which is obtained");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("by shifting the Plain Text character");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("by the corresponding ‘Key’ character.");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The ‘Key’ is obtained from the ‘Keyword’");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("by appending the Plain Text to the end");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("of the Keyword.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.8.2. ENCRYPTION: AUTOKEY CIPHER");
                                            Autokey_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.8.3. DECRYPTION: AUTOKEY CIPHER");
                                            Autokey_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 9:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.9. RUNNING KEY CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.9.1. ABOUT: RUNNING KEY CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Running Key Cipher is implemented");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("as a substitution cipher where each");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("character is replaced by another");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("character which is obtained by shifting");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("the Plain Text character by the");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("corresponding Keyword character. For");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("this the length of the ‘Keyword’ should");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("be at least as long as the Plain Text.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.9.2. ENCRYPTION: RUNNING KEY CIPHER");
                                            RunningKey_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.9.3. DECRYPTION: RUNNING KEY CIPHER");
                                            RunningKey_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 10:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.10. POLYBIUS SQUARE CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.10.1. ABOUT: POLYBIUS SQUARE CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Polybius Square Cipher makes use of the");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Polybius square. The square has 10 rows and");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("10 columns each numbered from 0 through 9.");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Each element in the square is a character.");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("It is used to substitute the characters for");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("numbers corresponding to their location in");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("the square in the format ‘row number’, ‘column");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("number’. The Cipher Text generated by the");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("program is a sequence of 3 digit ASCII values");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("of the Cipher Text characters.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.10.2. ENCRYPTION: POLYBIUS SQUARE CIPHER");
                                            PolybiusSquare_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.10.3. DECRYPTION: POLYBIUS SQUARE CIPHER");
                                            PolybiusSquare_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 11:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.11. BIFID CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.11.1. ABOUT: BIFID CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Bifid Cipher makes use of the");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Polybius square. The square has 10");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("rows and 10 columns each numbered");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("from 0 through 9. Each element in");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("the square is a character. It is");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("used to substitute the characters");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("for numbers corresponding to their");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("location in the square while writing");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("all the row numbers first followed by");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("all the column numbers. The Cipher");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Text generated by the program is a");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("sequence of 3 digit ASCII values of");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("the Cipher Text characters.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.11.2. ENCRYPTION: BIFID CIPHER");
                                            Bifid_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.11.3. DECRYPTION: BIFID CIPHER");
                                            Bifid_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 12:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.12. TRIFID CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.12.1. ABOUT: TRIFID CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Trifid Cipher uses a cuboid of");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("size 3 X 6 X 6. It can be viewed");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("as 3 squares (numbered from 0");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("through 2) with 6 rows (numbered from");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("0 through 5) and 6 columns (numbered");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("from 0 through 5). Each element in");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("the cuboid is a character. It is used");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("to substitute the characters for");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("numbers corresponding to their location");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("in the cuboid by writing all the square");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("numbers first, all the row numbers second");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("followed by all the column numbers third.");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Cipher Text generated by the program");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("is a sequence of 3 digit ASCII values of");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("the Cipher Text characters.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.12.2. ENCRYPTION: TRIFID CIPHER");
                                            Trifid_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.12.3. DECRYPTION: TRIFID CIPHER");
                                            Trifid_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 13:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.13. BITWISE ROTATION CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.13.1. ABOUT: BITWISE ROTATION CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("In the Bitwise Rotation Cipher the rotation");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("cipher is applied at the bit level. All the");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("ASCII characters can be represented by 8 bits");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("(1 byte). This gives us 2^8 = 256 possible");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("characters. The Cipher Text generated by the");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("program is a sequence of 3 digit ASCII values");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("of the Cipher Text characters.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.13.2. ENCRYPTION: BITWISE ROTATION CIPHER");
                                            BitwiseRotation_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.13.3. DECRYPTION: BITWISE ROTATION CIPHER");
                                            BitwiseRotation_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 14:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.14. BITWISE ATBASH CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.14.1. ABOUT: BITWISE ATBASH CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("In the Bitwise Atbash Cipher the atbash");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("cipher is applied at the bit level. All");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("the ASCII characters can be represented");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("by 8 bits (1 byte). This gives us 2^8 =");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("256 possible characters. The Cipher Text");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("generated by the program is a sequence of");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("3 digit ASCII values of the Cipher Text");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("characters.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.14.2. ENCRYPTION: BITWISE ATBASH CIPHER");
                                            BitwiseAtbash_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.14.3. DECRYPTION: BITWISE ATBASH CIPHER");
                                            BitwiseAtbash_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 15:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.15. BITWISE BINARY COMPLIMENT CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.15.1. ABOUT: BITWISE BINARY COMPLIMENT CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("In the Bitwise Binary Compliment Cipher each bit is");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("complimented, i.e., 1 becomes 0 and 0 becomes 1. All");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("the ASCII characters can be represented by 8 bits (1");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("byte). This gives us 2^8 = 256 possible characters. The");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Cipher Text generated by the program is a sequence of 3");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("digit ASCII values of the Cipher Text characters.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.15.2. ENCRYPTION: BITWISE BINARY COMPLIMENT CIPHER");
                                            BitwiseBinaryCompliment_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.15.3. DECRYPTION: BITWISE BINARY COMPLIMENT CIPHER");
                                            BitwiseBinaryCompliment_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 16:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.16. BITWISE LEFT SHIFT CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.16.1. ABOUT: BITWISE LEFT SHIFT CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("In the Bitwise Left Shift Cipher each bit is");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("shifted to the left by the number in the Keyword");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("(0-7). All the ASCII characters can be represented");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("by 8 bits (1 byte). This gives us 2^8 = 256 possible");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("characters. The Cipher Text generated by the program");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("is a sequence of 3 digit ASCII values of the Cipher");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Text characters.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.16.2. ENCRYPTION: BITWISE LEFT SHIFT CIPHER");
                                            BitwiseLeftShift_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.16.3. DECRYPTION: BITWISE LEFT SHIFT CIPHER");
                                            BitwiseLeftShift_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 17:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.17. BITWISE RIGHT SHIFT CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.17.1. ABOUT: BITWISE RIGHT SHIFT CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("In the Bitwise Right Shift Cipher each bit is");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("shifted to the right by the number in the Keyword");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("(0-7). All the ASCII characters can be represented");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("by 8 bits (1 byte). This gives us 2^8 = 256 possible");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("characters. The Cipher Text generated by the program");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("is a sequence of 3 digit ASCII values of the Cipher");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Text characters.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.17.2. ENCRYPTION: BITWISE RIGHT SHIFT CIPHER");
                                            BitwiseRightShift_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.17.3. DECRYPTION: BITWISE RIGHT SHIFT CIPHER");
                                            BitwiseRightShift_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 18:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.18. BITWISE EXCLUSIVE OR CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.18.1. ABOUT: BITWISE EXCLUSIVE OR CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("In the Bitwise Exclusive Or Cipher the logical");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("XOR (Exclusive Or) operator is used. The");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("corresponding bits of the Keyword and the Plain");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Text on applying the XOR operation give the Cipher");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Text. All the ASCII characters can be represented");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("by 8 bits (1 byte). This gives us 2^8 = 256 possible");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("characters. The Cipher Text generated by the program");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("is a sequence of 3 digit ASCII values of the Cipher");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Text characters.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.18.2. ENCRYPTION: BITWISE EXCLUSIVE OR CIPHER");
                                            BitwiseExclusiveOr_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.18.3. DECRYPTION: BITWISE EXCLUSIVE OR CIPHER");
                                            BitwiseExclusiveOr_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 19:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.19. BITWISE ONE TIME PAD CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.19.1. ABOUT: BITWISE ONE TIME PAD CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("In the Bitwise One Time Pad Cipher the logical");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("XOR (Exclusive Or) operator is used. The");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("corresponding bits of the Keyword and the Plain");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Text on applying the XOR operation give the Cipher");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Text. The Keyword must be at least as long as the");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Plain Text. All the ASCII characters can be");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("represented by 8 bits (1 byte). This gives us 2^8 =");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("256 possible characters. The Cipher Text generated");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("by the program is a sequence of 3 digit ASCII values");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("of the Cipher Text characters.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.19.2. ENCRYPTION: BITWISE ONE TIME PAD CIPHER");
                                            BitwiseOneTimePad_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.19.3. DECRYPTION: BITWISE ONE TIME PAD CIPHER");
                                            BitwiseOneTimePad_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 20:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.20. SQUARE TRANSPOSITION CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.20.1. ABOUT: SQUARE TRANSPOSITION CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Square Transposition cipher arranges the");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Plain Text in a perfect square, i.e., number of");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("rows equal the number of columns, where each");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("element in the square has a character. If there");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("are empty elements they are padded with spaces.");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The cipher is obtained by interchanging the rows");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("with the columns.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.20.2. ENCRYPTION: SQUARE TRANSPOSITION CIPHER");
                                            SquareTransposition_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.20.3. DECRYPTION: SQUARE TRANSPOSITION CIPHER");
                                            SquareTransposition_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 21:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.21. COLUMNAR TRANSPOSITION CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.21.1. ABOUT: COLUMNAR TRANSPOSITION CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("In a columnar transposition, the message is written");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("out in rows of a fixed length, and then read out");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("again column by column, and the columns are chosen");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("in some scrambled order. Both the width of the rows");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("and the permutation of the columns are based on the");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Keyword.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.21.2. ENCRYPTION: COLUMNAR TRANSPOSITION CIPHER");
                                            ColumnarTransposition_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.21.3. DECRYPTION: COLUMNAR TRANSPOSITION CIPHER");
                                            ColumnarTransposition_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 22:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.22. DOUBLE TRANSPOSITION CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.22.1. ABOUT: DOUBLE TRANSPOSITION CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Double Transposition Cipher is simply the");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Columnar Transposition Cipher applied twice.");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The same Keyword can be used for both");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("transpositions or two different Keywords can");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("be used.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.22.2. ENCRYPTION: DOUBLE TRANSPOSITION CIPHER");
                                            DoubleTransposition_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.22.3. DECRYPTION: DOUBLE TRANSPOSITION CIPHER");
                                            DoubleTransposition_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 23:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.23. MYSZKOWSKI TRANSPOSITION CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.23.1. ABOUT: MYSZKOWSKI TRANSPOSITION CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Myszkowski Transposition is a variant form of");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Columnar Transposition, proposed by Émile Victor");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Théodore Myszkowski in 1902. It requires a keyword");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("with recurrent letters. In Columnar Transposition");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("subsequent occurrences of a keyword letter are");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("treated as if the next letter in alphabetical");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("order, e.g., the keyword TOMATO yields a numeric");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("keystring of ‘532164’. In Myszkowski Transposition,");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("recurrent keyword letters are numbered identically,");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("thus TOMATO yielding a keystring of '432143.'");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.23.2. ENCRYPTION: MYSZKOWSKI TRANSPOSITION CIPHER");
                                            MyszkowskiTransposition_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.23.3. DECRYPTION: MYSZKOWSKI TRANSPOSITION CIPHER");
                                            MyszkowskiTransposition_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 24:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.24. CHINESE TRANSPOSITION CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.24.1. ABOUT: CHINESE TRANSPOSITION CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("In the Chinese Transposition Cipher, the letters");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("of the message are written from right to left,");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("down and up columns to scramble the letters.");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Then, starting in the first row, the letters");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("are taken in order to get the new Cipher Text.");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Keyword determined the number of rows. All");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("remaining blanks are filled with spaces.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.24.2. ENCRYPTION: CHINESE TRANSPOSITION CIPHER");
                                            ChineseTransposition_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.24.3. DECRYPTION: CHINESE TRANSPOSITION CIPHER");
                                            ChineseTransposition_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 25:
                                f2=0;
                                
                                ch3=0;
                                f3=0;
                                do
                                {
                                    temp=0;
                                    while(temp==0)
                                    {
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println();
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("HOME.2.25. RAIL FENCE CIPHER");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("1. About");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("2. Encrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("3. Decrypt");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.println("4. Back To CIPHERS");
                                        if(indent==1)System.out.print("\t\t");
                                        System.out.print("Enter Choice: ");
                                        
                                        try
                                        {
                                            ch3=Integer.parseInt(bfrd.readLine());
                                            temp=1;
                                        }
                                        catch(NumberFormatException E1nfe)
                                        {
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Choice Should Be A Number");
                                            temp=0;
                                        }
                                    }
                                    
                                    switch(ch3)
                                    {
                                        case 1:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.25.1. ABOUT: RAIL FENCE CIPHER");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The Rail Fence Cipher is a form of");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("transposition cipher that gets its");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("name from the way in which it is");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("encoded. In the rail fence cipher, the");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("Plain Text is written downwards on");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("successive ‘rails’ of an imaginary fence,");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("then moving up when we get to the");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("bottom. Blanks are filled with spaces.");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("The message is then read off in rows");
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("from left to right.");
                                            break;
                                            
                                        case 2:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.25.2. ENCRYPTION: RAIL FENCE CIPHER");
                                            RailFence_enc();
                                            break;
                                            
                                        case 3:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println();
                                            if(indent==1)System.out.print("\t\t\t");
                                            System.out.println("HOME.2.25.3. DECRYPTION: RAIL FENCE CIPHER");
                                            RailFence_dec();
                                            break;
                                            
                                        case 4:
                                            f3=1;
                                            break;
                                            
                                        default:
                                            f3=0;
                                            if(indent==1)System.out.print("\t\t");
                                            System.out.println("Invalid Choice");
                                    }
                                }while(f3==0);
                                        
                                break;
                                
                            case 26:
                                f2=1;
                                break;
                                
                            default:
                                f2=0;
                                if(indent==1)System.out.print("\t");
                                System.out.println("Invalid Choice");
                        }
                    }while(f2==0);
                    
                    break;
                    
                case 3:
                    f1=0;
                    if(indent==1)System.out.print("\t");
                    System.out.println();
                    if(indent==1)System.out.print("\t");
                    System.out.println("HOME.3. AUTHOR");
                    if(indent==1)System.out.print("\t");
                    System.out.println("Name: Omkar S. Nath");
                    if(indent==1)System.out.print("\t");
                    System.out.println("Class: 10–D");
                    if(indent==1)System.out.print("\t");
                    System.out.println("Roll Number: 35");
                    if(indent==1)System.out.print("\t");
                    System.out.println("Computer Code: 230438");
                    break;
                    
                case 4:
                    f1=1;
                    if(indent==1)System.out.print("\t");
                    System.out.println();
                    if(indent==1)System.out.print("\t");
                    System.out.println("Thank You For Using This Program.");
                    if(indent==1)System.out.print("\t");
                    System.out.println("- Omkar S. Nath");
                    break;
                    
                default:
                    f1=0;
                    System.out.println("Invalid Choice");
            }
        }while(f1==0);
    }
    
    public static void Rotation_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ptl;
        int key;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        String pt;
        
        key=48;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<ptl;i++)
        {
            cti[i]=pti[i]-32;
            cti[i]=cti[i]+key;
            cti[i]=cti[i]%95;
            cti[i]=cti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void Rotation_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ctl;
        int key;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        String ct;
        
        key=48;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        for(i=0;i<ctl;i++)
        {
            pti[i]=cti[i]-32;
            pti[i]=pti[i]-key%95;
            if(pti[i]<0)
            {
                pti[i]=pti[i]+95;
            }
            pti[i]=pti[i]%95;
            pti[i]=pti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void Atbash_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ptl;
        int numofchar;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        String pt;
        
        numofchar=94;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<ptl;i++)
        {
            cti[i]=pti[i]-32;
            cti[i]=numofchar-cti[i];
            cti[i]=cti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void Atbash_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ctl;
        int numofchar;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        String ct;
        
        numofchar=94;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        for(i=0;i<ctl;i++)
        {
            pti[i]=cti[i]-32;
            pti[i]=numofchar-pti[i];
            pti[i]=pti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void CaesarPositiveShift_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ptl;
        int key;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        String pt;
        
        key=0;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        do
        {
            temp=0;
            while(temp==0)
            {
                if(indent==1)System.out.print("\t\t\t");
                System.out.println();
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Enter the Key (A Number Between 0 and 10000):");
                if(indent==1)System.out.print("\t\t\t");
                try
                {
                    key=Integer.parseInt(bfrd.readLine());
                    temp=1;
                }
                catch(NumberFormatException E1nfe)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Key Should Be A Number");
                    temp=0;
                }
            }
            
            if(key<1||key>9999)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<ptl;i++)
        {
            cti[i]=pti[i]-32;
            cti[i]=cti[i]+key;
            cti[i]=cti[i]%95;
            cti[i]=cti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void CaesarPositiveShift_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ctl;
        int key;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        String ct;
        
        key=0;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        do
        {
            temp=0;
            while(temp==0)
            {
                if(indent==1)System.out.print("\t\t\t");
                System.out.println();
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Enter the Key (A Number Between 0 and 10000):");
                if(indent==1)System.out.print("\t\t\t");
                try
                {
                    key=Integer.parseInt(bfrd.readLine());
                    temp=1;
                }
                catch(NumberFormatException E1nfe)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Key Should Be A Number");
                    temp=0;
                }
            }
            
            if(key<1||key>9999)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        for(i=0;i<ctl;i++)
        {
            pti[i]=cti[i]-32;
            pti[i]=pti[i]-key%95;
            if(pti[i]<0)
            {
                pti[i]=pti[i]+95;
            }
            pti[i]=pti[i]%95;
            pti[i]=pti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void CaesarNegativeShift_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ptl;
        int key;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        String pt;
        
        key=0;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        do
        {
            temp=0;
            while(temp==0)
            {
                if(indent==1)System.out.print("\t\t\t");
                System.out.println();
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Enter the Key (A Number Between 0 and 10000):");
                if(indent==1)System.out.print("\t\t\t");
                try
                {
                    key=Integer.parseInt(bfrd.readLine());
                    temp=1;
                }
                catch(NumberFormatException E1nfe)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Key Should Be A Number");
                    temp=0;
                }
            }
            
            if(key<1||key>9999)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<ptl;i++)
        {
            cti[i]=pti[i]-32;
            cti[i]=cti[i]-key%95;
            if(cti[i]<0)
            {
                cti[i]=cti[i]+95;
            }
            cti[i]=cti[i]%95;
            cti[i]=cti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void CaesarNegativeShift_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ctl;
        int key;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        String ct;
        
        key=0;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        temp=0;
        do
        {
            temp=0;
            while(temp==0)
            {
                if(indent==1)System.out.print("\t\t\t");
                System.out.println();
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Enter the Key (A Number Between 0 and 10000):");
                if(indent==1)System.out.print("\t\t\t");
                try
                {
                    key=Integer.parseInt(bfrd.readLine());
                    temp=1;
                }
                catch(NumberFormatException E1nfe)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Key Should Be A Number");
                    temp=0;
                }
            }
            
            if(key<1||key>9999)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        for(i=0;i<ctl;i++)
        {
            pti[i]=cti[i]-32;
            pti[i]=pti[i]+key;
            pti[i]=pti[i]%95;
            pti[i]=pti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void OneTimePad_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ptl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String pt;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Atleast As Long As Plain Text):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<ptl)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyi[i]=keyi[i]-32;
        }
        
        for(i=0;i<ptl;i++)
        {
            cti[i]=pti[i]-32;
            cti[i]=cti[i]+keyi[i];
            cti[i]=cti[i]%95;
            cti[i]=cti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void OneTimePad_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ctl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String ct;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Atleast As Long As Plain Text):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<ctl)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyi[i]=keyi[i]-32;
        }
        
        for(i=0;i<ctl;i++)
        {
            pti[i]=cti[i]-32;
            pti[i]=pti[i]-keyi[i]%95;
            if(pti[i]<0)
            {
                pti[i]=pti[i]+95;
            }
            pti[i]=pti[i]%95;
            pti[i]=pti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void MonoalphabeticSubstitution_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int ptl;
        int keyl1;
        int keyl2;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi1[];
        keyi1 = new int[10000];
        
        int keyi2[];
        keyi2 = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String pt;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Greater Than 1):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl1=key.length();
            if(keyl1<2)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
            pti[i]=pti[i]-32;
        }
        
        for(i=0;i<keyl1;i++)
        {
            keyc[i]=key.charAt(i);
            keyi1[i]=keyc[i];
        }
        
        keyl2=0;
        for(i=0;i<keyl1;i++)
        {
            temp=0;
            for(j=0;j<keyl2;j++)
            {
                if(keyi1[i]==keyi2[j])
                {
                    temp=1;
                }
            }
            if(temp==0)
            {
                keyi2[keyl2]=keyi1[i];
                keyl2=keyl2+1;
            }
        }
        
        for(i=32;i<=126;i++)
        {
            temp=0;
            for(j=0;j<keyl2;j++)
            {
                if(keyi2[j]==i)
                {
                    temp=1;
                }
            }
            if(temp==0)
            {
                keyi2[keyl2]=i;
                keyl2=keyl2+1;
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            cti[i]=keyi2[pti[i]];
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void MonoalphabeticSubstitution_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int ctl;
        int keyl1;
        int keyl2;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi1[];
        keyi1 = new int[10000];
        
        int keyi2[];
        keyi2 = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String ct;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Greater Than 1):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl1=key.length();
            if(keyl1<2)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        for(i=0;i<keyl1;i++)
        {
            keyc[i]=key.charAt(i);
            keyi1[i]=keyc[i];
        }
        
        keyl2=0;
        for(i=0;i<keyl1;i++)
        {
            temp=0;
            for(j=0;j<keyl2;j++)
            {
                if(keyi1[i]==keyi2[j])
                {
                    temp=1;
                }
            }
            if(temp==0)
            {
                keyi2[keyl2]=keyi1[i];
                keyl2=keyl2+1;
            }
        }
        
        for(i=32;i<=126;i++)
        {
            temp=0;
            for(j=0;j<keyl2;j++)
            {
                if(keyi2[j]==i)
                {
                    temp=1;
                }
            }
            if(temp==0)
            {
                keyi2[keyl2]=i;
                keyl2=keyl2+1;
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            for(j=0;j<keyl2;j++)
            {
                if(keyi2[j]==cti[i])
                {
                    pti[i]=j;
                    pti[i]=pti[i]+32;
                }
            }
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void PolyalphabeticSubstitution_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ptl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String pt;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Greater Than 1):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<2)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyi[i]=keyi[i]-32;
        }
        
        for(i=0;i<ptl;i++)
        {
            keyi[i]=keyi[i%keyl];
        }
        
        for(i=0;i<ptl;i++)
        {
            cti[i]=pti[i]-32;
            cti[i]=cti[i]+keyi[i];
            cti[i]=cti[i]%95;
            cti[i]=cti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void PolyalphabeticSubstitution_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ctl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String ct;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Greater Than 1):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<2)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyi[i]=keyi[i]-32;
        }
        
        for(i=0;i<ctl;i++)
        {
            keyi[i]=keyi[i%keyl];
        }
        
        for(i=0;i<ctl;i++)
        {
            pti[i]=cti[i]-32;
            pti[i]=pti[i]-keyi[i]%95;
            if(pti[i]<0)
            {
                pti[i]=pti[i]+95;
            }
            pti[i]=pti[i]%95;
            pti[i]=pti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void Autokey_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ptl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String pt;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Greater Than 1):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<2)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyi[i]=keyi[i]-32;
        }
        
        for(i=0;i<ptl;i++)
        {
            keyi[keyl+i]=pti[i]-32;
        }
        
        for(i=0;i<ptl;i++)
        {
            cti[i]=pti[i]-32;
            cti[i]=cti[i]+keyi[i];
            cti[i]=cti[i]%95;
            cti[i]=cti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void Autokey_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ctl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String ct;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Greater Than 1):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<2)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyi[i]=keyi[i]-32;
        }
        
        for(i=0;i<ctl;i++)
        {
            pti[i]=cti[i]-32;
            pti[i]=pti[i]-keyi[i]%95;
            if(pti[i]<0)
            {
                pti[i]=pti[i]+95;
            }
            pti[i]=pti[i]%95;
            keyi[i+keyl]=pti[i];
            pti[i]=pti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void RunningKey_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ptl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String pt;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Atleast As Long As Plain Text):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<ptl)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyi[i]=keyi[i]-32;
        }
        
        for(i=0;i<ptl;i++)
        {
            cti[i]=pti[i]-32;
            cti[i]=cti[i]+keyi[i];
            cti[i]=cti[i]%95;
            cti[i]=cti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void RunningKey_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int ctl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String ct;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Atleast As Long As Plain Text):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<ctl)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyi[i]=keyi[i]-32;
        }
        
        for(i=0;i<ctl;i++)
        {
            pti[i]=cti[i]-32;
            pti[i]=pti[i]-keyi[i]%95;
            if(pti[i]<0)
            {
                pti[i]=pti[i]+95;
            }
            pti[i]=pti[i]%95;
            pti[i]=pti[i]+32;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void PolybiusSquare_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int ptl;
        int ctl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int polybiussquare[][];
        polybiussquare = new int[10][10];
        
        char ptc[];
        ptc = new char[10000];
        
        String pt;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        k=0;
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(k<95)
                {
                    polybiussquare[i][j]=k+32;
                    k=k+1;
                }
                else
                {
                    polybiussquare[i][j]=-1;
                }
            }
        }
        
        ctl=0;
        for(k=0;k<ptl;k++)
        {
            temp=0;
            for(i=0;i<10;i++)
            {
                for(j=0;j<10;j++)
                {
                    if(temp==0)
                    {
                        if(pti[k]==polybiussquare[i][j])
                        {
                            temp=1;
                            cti[ctl]=i;
                            ctl=ctl+1;
                            cti[ctl]=j;
                            ctl=ctl+1;;
                        }
                    }
                }
            }
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            System.out.print(cti[i]);
        }
        System.out.println("'");
    }
    
    public static void PolybiusSquare_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int ptl;
        int ctl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int polybiussquare[][];
        polybiussquare = new int[10][10];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        String ct;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A Sequence Of Numbers Of Length Greater Than 4 And Of Length A Multiple Of 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            
            if(ctl<5||(ctl%2)!=0)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            
            else
            {
                temp=0;
                for(i=0;i<ctl;i++)
                {
                    ctc[i]=ct.charAt(i);
                    cti[i]=ctc[i];
                }
                
                for(i=0;i<ctl;i++)
                {
                    if(cti[i]<48||cti[i]>57)
                    {
                        temp=1;
                    }
                }
                
                if(temp==1)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Invalid Cipher Text");
                }
            }
        }while(temp==1);
                
        k=0;
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(k<95)
                {
                    polybiussquare[i][j]=k+32;
                    k=k+1;
                }
                else
                {
                    polybiussquare[i][j]=-1;
                }
            }
        }
        
        ptl=ctl/2;
        for(k=0;k<ptl;k++)
        {
            temp=k*2;
            i=cti[temp]-48;
            j=cti[temp+1]-48;
            pti[k]=polybiussquare[i][j];
        }       
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void Bifid_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int ptl;
        int ctl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int polybiussquare[][];
        polybiussquare = new int[10][10];
        
        char ptc[];
        ptc = new char[10000];
        
        String pt;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        k=0;
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(k<95)
                {
                    polybiussquare[i][j]=k+32;
                    k=k+1;
                }
                else
                {
                    polybiussquare[i][j]=-1;
                }
            }
        }
        
        ctl=0;
        for(k=0;k<ptl;k++)
        {
            temp=0;
            for(i=0;i<10;i++)
            {
                for(j=0;j<10;j++)
                {
                    if(temp==0)
                    {
                        if(pti[k]==polybiussquare[i][j])
                        {
                            temp=1;
                            cti[ctl]=i;
                            cti[ctl+ptl]=j;
                            ctl=ctl+1;
                        }
                    }
                }
            }
        }
        ctl=ptl*2;
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            System.out.print(cti[i]);
        }
        System.out.println("'");
    }
    
    public static void Bifid_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int ptl;
        int ctl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int polybiussquare[][];
        polybiussquare = new int[10][10];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        String ct;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A Sequence Of Numbers Of Length Greater Than 4 And Of Length A Multiple Of 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            
            if(ctl<5||(ctl%2)!=0)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            
            else
            {
                temp=0;
                for(i=0;i<ctl;i++)
                {
                    ctc[i]=ct.charAt(i);
                    cti[i]=ctc[i];
                }
                
                for(i=0;i<ctl;i++)
                {
                    if(cti[i]<48||cti[i]>57)
                    {
                        temp=1;
                    }
                }
                
                if(temp==1)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Invalid Cipher Text");
                }
            }
        }while(temp==1);
                
        k=0;
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(k<95)
                {
                    polybiussquare[i][j]=k+32;
                    k=k+1;
                }
                else
                {
                    polybiussquare[i][j]=-1;
                }
            }
        }
        
        ptl=ctl/2;
        for(k=0;k<ptl;k++)
        {
            i=cti[k]-48;
            j=cti[k+ptl]-48;
            pti[k]=polybiussquare[i][j];
        }       
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void Trifid_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int ptl;
        int ctl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int trifidcube[][][];
        trifidcube = new int[3][6][6];
        
        char ptc[];
        ptc = new char[10000];
        
        String pt;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        l=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<6;j++)
            {
                for(k=0;k<6;k++)
                {
                    if(l<95)
                    {
                        trifidcube[i][j][k]=l+32;
                        l=l+1;
                    }
                    else
                    {
                        trifidcube[i][j][k]=-1;
                    }
                }
            }
        }
        
        for(l=0;l<ptl;l++)
        {
            temp=0;
            for(i=0;i<3;i++)
            {
                for(j=0;j<6;j++)
                {
                    for(k=0;k<6;k++)
                    {
                        if(temp==0);
                        {
                            if(pti[l]==trifidcube[i][j][k])
                            {
                                temp=1;
                                cti[l]=i;
                                cti[l+ptl]=j;
                                cti[l+ptl+ptl]=k;
                            }
                        }
                    }
                }
            }
        }
        
        ctl=ptl*3;
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            System.out.print(cti[i]);
        }
        System.out.println("'");
    }
    
    public static void Trifid_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int ptl;
        int ctl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int trifidcube[][][];
        trifidcube = new int[3][6][6];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        String ct;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A Sequence Of Numbers Of Length Greater Than 6 And Of Length A Multiple Of 3):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            
            if(ctl<7||(ctl%3)!=0)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            
            else
            {
                temp=0;
                for(i=0;i<ctl;i++)
                {
                    ctc[i]=ct.charAt(i);
                    cti[i]=ctc[i];
                }
                
                for(i=0;i<ctl;i++)
                {
                    if(cti[i]<48||cti[i]>57)
                    {
                        temp=1;
                    }
                }
                
                if(temp==1)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Invalid Cipher Text");
                }
            }
        }while(temp==1);
        
        l=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<6;j++)
            {
                for(k=0;k<6;k++)
                {
                    if(l<95)
                    {
                        trifidcube[i][j][k]=l+32;
                        l=l+1;
                    }
                    else
                    {
                        trifidcube[i][j][k]=-1;
                    }
                }
            }
        }
        
        ptl=ctl/3;
        for(l=0;l<ptl;l++)
        {
            i=cti[l]-48;
            j=cti[l+ptl]-48;
            k=cti[l+ptl+ptl]-48;
            pti[l]=trifidcube[i][j][k];
        }       
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void BitwiseRotation_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int pow;
        int ptl;
        int digits;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int ptbinary[][];
        ptbinary = new int[10000][8];
        
        int tempbinary[];
        tempbinary = new int[8];
        
        char ptc[];
        ptc = new char[10000];
        
        String pt;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<ptl;i++)
        {
            temp=pti[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    ptbinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    ptbinary[i][7-j]=0;
                }
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            for(j=0;j<=7;j++)
            {
                tempbinary[j]=ptbinary[i][j];
            }
            ptbinary[i][0]=tempbinary[4];
            ptbinary[i][1]=tempbinary[5];
            ptbinary[i][2]=tempbinary[6];
            ptbinary[i][3]=tempbinary[7];
            ptbinary[i][4]=tempbinary[0];
            ptbinary[i][5]=tempbinary[1];
            ptbinary[i][6]=tempbinary[2];
            ptbinary[i][7]=tempbinary[3];
        }
        
        for(i=0;i<ptl;i++)
        {
            temp=0;
            pow=1;
            for(j=7;j>=0;j--)
            {
                temp=temp+pow*ptbinary[i][j];
                pow=pow*2;
            }
            cti[i]=temp;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            temp=cti[i];
            digits=0;
            do
            {
                digits=digits+1;
                temp=temp/10;
            }while(temp!=0);
            if(digits==0)
            {
                System.out.print("000");
            }
            else if(digits==1)
            {
                System.out.print("00");
            }
            else if(digits==2)
            {
                System.out.print("0");
            }
            else if(digits==3)
            {
                System.out.print("");
            }
            System.out.print(cti[i]);
        }
        System.out.println("'");
    }
    
    public static void BitwiseRotation_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int pow;
        int ctl;
        int ctipl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int ctipi[];
        ctipi = new int[30000];
        
        int ctbinary[][];
        ctbinary = new int[10000][8];
        
        int tempbinary[];
        tempbinary = new int[8];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char ctipc[];
        ctipc = new char[30000];
        
        String ct;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A Sequence Of Numbers Of Length Greater Than 6 And Of Length A Multiple Of 3):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctipl=ct.length();
            
            if(ctipl<7||(ctipl%3)!=0)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            
            else
            {
                temp=0;
                for(i=0;i<ctipl;i++)
                {
                    ctipc[i]=ct.charAt(i);
                    ctipi[i]=ctipc[i];
                }
                
                for(i=0;i<ctipl;i++)
                {
                    if(ctipi[i]<48||ctipi[i]>57)
                    {
                        temp=1;
                    }
                }
                
                if(temp==1)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Invalid Cipher Text");
                }
            }
        }while(temp==1);
        
        ctl=ctipl/3;
        
        for(i=0;i<ctl;i++)
        {
            j=i*3;
            cti[i]=0;
            for(k=0;k<3;k++)
            {
                if(k==0)
                {
                    l=100;
                }
                else if(k==1)
                {
                    l=10;
                }
                else
                {
                    l=1;
                }
                cti[i]=cti[i]+(ctipi[j+k]-48)*l;
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            temp=cti[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    ctbinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    ctbinary[i][7-j]=0;
                }
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            for(j=0;j<=7;j++)
            {
                tempbinary[j]=ctbinary[i][j];
            }
            ctbinary[i][0]=tempbinary[4];
            ctbinary[i][1]=tempbinary[5];
            ctbinary[i][2]=tempbinary[6];
            ctbinary[i][3]=tempbinary[7];
            ctbinary[i][4]=tempbinary[0];
            ctbinary[i][5]=tempbinary[1];
            ctbinary[i][6]=tempbinary[2];
            ctbinary[i][7]=tempbinary[3];
        }
        
        for(i=0;i<ctl;i++)
        {
            temp=0;
            pow=1;
            for(j=7;j>=0;j--)
            {
                temp=temp+pow*ctbinary[i][j];
                pow=pow*2;
            }
            pti[i]=temp;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void BitwiseAtbash_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int pow;
        int ptl;
        int digits;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int ptbinary[][];
        ptbinary = new int[10000][8];
        
        int tempbinary[];
        tempbinary = new int[8];
        
        char ptc[];
        ptc = new char[10000];
        
        String pt;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<ptl;i++)
        {
            temp=pti[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    ptbinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    ptbinary[i][7-j]=0;
                }
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            for(j=0;j<=7;j++)
            {
                tempbinary[j]=ptbinary[i][j];
            }
            ptbinary[i][0]=tempbinary[7];
            ptbinary[i][1]=tempbinary[6];
            ptbinary[i][2]=tempbinary[5];
            ptbinary[i][3]=tempbinary[4];
            ptbinary[i][4]=tempbinary[3];
            ptbinary[i][5]=tempbinary[2];
            ptbinary[i][6]=tempbinary[1];
            ptbinary[i][7]=tempbinary[0];
        }
        
        for(i=0;i<ptl;i++)
        {
            temp=0;
            pow=1;
            for(j=7;j>=0;j--)
            {
                temp=temp+pow*ptbinary[i][j];
                pow=pow*2;
            }
            cti[i]=temp;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            temp=cti[i];
            digits=0;
            do
            {
                digits=digits+1;
                temp=temp/10;
            }while(temp!=0);
            if(digits==0)
            {
                System.out.print("000");
            }
            else if(digits==1)
            {
                System.out.print("00");
            }
            else if(digits==2)
            {
                System.out.print("0");
            }
            else if(digits==3)
            {
                System.out.print("");
            }
            System.out.print(cti[i]);
        }
        System.out.println("'");
    }
    
    public static void BitwiseAtbash_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int pow;
        int ctl;
        int ctipl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int ctipi[];
        ctipi = new int[30000];
        
        int ctbinary[][];
        ctbinary = new int[10000][8];
        
        int tempbinary[];
        tempbinary = new int[8];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char ctipc[];
        ctipc = new char[30000];
        
        String ct;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A Sequence Of Numbers Of Length Greater Than 6 And Of Length A Multiple Of 3):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctipl=ct.length();
            
            if(ctipl<7||(ctipl%3)!=0)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            
            else
            {
                temp=0;
                for(i=0;i<ctipl;i++)
                {
                    ctipc[i]=ct.charAt(i);
                    ctipi[i]=ctipc[i];
                }
                
                for(i=0;i<ctipl;i++)
                {
                    if(ctipi[i]<48||ctipi[i]>57)
                    {
                        temp=1;
                    }
                }
                
                if(temp==1)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Invalid Cipher Text");
                }
            }
        }while(temp==1);
        
        ctl=ctipl/3;
        
        for(i=0;i<ctl;i++)
        {
            j=i*3;
            cti[i]=0;
            for(k=0;k<3;k++)
            {
                if(k==0)
                {
                    l=100;
                }
                else if(k==1)
                {
                    l=10;
                }
                else
                {
                    l=1;
                }
                cti[i]=cti[i]+(ctipi[j+k]-48)*l;
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            temp=cti[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    ctbinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    ctbinary[i][7-j]=0;
                }
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            for(j=0;j<=7;j++)
            {
                tempbinary[j]=ctbinary[i][j];
            }
            ctbinary[i][0]=tempbinary[7];
            ctbinary[i][1]=tempbinary[6];
            ctbinary[i][2]=tempbinary[5];
            ctbinary[i][3]=tempbinary[4];
            ctbinary[i][4]=tempbinary[3];
            ctbinary[i][5]=tempbinary[2];
            ctbinary[i][6]=tempbinary[1];
            ctbinary[i][7]=tempbinary[0];
        }
        
        for(i=0;i<ctl;i++)
        {
            temp=0;
            pow=1;
            for(j=7;j>=0;j--)
            {
                temp=temp+pow*ctbinary[i][j];
                pow=pow*2;
            }
            pti[i]=temp;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void BitwiseBinaryCompliment_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int pow;
        int ptl;
        int digits;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int ptbinary[][];
        ptbinary = new int[10000][8];
        
        char ptc[];
        ptc = new char[10000];
        
        String pt;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<ptl;i++)
        {
            temp=pti[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    ptbinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    ptbinary[i][7-j]=0;
                }
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            for(j=0;j<=7;j++)
            {
                if(ptbinary[i][j]==1)
                {
                    ptbinary[i][j]=0;
                }
                else if(ptbinary[i][j]==0)
                {
                    ptbinary[i][j]=1;
                }
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            temp=0;
            pow=1;
            for(j=7;j>=0;j--)
            {
                temp=temp+pow*ptbinary[i][j];
                pow=pow*2;
            }
            cti[i]=temp;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            temp=cti[i];
            digits=0;
            do
            {
                digits=digits+1;
                temp=temp/10;
            }while(temp!=0);
            if(digits==0)
            {
                System.out.print("000");
            }
            else if(digits==1)
            {
                System.out.print("00");
            }
            else if(digits==2)
            {
                System.out.print("0");
            }
            else if(digits==3)
            {
                System.out.print("");
            }
            System.out.print(cti[i]);
        }
        System.out.println("'");
    }
    
    public static void BitwiseBinaryCompliment_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int pow;
        int ctl;
        int ctipl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int ctipi[];
        ctipi = new int[30000];
        
        int ctbinary[][];
        ctbinary = new int[10000][8];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char ctipc[];
        ctipc = new char[30000];
        
        String ct;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A Sequence Of Numbers Of Length Greater Than 6 And Of Length A Multiple Of 3):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctipl=ct.length();
            
            if(ctipl<7||(ctipl%3)!=0)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            
            else
            {
                temp=0;
                for(i=0;i<ctipl;i++)
                {
                    ctipc[i]=ct.charAt(i);
                    ctipi[i]=ctipc[i];
                }
                
                for(i=0;i<ctipl;i++)
                {
                    if(ctipi[i]<48||ctipi[i]>57)
                    {
                        temp=1;
                    }
                }
                
                if(temp==1)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Invalid Cipher Text");
                }
            }
        }while(temp==1);
        
        ctl=ctipl/3;
        
        for(i=0;i<ctl;i++)
        {
            j=i*3;
            cti[i]=0;
            for(k=0;k<3;k++)
            {
                if(k==0)
                {
                    l=100;
                }
                else if(k==1)
                {
                    l=10;
                }
                else
                {
                    l=1;
                }
                cti[i]=cti[i]+(ctipi[j+k]-48)*l;
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            temp=cti[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    ctbinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    ctbinary[i][7-j]=0;
                }
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            for(j=0;j<=7;j++)
            {
                if(ctbinary[i][j]==1)
                {
                    ctbinary[i][j]=0;
                }
                else if(ctbinary[i][j]==0)
                {
                    ctbinary[i][j]=1;
                }
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            temp=0;
            pow=1;
            for(j=7;j>=0;j--)
            {
                temp=temp+pow*ctbinary[i][j];
                pow=pow*2;
            }
            pti[i]=temp;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void BitwiseLeftShift_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int key;
        int pow;
        int ptl;
        int digits;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int ptbinary[][];
        ptbinary = new int[10000][8];
        
        int tempbinary[];
        tempbinary = new int[8];
        
        char ptc[];
        ptc = new char[10000];
        
        String pt;
        
        key=0;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        do
        {
            temp=0;
            while(temp==0)
            {
                if(indent==1)System.out.print("\t\t\t");
                System.out.println();
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Enter the Key (A Number In The Range Of 0 Through 7):");
                if(indent==1)System.out.print("\t\t\t");
                try
                {
                    key=Integer.parseInt(bfrd.readLine());
                    temp=1;
                }
                catch(NumberFormatException E1nfe)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Key Should Be A Number");
                    temp=0;
                }
            }
            
            if(key<0||key>7)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<ptl;i++)
        {
            temp=pti[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    ptbinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    ptbinary[i][7-j]=0;
                }
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            for(j=0;j<=7;j++)
            {
                tempbinary[j]=ptbinary[i][j];
            }
            for(j=0;j<=7;j++)
            {
                ptbinary[i][j]=tempbinary[(j+8+key)%8];
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            temp=0;
            pow=1;
            for(j=7;j>=0;j--)
            {
                temp=temp+pow*ptbinary[i][j];
                pow=pow*2;
            }
            cti[i]=temp;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            temp=cti[i];
            digits=0;
            do
            {
                digits=digits+1;
                temp=temp/10;
            }while(temp!=0);
            if(digits==0)
            {
                System.out.print("000");
            }
            else if(digits==1)
            {
                System.out.print("00");
            }
            else if(digits==2)
            {
                System.out.print("0");
            }
            else if(digits==3)
            {
                System.out.print("");
            }
            System.out.print(cti[i]);
        }
        System.out.println("'");
    }
    
    public static void BitwiseLeftShift_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int key;
        int pow;
        int ctl;
        int ctipl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int ctipi[];
        ctipi = new int[30000];
        
        int ctbinary[][];
        ctbinary = new int[10000][8];
        
        int tempbinary[];
        tempbinary = new int[8];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char ctipc[];
        ctipc = new char[30000];
        
        String ct;
        
        key=0;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A Sequence Of Numbers Of Length Greater Than 6 And Of Length A Multiple Of 3):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctipl=ct.length();
            
            if(ctipl<7||(ctipl%3)!=0)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            
            else
            {
                temp=0;
                for(i=0;i<ctipl;i++)
                {
                    ctipc[i]=ct.charAt(i);
                    ctipi[i]=ctipc[i];
                }
                
                for(i=0;i<ctipl;i++)
                {
                    if(ctipi[i]<48||ctipi[i]>57)
                    {
                        temp=1;
                    }
                }
                
                if(temp==1)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Invalid Cipher Text");
                }
            }
        }while(temp==1);
        
        do
        {
            temp=0;
            while(temp==0)
            {
                if(indent==1)System.out.print("\t\t\t");
                System.out.println();
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Enter the Key (A Number In The Range Of 0 Through 7):");
                if(indent==1)System.out.print("\t\t\t");
                try
                {
                    key=Integer.parseInt(bfrd.readLine());
                    temp=1;
                }
                catch(NumberFormatException E1nfe)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Key Should Be A Number");
                    temp=0;
                }
            }
            
            if(key<0||key>7)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        ctl=ctipl/3;
        
        for(i=0;i<ctl;i++)
        {
            j=i*3;
            cti[i]=0;
            for(k=0;k<3;k++)
            {
                if(k==0)
                {
                    l=100;
                }
                else if(k==1)
                {
                    l=10;
                }
                else
                {
                    l=1;
                }
                cti[i]=cti[i]+(ctipi[j+k]-48)*l;
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            temp=cti[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    ctbinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    ctbinary[i][7-j]=0;
                }
            }
        }
        
        
        for(i=0;i<ctl;i++)
        {
            for(j=0;j<=7;j++)
            {
                tempbinary[j]=ctbinary[i][j];
            }
            for(j=0;j<=7;j++)
            {
                ctbinary[i][j]=tempbinary[(j+8-key)%8];
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            temp=0;
            pow=1;
            for(j=7;j>=0;j--)
            {
                temp=temp+pow*ctbinary[i][j];
                pow=pow*2;
            }
            pti[i]=temp;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void BitwiseRightShift_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int key;
        int pow;
        int ptl;
        int digits;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int ptbinary[][];
        ptbinary = new int[10000][8];
        
        int tempbinary[];
        tempbinary = new int[8];
        
        char ptc[];
        ptc = new char[10000];
        
        String pt;
        
        key=0;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        do
        {
            temp=0;
            while(temp==0)
            {
                if(indent==1)System.out.print("\t\t\t");
                System.out.println();
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Enter the Key (A Number In The Range Of 0 Through 7):");
                if(indent==1)System.out.print("\t\t\t");
                try
                {
                    key=Integer.parseInt(bfrd.readLine());
                    temp=1;
                }
                catch(NumberFormatException E1nfe)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Key Should Be A Number");
                    temp=0;
                }
            }
            
            if(key<0||key>7)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<ptl;i++)
        {
            temp=pti[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    ptbinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    ptbinary[i][7-j]=0;
                }
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            for(j=0;j<=7;j++)
            {
                tempbinary[j]=ptbinary[i][j];
            }
            for(j=0;j<=7;j++)
            {
                ptbinary[i][j]=tempbinary[(j+8-key)%8];
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            temp=0;
            pow=1;
            for(j=7;j>=0;j--)
            {
                temp=temp+pow*ptbinary[i][j];
                pow=pow*2;
            }
            cti[i]=temp;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            temp=cti[i];
            digits=0;
            do
            {
                digits=digits+1;
                temp=temp/10;
            }while(temp!=0);
            if(digits==0)
            {
                System.out.print("000");
            }
            else if(digits==1)
            {
                System.out.print("00");
            }
            else if(digits==2)
            {
                System.out.print("0");
            }
            else if(digits==3)
            {
                System.out.print("");
            }
            System.out.print(cti[i]);
        }
        System.out.println("'");
    }
    
    public static void BitwiseRightShift_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int key;
        int pow;
        int ctl;
        int ctipl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int ctipi[];
        ctipi = new int[30000];
        
        int ctbinary[][];
        ctbinary = new int[10000][8];
        
        int tempbinary[];
        tempbinary = new int[8];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char ctipc[];
        ctipc = new char[30000];
        
        String ct;
        
        key=0;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A Sequence Of Numbers Of Length Greater Than 6 And Of Length A Multiple Of 3):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctipl=ct.length();
            
            if(ctipl<7||(ctipl%3)!=0)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            
            else
            {
                temp=0;
                for(i=0;i<ctipl;i++)
                {
                    ctipc[i]=ct.charAt(i);
                    ctipi[i]=ctipc[i];
                }
                
                for(i=0;i<ctipl;i++)
                {
                    if(ctipi[i]<48||ctipi[i]>57)
                    {
                        temp=1;
                    }
                }
                
                if(temp==1)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Invalid Cipher Text");
                }
            }
        }while(temp==1);
        
        do
        {
            temp=0;
            while(temp==0)
            {
                if(indent==1)System.out.print("\t\t\t");
                System.out.println();
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Enter the Key (A Number In The Range Of 0 Through 7):");
                if(indent==1)System.out.print("\t\t\t");
                try
                {
                    key=Integer.parseInt(bfrd.readLine());
                    temp=1;
                }
                catch(NumberFormatException E1nfe)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Key Should Be A Number");
                    temp=0;
                }
            }
            
            if(key<0||key>7)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        ctl=ctipl/3;
        
        for(i=0;i<ctl;i++)
        {
            j=i*3;
            cti[i]=0;
            for(k=0;k<3;k++)
            {
                if(k==0)
                {
                    l=100;
                }
                else if(k==1)
                {
                    l=10;
                }
                else
                {
                    l=1;
                }
                cti[i]=cti[i]+(ctipi[j+k]-48)*l;
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            temp=cti[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    ctbinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    ctbinary[i][7-j]=0;
                }
            }
        }
        
        
        for(i=0;i<ctl;i++)
        {
            for(j=0;j<=7;j++)
            {
                tempbinary[j]=ctbinary[i][j];
            }
            for(j=0;j<=7;j++)
            {
                ctbinary[i][j]=tempbinary[(j+8+key)%8];
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            temp=0;
            pow=1;
            for(j=7;j>=0;j--)
            {
                temp=temp+pow*ctbinary[i][j];
                pow=pow*2;
            }
            pti[i]=temp;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void BitwiseExclusiveOr_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int pow;
        int ptl;
        int keyl;
        int digits;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        int ptbinary[][];
        ptbinary = new int[10000][8];
        
        int keybinary[][];
        keybinary = new int[10000][8];
        
        char ptc[];
        ptc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String pt;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<ptl;i++)
        {
            temp=pti[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    ptbinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    ptbinary[i][7-j]=0;
                }
            }
        }
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Greater Than 1):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<2)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            temp=keyi[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    keybinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    keybinary[i][7-j]=0;
                }
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            keyi[i]=keyi[i%keyl];
            for(j=0;j<=7;j++)
            {
                keybinary[i][j]=keybinary[i%keyl][j];
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            for(j=0;j<=7;j++)
            {
                if(ptbinary[i][j]==0&&keybinary[i][j]==0)
                {
                    ptbinary[i][j]=0;
                }
                else if(ptbinary[i][j]==0&&keybinary[i][j]==1)
                {
                    ptbinary[i][j]=1;
                }
                else if(ptbinary[i][j]==1&&keybinary[i][j]==0)
                {
                    ptbinary[i][j]=1;
                }
                else if(ptbinary[i][j]==1&&keybinary[i][j]==1)
                {
                    ptbinary[i][j]=0;
                }
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            temp=0;
            pow=1;
            for(j=7;j>=0;j--)
            {
                temp=temp+pow*ptbinary[i][j];
                pow=pow*2;
            }
            cti[i]=temp;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            temp=cti[i];
            digits=0;
            do
            {
                digits=digits+1;
                temp=temp/10;
            }while(temp!=0);
            if(digits==0)
            {
                System.out.print("000");
            }
            else if(digits==1)
            {
                System.out.print("00");
            }
            else if(digits==2)
            {
                System.out.print("0");
            }
            else if(digits==3)
            {
                System.out.print("");
            }
            System.out.print(cti[i]);
        }
        System.out.println("'");
    }
    
    public static void BitwiseExclusiveOr_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int pow;
        int ctl;
        int ctipl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int ctipi[];
        ctipi = new int[30000];
        
        int keyi[];
        keyi = new int[10000];
        
        int ctbinary[][];
        ctbinary = new int[10000][8];
        
        int keybinary[][];
        keybinary = new int[10000][8];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char ctipc[];
        ctipc = new char[30000];
        
        char keyc[];
        keyc = new char[10000];
        
        String ct;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A Sequence Of Numbers Of Length Greater Than 6 And Of Length A Multiple Of 3):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctipl=ct.length();
            
            if(ctipl<7||(ctipl%3)!=0)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            
            else
            {
                temp=0;
                for(i=0;i<ctipl;i++)
                {
                    ctipc[i]=ct.charAt(i);
                    ctipi[i]=ctipc[i];
                }
                
                for(i=0;i<ctipl;i++)
                {
                    if(ctipi[i]<48||ctipi[i]>57)
                    {
                        temp=1;
                    }
                }
                
                if(temp==1)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Invalid Cipher Text");
                }
            }
        }while(temp==1);
        
        ctl=ctipl/3;
        
        for(i=0;i<ctl;i++)
        {
            j=i*3;
            cti[i]=0;
            for(k=0;k<3;k++)
            {
                if(k==0)
                {
                    l=100;
                }
                else if(k==1)
                {
                    l=10;
                }
                else
                {
                    l=1;
                }
                cti[i]=cti[i]+(ctipi[j+k]-48)*l;
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            temp=cti[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    ctbinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    ctbinary[i][7-j]=0;
                }
            }
        }
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Greater Than 1):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<2)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            temp=keyi[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    keybinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    keybinary[i][7-j]=0;
                }
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            keyi[i]=keyi[i%keyl];
            for(j=0;j<=7;j++)
            {
                keybinary[i][j]=keybinary[i%keyl][j];
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            for(j=0;j<=7;j++)
            {
                if(ctbinary[i][j]==0&&keybinary[i][j]==0)
                {
                    ctbinary[i][j]=0;
                }
                else if(ctbinary[i][j]==0&&keybinary[i][j]==1)
                {
                    ctbinary[i][j]=1;
                }
                else if(ctbinary[i][j]==1&&keybinary[i][j]==0)
                {
                    ctbinary[i][j]=1;
                }
                else if(ctbinary[i][j]==1&&keybinary[i][j]==1)
                {
                    ctbinary[i][j]=0;
                }
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            temp=0;
            pow=1;
            for(j=7;j>=0;j--)
            {
                temp=temp+pow*ctbinary[i][j];
                pow=pow*2;
            }
            pti[i]=temp;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void BitwiseOneTimePad_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int pow;
        int ptl;
        int keyl;
        int digits;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        int ptbinary[][];
        ptbinary = new int[10000][8];
        
        int keybinary[][];
        keybinary = new int[10000][8];
        
        char ptc[];
        ptc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String pt;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        for(i=0;i<ptl;i++)
        {
            temp=pti[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    ptbinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    ptbinary[i][7-j]=0;
                }
            }
        }
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Atleast As Long As Plain Text):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<ptl)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            temp=keyi[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    keybinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    keybinary[i][7-j]=0;
                }
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            keyi[i]=keyi[i%keyl];
            for(j=0;j<=7;j++)
            {
                keybinary[i][j]=keybinary[i%keyl][j];
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            for(j=0;j<=7;j++)
            {
                if(ptbinary[i][j]==0&&keybinary[i][j]==0)
                {
                    ptbinary[i][j]=0;
                }
                else if(ptbinary[i][j]==0&&keybinary[i][j]==1)
                {
                    ptbinary[i][j]=1;
                }
                else if(ptbinary[i][j]==1&&keybinary[i][j]==0)
                {
                    ptbinary[i][j]=1;
                }
                else if(ptbinary[i][j]==1&&keybinary[i][j]==1)
                {
                    ptbinary[i][j]=0;
                }
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            temp=0;
            pow=1;
            for(j=7;j>=0;j--)
            {
                temp=temp+pow*ptbinary[i][j];
                pow=pow*2;
            }
            cti[i]=temp;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            temp=cti[i];
            digits=0;
            do
            {
                digits=digits+1;
                temp=temp/10;
            }while(temp!=0);
            if(digits==0)
            {
                System.out.print("000");
            }
            else if(digits==1)
            {
                System.out.print("00");
            }
            else if(digits==2)
            {
                System.out.print("0");
            }
            else if(digits==3)
            {
                System.out.print("");
            }
            System.out.print(cti[i]);
        }
        System.out.println("'");
    }
    
    public static void BitwiseOneTimePad_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int pow;
        int ctl;
        int ctipl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int ctipi[];
        ctipi = new int[30000];
        
        int keyi[];
        keyi = new int[10000];
        
        int ctbinary[][];
        ctbinary = new int[10000][8];
        
        int keybinary[][];
        keybinary = new int[10000][8];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char ctipc[];
        ctipc = new char[30000];
        
        char keyc[];
        keyc = new char[10000];
        
        String ct;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A Sequence Of Numbers Of Length Greater Than 6 And Of Length A Multiple Of 3):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctipl=ct.length();
            
            if(ctipl<7||(ctipl%3)!=0)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            
            else
            {
                temp=0;
                for(i=0;i<ctipl;i++)
                {
                    ctipc[i]=ct.charAt(i);
                    ctipi[i]=ctipc[i];
                }
                
                for(i=0;i<ctipl;i++)
                {
                    if(ctipi[i]<48||ctipi[i]>57)
                    {
                        temp=1;
                    }
                }
                
                if(temp==1)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Invalid Cipher Text");
                }
            }
        }while(temp==1);
        
        ctl=ctipl/3;
        
        for(i=0;i<ctl;i++)
        {
            j=i*3;
            cti[i]=0;
            for(k=0;k<3;k++)
            {
                if(k==0)
                {
                    l=100;
                }
                else if(k==1)
                {
                    l=10;
                }
                else
                {
                    l=1;
                }
                cti[i]=cti[i]+(ctipi[j+k]-48)*l;
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            temp=cti[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    ctbinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    ctbinary[i][7-j]=0;
                }
            }
        }
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Atleast As Long As One Third Of Cipher Text):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<ctl)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            temp=keyi[i];
            for(j=7;j>=0;j--)
            {
                pow=1;
                for(k=1;k<=j;k++)
                {
                    pow=pow*2;
                }
                
                if(pow<=temp)
                {
                    keybinary[i][7-j]=1;
                    temp=temp-pow;
                }
                else
                {
                    keybinary[i][7-j]=0;
                }
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            keyi[i]=keyi[i%keyl];
            for(j=0;j<=7;j++)
            {
                keybinary[i][j]=keybinary[i%keyl][j];
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            for(j=0;j<=7;j++)
            {
                if(ctbinary[i][j]==0&&keybinary[i][j]==0)
                {
                    ctbinary[i][j]=0;
                }
                else if(ctbinary[i][j]==0&&keybinary[i][j]==1)
                {
                    ctbinary[i][j]=1;
                }
                else if(ctbinary[i][j]==1&&keybinary[i][j]==0)
                {
                    ctbinary[i][j]=1;
                }
                else if(ctbinary[i][j]==1&&keybinary[i][j]==1)
                {
                    ctbinary[i][j]=0;
                }
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            temp=0;
            pow=1;
            for(j=7;j>=0;j--)
            {
                temp=temp+pow*ctbinary[i][j];
                pow=pow*2;
            }
            pti[i]=temp;
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void SquareTransposition_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int ptl;
        int sq1;
        int sq2;
        int test;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        char ctc[];
        ctc = new char[10000];
        
        String pt;
        
        k=1;
        test=1;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        i=0;
        
        while(test==1)
        {
            j=i+1;
            sq1=i*i;
            sq2=j*j;
            if(ptl>sq1&&ptl<=sq2)
            {
                if(ptl<sq2)
                {
                    for(k=ptl;k<sq2;k++)
                    {
                        pti[k]=' ';
                    }
                    ptl=sq2;
                }
                k=j;
                test=0;
            }
            i++;
        }
        
        i=0;
        l=0;
        
        for(i=0;i<k;i++)
        {
            for(j=0;j<k;j++)
            {
                temp=i+k*j;
                cti[l]=pti[temp];
                l=l+1;
            }
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void SquareTransposition_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int ctl;
        int sq1;
        int sq2;
        int test;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        char ctc[];
        ctc = new char[10000];
        
        String ct;
        
        k=1;
        test=1;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        i=0;
        
        while(test==1)
        {
            j=i+1;
            sq1=i*i;
            sq2=j*j;
            if(ctl>sq1&&ctl<=sq2)
            {
                if(ctl<sq2)
                {
                    for(k=ctl;k<sq2;k++)
                    {
                        cti[k]=' ';
                    }
                    ctl=sq2;
                }
                k=j;
                test=0;
            }
            i++;
        }
        
        i=0;
        l=0;
        
        for(i=0;i<k;i++)
        {
            for(j=0;j<k;j++)
            {
                temp=i+k*j;
                pti[l]=cti[temp];
                l=l+1;
            }
        }
        
        temp=0;
        
        for(i=0;i<ctl;i++)
        {
            if(pti[i]!=32)
            {
                temp=i;
            }
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<=temp;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void ColumnarTransposition_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int ptl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        int keyiasc[][];
        keyiasc = new int[2][10000];
        
        int cta[][];
        cta = new int[100][1000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String pt;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Greater Than 1 And Less Than 100 And Less Than Length Of Plain Text):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<2||keyl>=100||keyl>=ptl)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyiasc[0][i]=i;
            keyiasc[1][i]=keyi[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            for(j=i;j<keyl;j++)
            {
                if(keyiasc[1][j]<keyiasc[1][i])
                {
                    temp=keyiasc[1][j];
                    keyiasc[1][j]=keyiasc[1][i];
                    keyiasc[1][i]=temp;
                    
                    temp=keyiasc[0][j];
                    keyiasc[0][j]=keyiasc[0][i];
                    keyiasc[0][i]=temp;
                }
            }
        }
        
        temp=0;
        i=ptl;
        while(ptl%keyl!=0)
        {
            pti[i]=' ';
            i=i+1;
            ptl=ptl+1;
        }
        
        k=0;
        for(i=0;i<ptl/keyl;i++)
        {
            for(j=0;j<keyl;j++)
            {
                cta[i][j]=pti[k];
                k=k+1;   
            }
        }
        
        k=0;
        for(i=0;i<keyl;i++)
        {
            for(j=0;j<ptl/keyl;j++)
            {
                cti[k]=cta[j][keyiasc[0][i]];
                k=k+1;
            }
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void ColumnarTransposition_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int ctl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        int keyiasc[][];
        keyiasc = new int[2][10000];
        
        int cta[][];
        cta = new int[100][1000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String ct;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Greater Than 1 And Less Than 100 And Less Than Length Of Cipher Text):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<2||keyl>=100||keyl>=ctl)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyiasc[0][i]=i;
            keyiasc[1][i]=keyi[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            for(j=i;j<keyl;j++)
            {
                if(keyiasc[1][j]<keyiasc[1][i])
                {
                    temp=keyiasc[1][j];
                    keyiasc[1][j]=keyiasc[1][i];
                    keyiasc[1][i]=temp;
                    
                    temp=keyiasc[0][j];
                    keyiasc[0][j]=keyiasc[0][i];
                    keyiasc[0][i]=temp;
                }
            }
        }
        
        temp=0;
        i=ctl;
        while(ctl%keyl!=0)
        {
            cti[i]=' ';
            i=i+1;
            ctl=ctl+1;
        }
        
        k=0;
        for(i=0;i<keyl;i++)
        {
            for(j=0;j<ctl/keyl;j++)
            {
                cta[j][keyiasc[0][i]]=cti[k];
                k++;
            }
        }
        
        k=0;
        for(i=0;i<ctl/keyl;i++)
        {
            for(j=0;j<keyl;j++)
            {
                pti[k]=cta[i][j];
                k++;
            }
        }
        
        temp=0;
        for(i=0;i<ctl;i++)
        {
            if(pti[i]!=' ')
            {
                temp=i;
            }
        }
        ctl=temp+1;
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void DoubleTransposition_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int ptl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        int keyiasc[][];
        keyiasc = new int[2][10000];
        
        int cta[][];
        cta = new int[100][1000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String pt;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The First Keyword (A String Of Length Greater Than 1 And Less Than 100 And Less Than Length Of Plain Text):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<2||keyl>=100||keyl>=ptl)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyiasc[0][i]=i;
            keyiasc[1][i]=keyi[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            for(j=i;j<keyl;j++)
            {
                if(keyiasc[1][j]<keyiasc[1][i])
                {
                    temp=keyiasc[1][j];
                    keyiasc[1][j]=keyiasc[1][i];
                    keyiasc[1][i]=temp;
                    
                    temp=keyiasc[0][j];
                    keyiasc[0][j]=keyiasc[0][i];
                    keyiasc[0][i]=temp;
                }
            }
        }
        
        temp=0;
        i=ptl;
        while(ptl%keyl!=0)
        {
            pti[i]=' ';
            i=i+1;
            ptl=ptl+1;
        }
        
        k=0;
        for(i=0;i<ptl/keyl;i++)
        {
            for(j=0;j<keyl;j++)
            {
                cta[i][j]=pti[k];
                k=k+1;
            }
        }
        
        k=0;
        for(i=0;i<keyl;i++)
        {
            for(j=0;j<ptl/keyl;j++)
            {
                cti[k]=cta[j][keyiasc[0][i]];
                k=k+1;
            }
        }
        
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            ptc[i]=ctc[i];
            pti[i]=ptc[i];
        }
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Second Keyword (A String Of Length Greater Than 1 And Less Than 100 And Less Than Length Of Plain Text):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<2||keyl>=100||keyl>=ptl)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyiasc[0][i]=i;
            keyiasc[1][i]=keyi[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            for(j=i;j<keyl;j++)
            {
                if(keyiasc[1][j]<keyiasc[1][i])
                {
                    temp=keyiasc[1][j];
                    keyiasc[1][j]=keyiasc[1][i];
                    keyiasc[1][i]=temp;
                    
                    temp=keyiasc[0][j];
                    keyiasc[0][j]=keyiasc[0][i];
                    keyiasc[0][i]=temp;
                }
            }
        }
        
        temp=0;
        i=ptl;
        while(ptl%keyl!=0)
        {
            pti[i]=' ';
            i=i+1;
            ptl=ptl+1;
        }
        
        k=0;
        for(i=0;i<ptl/keyl;i++)
        {
            for(j=0;j<keyl;j++)
            {
                cta[i][j]=pti[k];
                k=k+1;
            }
        }
        
        k=0;
        for(i=0;i<keyl;i++)
        {
            for(j=0;j<ptl/keyl;j++)
            {
                cti[k]=cta[j][keyiasc[0][i]];
                k=k+1;
            }
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void DoubleTransposition_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int ctl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        int keyiasc[][];
        keyiasc = new int[2][10000];
        
        int cta[][];
        cta = new int[100][1000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String ct;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Second Keyword (A String Of Length Greater Than 1 And Less Than 100 And Less Than Length Of Cipher Text):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<2||keyl>=100||keyl>=ctl)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyiasc[0][i]=i;
            keyiasc[1][i]=keyi[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            for(j=i;j<keyl;j++)
            {
                if(keyiasc[1][j]<keyiasc[1][i])
                {
                    temp=keyiasc[1][j];
                    keyiasc[1][j]=keyiasc[1][i];
                    keyiasc[1][i]=temp;
                    
                    temp=keyiasc[0][j];
                    keyiasc[0][j]=keyiasc[0][i];
                    keyiasc[0][i]=temp;
                }
            }
        }
        
        temp=0;
        i=ctl;
        while(ctl%keyl!=0)
        {
            cti[i]=' ';
            i=i+1;
            ctl=ctl+1;
        }
        
        k=0;
        for(i=0;i<keyl;i++)
        {
            for(j=0;j<ctl/keyl;j++)
            {
                cta[j][keyiasc[0][i]]=cti[k];
                k++;
            }
        }
        
        k=0;
        for(i=0;i<ctl/keyl;i++)
        {
            for(j=0;j<keyl;j++)
            {
                pti[k]=cta[i][j];
                k++;
            }
        }
        
        temp=0;
        for(i=0;i<ctl;i++)
        {
            if(pti[i]!=' ')
            {
                temp=i;
            }
        }
        ctl=temp+1;
        
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            ctc[i]=ptc[i];
            cti[i]=ctc[i];
        }
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The First Keyword (A String Of Length Greater Than 1 And Less Than 100 And Less Than Length Of Cipher Text):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<2||keyl>=100||keyl>=ctl)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        while(ctl%keyl!=0)
        {
            cti[ctl]=' ';
            ctl++;
        }
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyiasc[0][i]=i;
            keyiasc[1][i]=keyi[i];
        }
        
        for(i=0;i<keyl;i++)
        {
            for(j=i;j<keyl;j++)
            {
                if(keyiasc[1][j]<keyiasc[1][i])
                {
                    temp=keyiasc[1][j];
                    keyiasc[1][j]=keyiasc[1][i];
                    keyiasc[1][i]=temp;
                    
                    temp=keyiasc[0][j];
                    keyiasc[0][j]=keyiasc[0][i];
                    keyiasc[0][i]=temp;
                }
            }
        }
        
        temp=0;
        i=ctl;
        while(ctl%keyl!=0)
        {
            cti[i]=' ';
            i=i+1;
            ctl=ctl+1;
        }
        
        k=0;
        for(i=0;i<keyl;i++)
        {
            for(j=0;j<ctl/keyl;j++)
            {
                cta[j][keyiasc[0][i]]=cti[k];
                k++;
            }
        }
        
        k=0;
        for(i=0;i<ctl/keyl;i++)
        {
            for(j=0;j<keyl;j++)
            {
                pti[k]=cta[i][j];
                k++;
            }
        }
        
        temp=0;
        for(i=0;i<ctl;i++)
        {
            if(pti[i]!=' ')
            {
                temp=i;
            }
        }
        ctl=temp+1;
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void MyszkowskiTransposition_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int ptl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        int keyiasc[][];
        keyiasc = new int[2][10000];
        
        int cta[][];
        cta = new int[100][1000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String pt;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Greater Than 1 And Less Than 100 And Less Than Length Of Plain Text):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<2||keyl>=100||keyl>=ptl)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyiasc[1][i]=keyi[i];
        }
        
        k=0;
        temp=0;
        for(i=0;i<=255;i++)
        {
            for(j=0;j<keyl;j++)
            {
                if(keyiasc[1][j]==i)
                {
                    keyiasc[0][j]=k;
                    temp=1;
                }
            }
            if(temp==1)
            {
                temp=0;
                k=k+1;
            }
        }
        
        temp=0;
        i=ptl;
        while(ptl%keyl!=0)
        {
            pti[i]=' ';
            i=i+1;
            ptl=ptl+1;
        }
        
        temp=0;
        for(i=0;i<ptl/keyl;i++)
        {
            for(j=0;j<keyl;j++)
            {
                cta[i][j]=pti[temp];
                temp=temp+1;
            }
        }
        
        temp=k;
        l=0;
        for(i=0;i<temp;i++)
        {
            for(j=0;j<ptl/keyl;j++)
            {
                for(k=0;k<keyl;k++)
                {
                    if(keyiasc[0][k]==i)
                    {
                        cti[l]=cta[j][k];
                        l=l+1;
                    }
                }
            }
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void MyszkowskiTransposition_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int ctl;
        int keyl;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int keyi[];
        keyi = new int[10000];
        
        int keyiasc[][];
        keyiasc = new int[2][10000];
        
        int cta[][];
        cta = new int[100][1000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        char keyc[];
        keyc = new char[10000];
        
        String ct;
        String key;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Keyword (A String Of Length Greater Than 1 And Less Than 100 And Less Than Length Of Cipher Text):");
            if(indent==1)System.out.print("\t\t\t");
            key=bfrd.readLine();
            keyl=key.length();
            if(keyl<2||keyl>=100||keyl>=ctl)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<keyl;i++)
        {
            keyc[i]=key.charAt(i);
            keyi[i]=keyc[i];
            keyiasc[1][i]=keyi[i];
        }
        
        k=0;
        temp=0;
        for(i=0;i<=255;i++)
        {
            for(j=0;j<keyl;j++)
            {
                if(keyiasc[1][j]==i)
                {
                    keyiasc[0][j]=k;
                    temp=1;
                }
            }
            if(temp==1)
            {
                temp=0;
                k=k+1;
            }
        }
        
        temp=0;
        i=ctl;
        while(ctl%keyl!=0)
        {
            cti[i]=' ';
            i=i+1;
            ctl=ctl+1;
        }
        
        temp=k;
        l=0;
        for(i=0;i<temp;i++)
        {
            for(j=0;j<ctl/keyl;j++)
            {
                for(k=0;k<keyl;k++)
                {
                    if(keyiasc[0][k]==i)
                    {
                        cta[j][k]=cti[l];
                        l=l+1;
                    }
                }
            }
        }
        
        temp=0;
        for(i=0;i<ctl/keyl;i++)
        {
            for(j=0;j<keyl;j++)
            {
                pti[temp]=cta[i][j];
                temp=temp+1;
            }
        }
        
        temp=0;
        for(i=0;i<ctl;i++)
        {
            if(pti[i]!=' ')
            {
                temp=i;
            }
        }
        ctl=temp+1;
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ctl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void ChineseTransposition_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int ptl;
        int key;
        int rows;
        int cols;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int cta[][];
        cta = new int[100][10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        String pt;
        
        key=0;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        do
        {
            temp=0;
            while(temp==0)
            {
                if(indent==1)System.out.print("\t\t\t");
                System.out.println();
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Enter The Key (A Number Greater Than 1 And Less Than 100 And Less Than Length Of Plain Text):");
                if(indent==1)System.out.print("\t\t\t");
                try
                {
                    key=Integer.parseInt(bfrd.readLine());
                    temp=1;
                }
                catch(NumberFormatException E1nfe)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Key Should Be A Number");
                    temp=0;
                }
            }
            
            if(key<2||key>99||key>=pt.length())
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        temp=0;
        i=ptl;
        while(ptl%key!=0)
        {
            pti[i]=' ';
            i=i+1;
            ptl=ptl+1;
        }
        
        rows=key;
        cols=ptl/key;
        
        k=0;
        l=0;
        for(i=(cols-1);i>=0;i--)
        {
            if(k%2==0)
            {
                for(j=0;j<rows;j++)
                {
                    cta[j][i]=pti[l];
                    l=l+1;
                }
            }
            else
            {
                for(j=(rows-1);j>=0;j--)
                {
                    cta[j][i]=pti[l];
                    l=l+1;
                }
            }
            k=k+1;
        }
        
        k=0;
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                cti[k]=cta[i][j];
                k=k+1;
            }
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void ChineseTransposition_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int ctl;
        int key;
        int rows;
        int cols;
        int temp;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        int cta[][];
        cta = new int[100][10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        String ct;
        
        key=0;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        do
        {
            temp=0;
            while(temp==0)
            {
                if(indent==1)System.out.print("\t\t\t");
                System.out.println();
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Enter The Key (A Number Greater Than 1 And Less Than 100 And Less Than Length Of Cipher Text):");
                if(indent==1)System.out.print("\t\t\t");
                try
                {
                    key=Integer.parseInt(bfrd.readLine());
                    temp=1;
                }
                catch(NumberFormatException E1nfe)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Key Should Be A Number");
                    temp=0;
                }
            }
            
            if(key<2||key>99||key>=ct.length())
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        temp=0;
        i=ctl;
        while(ctl%key!=0)
        {
            cti[i]=' ';
            i=i+1;
            ctl=ctl+1;
        }
        
        rows=key;
        cols=ctl/key;
        
        k=0;
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                cta[i][j]=cti[k];
                k=k+1;
            }
        }
        
        k=0;
        l=0;
        for(i=(cols-1);i>=0;i--)
        {
            if(k%2==0)
            {
                for(j=0;j<rows;j++)
                {
                    pti[l]=cta[j][i];
                    l=l+1;
                }
            }
            else
            {
                for(j=(rows-1);j>=0;j--)
                {
                    pti[l]=cta[j][i];
                    l=l+1;
                }
            }
            k=k+1;
        }
        
        temp=0;
        for(i=0;i<ctl;i++)
        {
            if(pti[i]!=32)
            {
                temp=i;
            }
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<=temp;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
    
    public static void RailFence_enc()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int m;
        int n;
        int o;
        int p;
        int q;
        int r;
        int s;
        int k1;
        int k2;
        int key;
        int ptl;
        int sq1;
        int sq2;
        int temp;
        int test;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        char ctc[];
        ctc = new char[10000];
        
        String pt;
        
        k=1;
        m=1;
        n=1;
        
        key=0;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Plain Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            pt=bfrd.readLine();
            ptl=pt.length();
            if(ptl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Plain Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        do
        {
            temp=0;
            while(temp==0)
            {
                if(indent==1)System.out.print("\t\t\t");
                System.out.println();
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Enter The Key (A Number Greater Than 1 And Less Than The Length Of The Plain Text):");
                if(indent==1)System.out.print("\t\t\t");
                try
                {
                    key=Integer.parseInt(bfrd.readLine());
                    temp=1;
                }
                catch(NumberFormatException E1nfe)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Key Should Be A Number");
                    temp=0;
                }
            }
            
            if(key<2||key>=pt.length())
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ptl;i++)
        {
            ptc[i]=pt.charAt(i);
            pti[i]=ptc[i];
        }
        
        test=0;
        i=0;
        j=1;
        l=key-2;
        
        do
        {
            k=key*j+i;
            if(ptl==k)
            {
                test=1;
                n=j;
            }
            i=l*j;
            j=j+1;
        }while(k<=ptl);
        
        i=0;
        j=0;
        while(test==0)
        {
            k1=key*j+i;
            i=l*j;
            j=j+1;
            k2=key*j+i;
            if(ptl>k1&&ptl<k2)
            {
                for(k=ptl;k<k2;k++)
                {
                    pti[k]=' ';
                }
                test=1;
                ptl=k2;
                n=j;
            }
        }
       
        for(k=0;k<key;k++)
        {
            r=key-1;
            if(k==0)
            {
                for(j=0,i=1;j<n;j++,i=i+l)
                {
                    m=key*j+i;
                    s=m-1;
                    cti[j]=pti[s];
                }
                m=n;
            }
            else if(k==r)
            {
                for(j=1,i=0;j<=n;j++,i=i+l)
                {
                    o=key*j+i;
                    s=o-1;
                    cti[m]=pti[s];
                    m=m+1;
                }
            }
            else
            {
                for(j=0,i=1;j<n;j++,i=i+l)
                {
                    o=key*j+i;
                    if(o==1)
                    {
                        p=o+k;
                        s=p-1;
                        cti[m]=pti[s];
                        m=m+1;
                    }
                    
                    else
                    {
                        for(q=1;q<3;q++)
                        {
                            if(q==1)
                            {
                                p=o-k;
                                s=p-1;
                                cti[m]=pti[s];
                                m=m+1; 
                            }
                            else
                            {
                                p=o+k;
                                s=p-1;
                                cti[m]=pti[s];
                                m=m+1;
                            }
                        }
                    }
                }
            }
        }
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Cipher Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<ptl;i++)
        {
            ctc[i]=(char)cti[i];
            System.out.print(ctc[i]);
        }
        System.out.println("'");
    }
    
    public static void RailFence_dec()throws IOException
    {
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int j;
        int k;
        int l;
        int m;
        int n;
        int o;
        int p;
        int q;
        int r;
        int s;
        int t;
        int u;
        int v;
        int w;
        int x;
        int y;
        int k1;
        int k2;
        int key;
        int ctl;
        int ptl;
        int temp;
        int test;
        
        int pti[];
        pti = new int[10000];
        
        int cti[];
        cti = new int[10000];
        
        char ptc[];
        ptc = new char[10000];
        
        char ctc[];
        ctc = new char[10000];
        
        String ct;
        
        k=1;
        m=1;
        n=1;
        o=1;
        
        key=0;
        
        temp=0;
        do
        {
            if(indent==1)System.out.print("\t\t\t");
            System.out.println();
            if(indent==1)System.out.print("\t\t\t");
            System.out.println("Enter The Cipher Text (A String Of Length Greater Than 2):");
            if(indent==1)System.out.print("\t\t\t");
            ct=bfrd.readLine();
            ctl=ct.length();
            if(ctl<3)
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Cipher Text Length");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        do
        {
            temp=0;
            while(temp==0)
            {
                if(indent==1)System.out.print("\t\t\t");
                System.out.println();
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Enter The Key (A Number Greater Than 1 And Less Than The Length Of The Cipher Text):");
                if(indent==1)System.out.print("\t\t\t");
                try
                {
                    key=Integer.parseInt(bfrd.readLine());
                    temp=1;
                }
                catch(NumberFormatException E1nfe)
                {
                    if(indent==1)System.out.print("\t\t\t");
                    System.out.println("Key Should Be A Number");
                    temp=0;
                }
            }
            
            if(key<2||key>=ct.length())
            {
                temp=1;
                if(indent==1)System.out.print("\t\t\t");
                System.out.println("Invalid Key");
            }
            else
            {
                temp=0;
            }
        }while(temp==1);
        
        for(i=0;i<ctl;i++)
        {
            ctc[i]=ct.charAt(i);
            cti[i]=ctc[i];
        }
        
        test=0;
        i=0;
        j=1;
        l=key-2;

        do
        {
            k=key*j+i;
            if(ctl==k)
            {
                test=1;
                n=j;
            }
            i=l*j;
            j=j+1;
        }while(k<=ctl);
        
        i=0;
        j=0;
        while(test==0)
        {
            k1=key*j+i;
            i=l*j;
            j=j+1;
            k2=key*j+i;
            if(ctl>k1&&ctl<k2)
            {
                for(k=ctl;k<k2;k++)
                {
                    cti[k]=' ';
                }
                test=1;
                ctl=k2;
                n=j;
            }
        }
        
        if(key!=2)
        {
            m=(2*n)-1;
        }
        else if(key==2)
        {
            m=n;
        }
        p=(2*key)-1;
        
        
        j=0;
        for(k=0;k<n;k++)
        {
            if(k==0)
            {
               for(i=1;i<=key;i++)
               {
                    if(i==1)
                    {
                        o=1;
                        w=o-1;
                        pti[j]=cti[w];
                        j=j+1;
                    }
                    else if(i==2)
                    {
                        o=o+n;
                        w=o-1;
                        pti[j]=cti[w];
                        j=j+1;
                    }
                    else
                    {
                        o=o+m;
                        w=o-1;
                        pti[j]=cti[w];
                        j=j+1;
                    }
               }
            }
            
            else
            {
                for(i=1;i<p;i++)
                {
                    q=k-1;
                    r=m-k;
                    s=n+q;
                    t=n+k;
                    u=(p-1)/2;
                    v=(p+1)/2;
                    x=p-1;
                    y=m-1;
                    if(i==u)
                    {
                        if(key==2)
                        {
                            o=o-y;
                            w=o-1;
                            pti[j]=cti[w];
                            j=j+1;
                        }
                        else
                        {
                            o=o-s;
                            w=o-1;
                            pti[j]=cti[w];
                            j=j+1;
                        }
                    }
                    else if(i==v)
                    {
                        if(key==2)
                        {
                            o=o+n;
                            w=o-1;
                            pti[j]=cti[w];
                            j=j+1;
                        }
                        else
                        {
                            o=o+t;
                            w=o-1;
                            pti[j]=cti[w];
                            j=j+1;
                        }
                    }
                    else if(i==1)
                    {
                        o=o-r;
                        w=o-1;
                        pti[j]=cti[w];
                        j=j+1;
                    }
                   
                    else if(i==x)
                    {
                        o=o+r;
                        w=o-1;
                        pti[j]=cti[w];
                        j=j+1;
                    }
                        
                    else if(i<u)
                    {
                        o=o-m;
                        w=o-1;
                        pti[j]=cti[w];
                        j=j+1;
                    }
                    else if(i>v)
                    {
                        o=o+m;
                        w=o-1;
                        pti[j]=cti[w];
                        j=j+1;
                    }
                }
            }
        }
        
        for(i=0;i<ctl;i++)
        {
            if(pti[i]!=32)
            {
                j=i;
            }
        }
        
        ptl=j;
        
        if(indent==1)System.out.print("\t\t\t");
        System.out.println();
        if(indent==1)System.out.print("\t\t\t");
        System.out.println("The Plain Text Is:");
        if(indent==1)System.out.print("\t\t\t");
        System.out.print("'");
        for(i=0;i<=ptl;i++)
        {
            ptc[i]=(char)pti[i];
            System.out.print(ptc[i]);
        }
        System.out.println("'");
    }
}

//****************************************** End Of Program ******************************************//