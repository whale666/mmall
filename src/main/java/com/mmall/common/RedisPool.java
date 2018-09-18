package com.mmall.common;

import redis.clients.jedis.JedisPool;

/**
 * @Description:mmall
 * @TODO:
 * @Author: ZJZ
 * @Date: 2018/06/07 14:21
 * @version: V1.0
 */
public class RedisPool {
    private static JedisPool pool;//jedis连接池
    private static Integer maxTotal;
}
