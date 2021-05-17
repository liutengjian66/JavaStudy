package com.liu.IO.OtherStream;

import java.io.*;
import java.util.Date;

public class ObjectTest {
    public static void main(String[] args) {
        try (  ByteArrayOutputStream baos=new ByteArrayOutputStream();
               ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(baos));
               ){

            oos.writeObject("字符串");
            oos.writeObject(new Date());

            oos.flush();
            byte[] datas = baos.toByteArray();

            ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
            Object str = ois.readObject();
            Object date=ois.readObject();

            if (str instanceof String){
                String msg=(String)str;
                System.out.println(msg);
            }
            if (date instanceof Date){
                Date d=(Date)date;
                System.out.println(d);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
