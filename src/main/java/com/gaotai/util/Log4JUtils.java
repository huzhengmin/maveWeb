package com.gaotai.util;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author： hzm
 * @date： 2021/3/11 16:51
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public   class Log4JUtils {
    private static Logger logger_ = LogManager.getLogger(Log4JUtils.class);
    public static void logDebug (String s)
    {
        try {
             int i = 1/0;
        }
        catch (Exception e)
        {
        logger_.debug(s,e);
        }

    }
    public static void logInfo (String s)
    {
        logger_.info(s );

    }
    public static void logWarn (String s)
    {
        logger_.warn(s );

    }
    public static void main(String[] args) {
        logDebug("ERROR:200");
        logInfo("Info:200");
        logWarn("Warn:2012");
    }
}
