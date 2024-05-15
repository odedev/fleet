package dev.osmanthus.fleet.common.utils;

import cn.hutool.core.util.IdUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IdUtils {
    public static String getId() {
//        String id = getUUID();
        String id = getSnowflakeId();
//        id = getObjectID();
//        id = Strings.padStart(id, 32, '0');
        return id;
    }

    public static List<String> getIdList(Integer number) {
        List<String> ids = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            ids.add(getId());
        }
        return ids;
    }

    public static List<String> getIdList() {
        return getIdList(100);
    }

    public static String getUUID() {
        String uuid = String.valueOf(UUID.randomUUID());
        return uuid.replaceAll("-", "");
    }

    public static String getSnowflakeId() {
        return IdUtil.getSnowflakeNextIdStr();
    }

    public static String getObjectId() {
        return IdUtil.objectId();
    }

    public static String getNanoId() {
        return IdUtil.nanoId();
    }
}
