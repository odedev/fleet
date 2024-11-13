package dev.osmanthus.fleet.common.crypto;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AES {
    //密钥 (需要前端和后端保持一致)十六位作为密钥
    private static final String KEY = "fleeeeeeeeeeeeet";
    //密钥偏移量 (需要前端和后端保持一致)十六位作为密钥偏移量
    private static final String IV = "fleetttttttttttt";
    //算法
    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static final Charset CHARSET = StandardCharsets.UTF_8;

    public static String encrypt(String src) {
        try {
            byte[] byteSrc = Base64.getDecoder().decode(src);

            IvParameterSpec ivParameterSpec = new IvParameterSpec(IV.getBytes(CHARSET));

            SecretKeySpec secretKeySpec = new SecretKeySpec(KEY.getBytes(CHARSET), ALGORITHM);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
            byte[] dst = cipher.doFinal(byteSrc);
            return Base64.getEncoder().encodeToString(dst);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String decrypt(String src) {
        try {
            byte[] byteSrc = Base64.getDecoder().decode(src);

            IvParameterSpec ivParameterSpec = new IvParameterSpec(IV.getBytes(CHARSET));

            SecretKeySpec secretKeySpec = new SecretKeySpec(KEY.getBytes(CHARSET), ALGORITHM);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
            byte[] dst = cipher.doFinal(byteSrc);
            return new String(dst, CHARSET);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static byte[] encrypt(byte[] src) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(IV.getBytes(CHARSET));

            SecretKeySpec secretKeySpec = new SecretKeySpec(KEY.getBytes(CHARSET), ALGORITHM);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(src);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static byte[] decrypt(byte[] src) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(IV.getBytes(CHARSET));

            SecretKeySpec secretKeySpec = new SecretKeySpec(KEY.getBytes(CHARSET), ALGORITHM);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(src);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
