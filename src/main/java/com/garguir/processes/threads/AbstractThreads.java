package com.garguir.processes.threads;

import com.garguir.models.Person;
import com.garguir.models.Persons;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public abstract class AbstractThreads extends Thread{
    protected static final String EFFICIENCY_CONTROL = "Efficiency Control -> ";
    protected static final Logger LOGGER = Logger.getLogger(EFFICIENCY_CONTROL + "Concurrent Control");
    protected static final Person personToSearch = new Person();
    protected static final int QUANTITY = 50000000;
    protected static final int randomNumber = QUANTITY-1;
    protected static final String DOUBLE_LINE = "========================================================================================================================================================================";
    protected static final String SIMPLE_LINE = "------------------------------------------------------------------------------------";

    protected static Persons persons = new Persons();
    protected static final Lock lock = new ReentrantLock();
}
