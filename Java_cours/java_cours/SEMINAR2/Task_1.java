package SEMINAR2;

import java.io.*;

class main {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("note.txt");
              FileOutputStream fos = new FileOutputStream("new note.txt")) {
            byte[] buffer = new byte[256];
            fin.read(buffer);
            fos.write(buffer, 0,buffer.length);
            int i;
            while ((i = fin.read(buffer)) != -1) {
                fos.write(buffer,0,i);
                //System.out.print((char) i);

            }
            System.out.println((char)buffer[5]);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            // TODO: handle exception
        }
    }

}
