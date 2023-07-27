package com.garguir;

import com.garguir.processes.SequentialControl;

import static com.garguir.processes.ConcurrentControl.start;

public class Main {

    public static void main(String[] args) {
        start();
        //SequentialControl.startProcess();
    }
}