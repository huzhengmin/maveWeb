package com.gaotai;

import org.apache.commons.lang.StringUtils;
/**
 * @author： hzm
 * @date： 2021/2/26 17:08
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class StringUitlsTemp {
    public static void main(String[] args) {

        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty(" "));
        System.out.println("________________________");
        System.out.println(StringUtils.isNotEmpty(null));
        System.out.println(StringUtils.isNotEmpty(""));
        System.out.println(StringUtils.isNotEmpty(" "));
    }
}
