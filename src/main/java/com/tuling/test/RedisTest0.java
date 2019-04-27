package com.tuling.test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;

/**
 * Create by IDEA
 * User:Songfelicity
 * Date:2019/4/27
 * Time:20:59
 */
public class RedisTest0 {
    public static void main(String[] args) {
        HostAndPort hostAndPort=new HostAndPort("127.0.0.1",6379);
        Jedis jedis=new Jedis();
        jedis.set("name","songxinfeng");
        String name=jedis.get("name");
        System.out.printf("name="+name);

        Jedis jedis1=new Jedis(hostAndPort);
        jedis1.set("name","SongXinfeng");
        String name1=jedis1.get("name");
        System.out.printf("name1="+name1);
    }
}
