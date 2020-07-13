/**
 * Demo class
 *
 * @author Sirius
 * @date 2020-06-27 22:12
 */
package com.sirius.tools;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Random;

public class PasswordProcessing {
    private static final String algorithm = "SHA1";
    private static final Charset charset = StandardCharsets.UTF_8;
    private static final String saltList = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    //  附加生成盐值功能，返回加盐后的hash值
    public HashMap<String, String> hash(String input) {

        if (input.isEmpty()) {
            return null;
        }
        HashMap<String, String> result = new HashMap<>();
        String salt = this.getSalt();
        String passwordWithSalt = input + salt;
        result.put("pw", this.getHash(passwordWithSalt));
        result.put("salt", salt);
        return result;
    }
    // 手动添加盐值，返回加盐后的hash
    public String hash(String input, String salt) {
        if (input.isEmpty() || salt.isEmpty()) {
            return null;
        }
        String passwordWithSalt = input + salt;
        return this.getHash(passwordWithSalt);
    }
    // 私有方法
    private String getSalt() {
        // 生成盐值
        StringBuilder salt = new StringBuilder();
        Random random = new Random();
        int saltListLength = saltList.length();
        for (int i = 0; i < 11; i++) {
            int choice = random.nextInt(saltListLength);
            char x = saltList.charAt(choice);
            salt.append(x);
        }
        return salt.toString();
    }
    // 私有方法
    private String getHash(String input) {
        MessageDigest hash = null;
        try {
            hash = MessageDigest.getInstance(algorithm);
            // 将字符串使用utf-8转换成bytes数组
            byte[] confirm = input.getBytes(charset);
            // 将上面生成的数组传入算法，生成消息摘要bytes数组，----------主算法1
            byte[] bytes = hash.digest(confirm);
            StringBuilder hashPassword = new StringBuilder();
            // 遍历消息摘要数组，将元素利用哈希算法转换成哈希值，生成一个字符串，这个字符串的长度为2
            for (byte b : bytes) {
                String temp = Integer.toHexString(b & 0xff);
                // 如果长度为1，前面加个0
                if (temp.length() == 1) {
                    temp = "0" + temp;
                }
                // 结果存入
                hashPassword.append(temp);


            }
            return hashPassword.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
