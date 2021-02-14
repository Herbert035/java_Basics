package org.example.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author matao
 * @date 2021-02-03 22:10
 * @description
 */
public class HashMap_praactice {

    public static void main(String[] args) {
        Map map = new HashMap();

        map.put(null,"333");
        map.put(null,null);
        System.out.println(map.get(null));
    }
}
