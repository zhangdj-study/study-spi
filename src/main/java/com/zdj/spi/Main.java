package com.zdj.spi;

import java.util.ServiceLoader;

/**
 * @author zhangdj
 * @date 2019/12/2
 */
public class Main {


    public static void main(String[] args) {
        ServiceLoader<ParseDoc> serviceLoader = ServiceLoader.load(ParseDoc.class);
        for (ParseDoc parse:serviceLoader) {
            parse.parse();
        }
    }
}
