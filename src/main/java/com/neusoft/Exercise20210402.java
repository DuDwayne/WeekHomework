package com.neusoft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  金融第一研发中心 每周一练（20210402）
 */
public class Exercise20210402 {

    /**
     * 背景描述:
     * 已知一个文件夹（C:\temp\），里面存放不定数量的dat文件。
     * 有一个固定的配置文件C:\test.xml，里面设置了想要读取的文件名（文件名是物理文件名，
     * 物理名的路径不是固定的，是未确定的，但是文件名的后最都是 .dat）。
     * xml里的文件名是按行保存的，每一行一个文件名（物理名）。可能路径不同，但是文件名本身一致的情况下，重复出现。
     * 注：想定的是已知文件夹里的文件数量肯定会比配置文件里指定的文件名的数量要多的多。
     * 需求:
     * 现在项目项目想要写一个共通函数，读入配置文件的内容（文件名），然后到已知的文件夹里寻找是否有匹配的文件，
     * 如果找到了就把xml的文件名（物理名）记录下来。最终结束的时候，一次性的输出这些被找到的文件的文件名（物理名）。
     * 注：因为是共通函数，需要考虑性能的问题，请大家写完后，对自己的代码，做一下调优，提高代码性能。
     */
    public static void findFiles(String xmlFilename){

        List<String> outputNames = new ArrayList<>();

        // 获取所有文件
        File dir = new File("C:\\temp\\");
        String[] children = dir.list();
        if (children == null) {
            System.out.println("该目录不存在");
        }
        else {
            // 读取配置文件中的名称
            File file = new File("C:\\files\\" + xmlFilename);

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String fName = line.trim();
                    String[] temp = fName.split("\\\\");
                    String fileName = temp[temp.length - 1];
                    // 判断文件名的文件是否存在
                    if (Arrays.asList(children).contains(fileName)) {
                        outputNames.add(fileName);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("存在的文件名如下：" + outputNames);

    }
}
