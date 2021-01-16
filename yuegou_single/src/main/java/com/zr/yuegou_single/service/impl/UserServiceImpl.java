package com.zr.yuegou_single.service.impl;


import com.zr.yuegou_single.dto.ResultBean;
import com.zr.yuegou_single.pojo.User;
import com.zr.yuegou_single.service.UserService;
import com.zr.yuegou_single.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.concurrent.TimeUnit;

public class UserServiceImpl implements UserService {

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    // private UserMapper userMapper;

    @Override
    public User checkLogin(User user) {
        //登陆验证
        /*
        1.通过数据库查用户名，获得用户对象后，再验证密码
        2.直接在数据库验证密码  if-else ==> 设计模式： 策略模式
         */
        if(user!=null) {
      /*      //user1是从数据库查询后封装的对象
            User user1 = userMapper.selectByUsername(user.getUsername());
            if(user1!=null){
//               if(user.getPassword().equals(user1.getPassword())){
//                   return user1;
//               }
                boolean matches = encoder.matches(user.getPassword(), user1.getPassword());
                if(matches){
                    return user1;
                }

            }*/
        }

        return null;
    }


    //根据uuid去redis中查询用户对象
    @Override
    public ResultBean checkIsLogin(String uuid) {
        if(uuid!=null){
            //如果刚开始存数据时就设了序列化器，那么取的时候也要设序列化器
            redisTemplate.setKeySerializer(new StringRedisSerializer());
            String key = StringUtils.GenerateRedisKey(uuid);
            User user = (User) redisTemplate.opsForValue().get(key);
            if(user!=null){
                //如果redis中有对象存在，意味着用户已登录，那么要更新一下redis的该用户的超时时间。
                redisTemplate.expire(key,30, TimeUnit.MINUTES);
                //返回一个ResultBean
                return ResultBean.success(user,"当前用户已登录");
            }

        }
        return ResultBean.error("当前用户未登录");
    }

    /*
     注销
      */
    @Override
    public ResultBean logout(String uuid) {
        if(uuid!=null){
            //1.删除redis中的键值对
            //1.1 组织键
//            String  key = new StringBuilder().append(RedisConstant.userToken).append(uuid).toString();
            String key = StringUtils.GenerateRedisKey(uuid);
            redisTemplate.delete(key);

            return ResultBean.success("注销成功");
        }

        return ResultBean.error("用户未登录");
    }
}
