package com.demo.fileio;

import java.io.*;

public class IOdemo {

    public static void main(String[] args) throws IOException,ClassNotFoundException{
        System.err.println("error here");
        readSingleCharacter();
        readAllCharacters();
        writeSingleCharacter();
        writeSingleCharacters();
        readAllCharactersBuffer();
        WriteAllCharactersBuffer();
        CopyBuffer();
        CopyBufferWithSize();
        bufferedReadText();
        bufferedWriteText();
        doSerialization();
        doDeSerialization();

    }

    public static void readSingleCharacter() throws  IOException{
        try(FileInputStream in = new FileInputStream("com/demo/fileio/test.txt")){
            int by = in.read();
            System.out.println((char)by);
        }
    }

    public static void readAllCharacters() throws  IOException{
        try(FileInputStream in = new FileInputStream("com/demo/fileio/test.txt")){
            int in2 =0;
            while((in2=in.read())!=-1 ){
                System.out.print((char)in2);
            }
        }
    }

    public static void writeSingleCharacter() throws  IOException{
        try(FileOutputStream out = new FileOutputStream("com/demo/fileio/test2.txt")){
            out.write(65);
        }
    }

    public static void writeSingleCharacters() throws  IOException{
        try(FileOutputStream out = new FileOutputStream("com/demo/fileio/test3.txt")){
            String test5 = "Good test";
            out.write(test5.getBytes());
        }
    }

    // Reading/writing single bytes is highly ineffecient. Buffering needed.

    public static void readAllCharactersBuffer() throws  IOException{
        try(FileInputStream in = new FileInputStream("com/demo/fileio/test.txt");
            BufferedInputStream buf = new BufferedInputStream(in);
        ){
            // Decorator exception
            int r =0;
            while((r = buf.read()) != -1){
                System.out.print((char)r);
            }

        }
    }

    public static void WriteAllCharactersBuffer() throws  IOException{
        try(FileOutputStream out = new FileOutputStream("com/demo/fileio/test2.txt");
            BufferedOutputStream buf = new BufferedOutputStream(out);
        ){
            String test4 = "tes100";
            buf.write(test4.getBytes());
        }
    }

    public static void CopyBuffer() throws  IOException{
        try(
                FileInputStream in = new FileInputStream("com/demo/fileio/test.txt");
                BufferedInputStream inbuf = new BufferedInputStream(in);
                FileOutputStream out = new FileOutputStream("com/demo/fileio/test2.txt");
                BufferedOutputStream outbuf = new BufferedOutputStream(out);
        ){
            int r;
            while ((r = inbuf.read()) != -1){
                outbuf.write(r);
            }
        }
    }

    public static void CopyBufferWithSize() throws  IOException{
        try(
            FileInputStream in = new FileInputStream("com/demo/fileio/test.txt");
            BufferedInputStream inbuf = new BufferedInputStream(in);
            FileOutputStream out = new FileOutputStream("com/demo/fileio/test2.txt");
            BufferedOutputStream outbuf = new BufferedOutputStream(out);
        ){
            byte[] byteBuf = new byte[4000]; // buffer size
            int r;
            while ((r = inbuf.read(byteBuf)) != -1){
                outbuf.write(byteBuf,0,r);
            }
        }
    }

    // text reading (lines)
    public static void bufferedReadText() throws  IOException{
        StringBuilder text = new StringBuilder();
        text.append("\n");
        try(
                FileInputStream in = new FileInputStream("com/demo/fileio/para.txt");
                InputStreamReader ir = new InputStreamReader(in,"UTF-8");
                BufferedReader br = new BufferedReader(ir);
        ){
            String line;
            while((line = br.readLine())!=null){
                text.append(line).append("\n");
            }
            System.out.println(text);
        }
    }

    public static void bufferedWriteText() throws  IOException{
        StringBuilder text = new StringBuilder();
        text.append("\n");
        try(
                FileOutputStream out = new FileOutputStream("com/demo/fileio/para2.txt");
                OutputStreamWriter ir = new OutputStreamWriter(out,"UTF-8");
                BufferedWriter br = new BufferedWriter(ir);
        ){
            String test ="It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-les" +
                    "s normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English.";
            br.write('c');
            br.write(test);
        }
    }

    public static void doSerialization() throws IOException{
        SerializableDemo sd = new SerializableDemo();
        sd.setName("SerializeThis");
        System.out.println("Before ser name "+ sd.getName());
        System.out.println("Before ser Id "+ sd.getId());
        try(FileOutputStream out = new FileOutputStream("com/demo/fileio/serual.ser");
            BufferedOutputStream bf = new BufferedOutputStream(out);
            ObjectOutputStream out2 = new ObjectOutputStream(bf);
        ){
            out2.writeObject(sd);
        }

    }

    public static void doDeSerialization() throws IOException,ClassNotFoundException{
        try(FileInputStream in = new FileInputStream("com/demo/fileio/serual.ser");
            BufferedInputStream bf = new BufferedInputStream(in);
            ObjectInputStream in2 = new ObjectInputStream(bf);
        ){
             SerializableDemo sd = (SerializableDemo) in2.readObject(); // will raise invalid exception when class evolves.

            System.out.println("After ser name "+ sd.getName());
            System.out.println("After ser Id "+ sd.getId());
        }
    }

}
