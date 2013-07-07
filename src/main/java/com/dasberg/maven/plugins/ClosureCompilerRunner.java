package com.dasberg.maven.plugins;

import com.google.javascript.jscomp.CommandLineRunner;

/**
 * ClosureCompilerRunner compiles the given file to the
 * target file.
 * @author mischa
 */
public class ClosureCompilerRunner extends CommandLineRunner {

    /**
     * Unprotect a protected constructor.
     */
    public ClosureCompilerRunner(final String[] args) {
        super(args);
    }
}
