package org.jenkinsci.plugins.workflow.steps;

import org.jenkinsci.remoting.SerializableOnlyOverRemoting;

@FunctionalInterface
public interface SerializableSupplier<T> extends SerializableOnlyOverRemoting {

    /**
     * Gets a result.
     *
     * @return a result
     */
    T get();
}

