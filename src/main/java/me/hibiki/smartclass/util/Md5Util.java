package me.hibiki.smartclass.util;

import org.springframework.util.Assert;
import org.springframework.util.DigestUtils;

/**
 * @author 高弘昆
 * @date 2020/6/18 9:50
 */
public class Md5Util {
//    private final static String SALT = "ocjawiobnw0a4ue21jmvlksdmqd2d";

    public static String md5PasswordBySalt(String password) {
        return DigestUtils.md5DigestAsHex(password.getBytes());
//        return DigestUtils.md5DigestAsHex((SALT+password).getBytes());
    }

    public static void main(String[] args) {
        System.out.println(md5PasswordBySalt("王万利"));
    }
}
