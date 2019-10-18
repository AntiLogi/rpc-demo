package com.ayyovei.api.transport.handler;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;

/**
 * @Description
 * @Author chenxiaobin
 * @Date 2019-10-17 11:40
 */
public class NettyChannelHandler extends ChannelDuplexHandler {


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {


        super.channelRead(ctx, msg);
    }
}
