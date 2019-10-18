package com.ayyovei.api.transport.rpc;

/**
 * @Description
 * @Author chenxiaobin
 * @Date 2019-10-18 10:51
 */
public interface Request {

    String getInterfaceName();

    String getMethodName();

    Object[] getArguments();



}
