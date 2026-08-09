package august.aug2.iostreams;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {


        // creating a file using the file class
//        File f = new File("abc.txt");
//
//        System.out.println(f.exists());
//
//        f.createNewFile();
//
//
//        System.out.println(f.exists());


        // creating a directory using file class in java

//        File f = new File("rishi");
//
//        System.out.println(f.exists());
//        f.mkdir();
//        System.out.println(f.exists());




        // creting a java file inside the directory using java program

//        File f = new File("filedemo");
//        f.mkdir();
//        File f1 = new File(f , "abc.txt");
//        f1.createNewFile();

        // these method returns whether the files object is file or directory
//        System.out.println(f.isDirectory() + " " + f.isFile());
//        System.out.println(f1.isDirectory() + " " + f1.isFile());


        // these method used to list the files in the directory

//        System.out.println(f.list());

        // to list the length of the file  character we need to call this method

//        System.out.println(f1.length());



        // to delete the directory of the file we can easily delete them using delete method of the object
//
//        f1.delete();
//        f.delete();


        // use the list method
//
//        File f = new File("DailyProblems");
//        System.out.println(f.exists());
//        String[] list = f.list();
//        System.out.println(Arrays.toString(list));


        // using a filewriter in java
        // this type used to override the data

//        FileWriter fileWriter = new FileWriter("abc.txt");
//        fileWriter.write('r');
//        fileWriter.write("ishi");
//        fileWriter.write(100);
//        fileWriter.flush();
//        fileWriter.close();

        // this type of creating object is used to append the data in the file
//        FileWriter fileWriter = new FileWriter("abc.txt" , true);
//        fileWriter.write('r');
//        fileWriter.write("ishi");
//        fileWriter.write(100);
//        fileWriter.flush();
//        fileWriter.close();

        // Note : we also have the BufferedWriter and PrintWrite to write in to the file , because there are two limitations
        // in the filewriter , every time we have to write the new line character and only it works only for some machines not all the machines




        // using fileReader
        // file reader has three methods
//        FileReader fileReader = new FileReader("abc.txt");
            // read method is going to tead only one character at a time , it returns the
            // it returns the unicode , we have to typecast it to print the data
//        int i = fileReader.read();
//        while (i != -1 ){
//            System.out.print((char) i );
//            i = fileReader.read();
//        }


        // we can also get the data in the file using the read(char[] ch )
//        File f = new File("abc.txt");
//        char[] ch = new char[(int) f.length()]; // this is the recommended approach because we can miss if we define less size
//        FileReader fileReader = new FileReader("abc.txt");
//        fileReader.read(ch);
//
//        for(char c : ch){
//            System.out.print(c);
//        }


        // this filereader also having the limitation that
        // we can only read the file  character by character.
        // we cannot read a line by line values so this is not good to recommend
        // there is another class called buffered Reader

        // till now fileWriter and FileReader is not recommended to use , because the mentioned the limitations
        // BufferedReader and BufferedWriter are the covering those above limitations
        // BufferedWrite is having a special method other than the FileWriter method that is

//        FileWriter fileWriter = new FileWriter("abc.txt"); // also add the true to append the file data should be appended
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//        bufferedWriter.write('d');
//        bufferedWriter.write(new char[ ]{'c' , 'd' , 'e' , 'f'  });
//        bufferedWriter.newLine();
//        bufferedWriter.flush();
//        synchronized (bufferedWriter){
//            bufferedWriter.wait(10000);
//        }
//        bufferedWriter.write("hello java");
//        bufferedWriter.flush();
//        bufferedWriter.close();

        // we just have  close the BufferedReader if i close the bufferedreader automatically it closes the filereader also


        // to overcome the limitations of the fileReader , buffered reader is introduced
        // it is the best reader to read the files
        // we can read char by char (or) line by line
        // in the same way of the BufferedWriter , BufferedReader also use other file reader

//        FileReader fileReader = new FileReader("abc.txt");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
    // we can also initialize in the other way also

//        BufferedReader bufferedReader = new BufferedReader(new FileReader("abc.txt"));
//
//
//        // it has a method readLine which returns string object based in calling
//
//        String str = bufferedReader.readLine();
//        while(str != null){
//            System.out.println(str) ;
//            str = bufferedReader.readLine();
//        }
//        bufferedReader.close();

        // this is the advantage of the bufferedReader adn buffered Writer
        // when we are closing buffered reader or writer the underlying writer
        // is also closed automatically , we no need to close explicitly



        // The next level writer is printwriter
        // this printwriter is most powerful writer in java , it is the most enhanced version of all those things
        // FileWriter ---> \n (limitation)
        // BufferedWriter ----> newLine() (more calling function )(only character data is allowed to write into the file )
        // PrintWriter  --> ( we can write any type of data into the file )

        // the another advantage is print and println are the two writers they define the which line to go

        // printwriter can communicate directly or indirectly with out the writer
        // eg. PrintWriter printWriter = new PrintWriter(String filename )
        // eg. PrintWriter printWriter = new PrintWriter(File file )
        // eg. PrintWriter printWriter = new PrintWriter(Writer  writer )




        // methods present in the PrintWriter\
        // we can write any type of the data like int , double , boolen String anything
         // write , flush , close , print , println all the methods
        //this in advantage of the print

//        PrintWriter printWriter = new PrintWriter("abc.txt");
//        printWriter.write(100);
//        printWriter.println(100);
//        printWriter.println("rishi");
//        printWriter.println(10.5);
//        printWriter.println("rishi is a good person ");
//        printWriter.flush();
//        printWriter.close();


        /**
           we have two Reader classes they are
           1. FileReader
           2. BufferedReader
           In these two reader we have to go only with the BufferedReader.
           because it is the most enhanced version of the reader classes
           In the Writer classes we have three classes they are :
          1. FileWriter
          2. BufferedWriter
          3. PrintWriter
          In these three classes  we have to use the PrintWriter ,
          because it has more advantages and enhancements


         */


        /**
        *
        * In the world we have two types of data they are
        * 1. Character data --> Reader and Writers
        *
        * 2. Binary data(videos , audios , images  ,files .etc ) --> Streams
        *   InputStream is used to read the binary data.
        *   OutputStream is used to  write the binary data.
         *
         *
                 *                                          Object
                 *     Writer(abstract class )       ----------                       Reader (abstract classs)
                 *     |                     |                  |                   |                      |
         *             |                     |                  |                   |                      |
         *             OutputStreamWriter   BufferedWriter     PrintWriter         InputStreamReader       BufferedReader
         *             |                                                             |
         *             |                                                             |
         *             FileWriter                                                    FileReader
         *
         *
         *
        * */


        // program to merge the data in the two files and write into third file
//        File file1 = new File("files","file1.txt") ;
//        File file2 = new File("files","file2.txt") ;
//
//
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
//        PrintWriter printWriter = new PrintWriter("file3.txt");
//
//        String line = bufferedReader.readLine();
//
//        while(line != null){
//            printWriter.println(line);
//            line = bufferedReader.readLine();
//        }
//
//        bufferedReader = new BufferedReader(new FileReader(file2));
//         line = bufferedReader.readLine();
//
//        while(line != null){
//            printWriter.println(line);
//            line = bufferedReader.readLine();
//        }
//
//        printWriter.flush();
//        bufferedReader.close();
//        printWriter.close();
//
//        System.out.println("loaded success fully ");



        // program to merge the two files as line by line alternatively

//        File file1 = new File("files","file1.txt") ;
//        File file2 = new File("files","file2.txt") ;
//
//        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
//        BufferedReader bufferedReader2=  new BufferedReader(new FileReader(file2));
//        PrintWriter printWriter  = new PrintWriter("file3.txt");
//
//
//        String line1 = bufferedReader1.readLine();
//        String line2 = bufferedReader2.readLine();
//        while((line1 != null ) && (line2 != null)){
//            printWriter.println(line1);
//            printWriter.println(line2);
//            line2 = bufferedReader2.readLine();
//            line1 = bufferedReader1.readLine();
//        }
//
//        while (line1 != null) {
//            printWriter.println(line1);
//            line1 = bufferedReader1.readLine();
//        }
//        while (line2 != null){
//            printWriter.println(line2);
//            line2 = bufferedReader2.readLine();
//        }
//
//        printWriter.flush();
//        printWriter.close();
//        bufferedReader1.close();
//        bufferedReader2.close();


        // program to merge all the files in a folder into one file

//        File directory = new File("files" ) ;
//        PrintWriter printWriter = new PrintWriter("file3.txt");
//        String[] list = directory.list();
//
//        for(String s : list){
//            File file = new File(directory , s);
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            String line = bufferedReader.readLine();
//            while(line != null){
//                printWriter.println(line);
//                line = bufferedReader.readLine();
//            }
//            bufferedReader.close();
//        }
//
//        printWriter.flush();
//        printWriter.close();


        // file extraction problem in java
        /// from the input.txt file we have remove the delete.txt numbers and add into another file

//        File directory = new File("inputoutput");
//
//        BufferedReader inputBufferedReader = new BufferedReader(new FileReader(new File(directory , "input.txt")));
//        BufferedReader removeBufferedReader = new BufferedReader(new FileReader(new File(directory , "remove.txt")));
//        PrintWriter printWriter = new PrintWriter("file3.txt");
//        ArrayList<String> removelist = new ArrayList<>();
//
//        String number = removeBufferedReader.readLine();
//        while (number  != null){
//            removelist.add(number);
//            number = removeBufferedReader.readLine();
//        }
//        removeBufferedReader.close();
//
//
//        number = inputBufferedReader.readLine();
//
//        while(number != null){
//            if(!removelist.contains(number)){
//                printWriter.println(number);
//            }
//            number = inputBufferedReader.readLine();
//        }
//
//        printWriter.flush();
//        printWriter.close();


        // program for filtering the unique numbers into the file


//        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("inputoutput" , "duplicateNumber.txt")));
//        PrintWriter printWriter = new PrintWriter("uniqueNumbers.txt");
//
//        String number = bufferedReader.readLine();
//
//        while(number != null ){
//            if (!isPresent(number)){
//                printWriter.println(number);
//                printWriter.flush();
//            }
//            number = bufferedReader.readLine();
//        }
//
//        printWriter.flush();
//        printWriter.close();
//        bufferedReader.close();

    }

    public static boolean isPresent(String number) throws  Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("uniqueNumbers.txt"));
        String line = bufferedReader.readLine();
         if(line == null)
             return false;
        ArrayList<String> list = new ArrayList<>();

        while(line != null){
            list.add(line);
            line = bufferedReader.readLine();
        }
        return list.contains(number);
    }


}
