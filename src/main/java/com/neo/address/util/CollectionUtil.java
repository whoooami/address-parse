package com.neo.address.util;

import java.util.Collection;

/**
 * Created by gameover on 2024/8/14.
 */
public class CollectionUtil {

    public static Boolean isEmpty(Collection<?> coll) {
        return coll == null || coll.size() == 0;
    }

    public static Boolean isNotEmpty(Collection<?> coll) {
        return !isEmpty(coll);
    }

    public static int size(Collection<?> coll) {
        return coll == null ? 0 : coll.size();
    }
}

