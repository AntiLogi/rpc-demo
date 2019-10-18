package com.ayyovei.api.transport.rpc;

/**
 * @Description
 * @Author chenxiaobin
 * @Date 2019-10-18 11:14
 */
public class DefaultRequest implements Request {

    private String interfaceName;

    private String methodName;

    private Object[] argument;

    @Override
    public String getInterfaceName() {
        return interfaceName;
    }

    @Override
    public String getMethodName() {
        return methodName;
    }

    @Override
    public Object[] getArguments() {
        return argument;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public void setArgument(Object[] argument) {
        this.argument = argument;
    }
}
