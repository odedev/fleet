package dev.odes.fleet.common.utils;

import cn.hutool.core.util.IdUtil;
import com.google.common.base.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IDUtils {
    public static String getID() {
        String id = getUUID();
        id = getSnowflakeID();
//        id = getObjectID();
        id = Strings.padStart(id, 32, '0');
        return id;
    }

    public static List<String> getIDList(Integer number) {
        List<String> ids = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            ids.add(getID());
        }
        return ids;
    }

    public static List<String> getIDList() {
        return getIDList(100);
    }

    public static String getUUID() {
        String uuid = String.valueOf(UUID.randomUUID());
        return uuid.replaceAll("-", "");
    }

    public static String getSnowflakeID() {
        String id = "";
        id = IdUtil.getSnowflakeNextIdStr();
        return id;
    }

    public static String getObjectID() {
        String id = IdUtil.objectId();
        return id;
    }

    public static String getNanoID() {
        String id = IdUtil.nanoId();
        return id;
    }
}
