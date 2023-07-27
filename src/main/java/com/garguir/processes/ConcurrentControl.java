package com.garguir.processes;

import com.garguir.processes.threads.ThreadEnhancedFor;
import com.garguir.processes.threads.ThreadFor;
import com.garguir.processes.threads.ThreadStream;
import com.garguir.processes.threads.ThreadStreamAnyMatch;
import com.garguir.processes.threads.ThreadWhile;

import java.util.logging.Logger;

public class ConcurrentControl {
    private static final Logger LOGGER = Logger.getLogger("Efficiency Control - Concurrent Control");

    public static void start(){
        LOGGER.info("Start -> Thread Stream start");
        ThreadStream threadStream = new ThreadStream();
        threadStream.start();
        LOGGER.info("Start -> Thread Stream end");

        LOGGER.info("Start -> ThreadWhile start");
        ThreadWhile threadWhile = new ThreadWhile();
        threadWhile.start();
        LOGGER.info("Start -> ThreadWhile end");

        LOGGER.info("Start -> ThreadFor start");
        ThreadFor threadFor = new ThreadFor();
        threadFor.start();
        LOGGER.info("Start -> ThreadFor end");

        LOGGER.info("Start -> ThreadEnhancedFor start");
        ThreadEnhancedFor threadEnhancedFor = new ThreadEnhancedFor();
        threadEnhancedFor.start();
        LOGGER.info("Start -> ThreadEnhancedFor end");

        LOGGER.info("Start -> Thread Stream Any Match start");
        ThreadStreamAnyMatch threadStreamAnyMatch = new ThreadStreamAnyMatch();
        threadStreamAnyMatch.start();
        LOGGER.info("Start -> Thread Stream Any Match end");


    }
}
