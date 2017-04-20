package io.zhudy.opentracing.agent;

import java.lang.instrument.Instrumentation;

/**
 * @author Kevin Zou <kevinz@weghst.com>
 */
public class OpenTracingAgent {

    private static volatile Instrumentation instrumentation;

    /**
     * Allows the installation of this agent via a command line argument.
     *
     * @param agentArguments  The unused agent arguments.
     * @param instrumentation The instrumentation instance.
     */
    public static void premain(String agentArguments, Instrumentation instrumentation) {

    }

    /**
     * Allows the installation of this agent via the Attach API.
     *
     * @param agentArguments  The unused agent arguments.
     * @param instrumentation The instrumentation instance.
     */
    public static void agentmain(String agentArguments, Instrumentation instrumentation) {

    }

}
