package com.shortlink.project.common.constant;

/**
 * Redis key 常量类
 */
public class RedisKeyConstant {

    /**
     * 短链接跳转前缀 Key
     */
    public static final String GOTO_SHORT_LINK_KEY = "short-link_goto_%s";

    /**
     * 短链接跳转锁前缀 Key
     */
    public static final String LOCK_GOTO_SHORT_LINK_KEY = "short-link_lock_goto_%s";

    /**
     * 短链接空值跳转前缀 Key
     */
    public static final String GOTO_IS_NULL_SHORT_LINK_KEY = "short-link_is-null_goto_%s";

    /**
     * 短链接统计前缀 Key
     */
    public static final String SHORT_LINK_STATS_STREAM_TOPIC_KEY = "short-link-stats-stream-topic";

    /**
     * 延迟队列统计 Key
     */
    public static final String DELAY_QUEUE_STATS_KEY = "delay-queue-stats";

    /**
     * 短链接幂等 Key
     */
    public static final String LOCK_GID_UPDATE_KEY = "short-link_lock_gid_update_%s";

    public static final String SHORT_LINK_STATS_STREAM_GROUP_KEY = "short-link-stats-stream-group";
}
