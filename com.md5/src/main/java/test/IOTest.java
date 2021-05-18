package test;


import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

public class IOTest {

    @Test
    public void test1() {
        // 读取字符文件
        // 1 创建流对象, 建立通道
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("文件名");
            // 2 通过通道对象处理数据,如果是读read,如果是写write
            int ch;
            while ((ch = fileReader.read()) != -1){
                System.out.print((char)ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //3 关闭流
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }

}
