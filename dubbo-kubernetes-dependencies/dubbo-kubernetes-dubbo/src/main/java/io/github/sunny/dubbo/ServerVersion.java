/**
 * Copyright(C) 2019 Hangzhou zhaoyunxing Technology Co., Ltd. All rights reserved.
 */
package io.github.sunny.dubbo;

/**
 * @author zhaoyunxing
 * @date: 2019-12-24 23:23
 */
public class ServerVersion {
    private ServerVersion() {
    }

    /**
     * Return the full version string of the present oss starter codebase, or {@code null}
     * if it cannot be determined.
     *
     * @return the version of oss starter or {@code null}
     * @see Package#getImplementationVersion()
     */
    public static String getVersion() {
        Package pkg = ServerVersion.class.getPackage();
        return (pkg != null) ? pkg.getImplementationVersion() : null;
    }

    /**
     * 获取名称
     *
     * @return
     */
    public static String getName() {
        Package pkg = ServerVersion.class.getPackage();
        return (pkg != null) ? pkg.getImplementationTitle() : null;
    }
}
