package com.epam.deltix.gradle.plugins.velocity

/**
 * Created by PastushenyaV on 7/26/2016.
 */
class VelocityEntry {
    final String name
    String from
    String to           //can be with parameters @{param_name}
    List<Map> contexts

    VelocityEntry(String name) {
        this.name = name
    }

    String toString() {
        return String.format('%s: %s %s %s', name, from, to, contexts)
    }
}