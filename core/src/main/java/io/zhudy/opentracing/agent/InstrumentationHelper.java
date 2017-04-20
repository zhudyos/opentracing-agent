package io.zhudy.opentracing.agent;

import java.lang.instrument.Instrumentation;

/**
 * @author Kevin Zou <kevinz@weghst.com>
 */
public final class InstrumentationHelper {

    static volatile Instrumentation instrumentation;

    /**
     * @return
     */
    public static Instrumentation getInstrumentation() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("getInstrumentation"));
        }

        if (instrumentation == null) {
            throw new IllegalStateException("instrumentation 未初始化");
        }
        return instrumentation;
    }
}
