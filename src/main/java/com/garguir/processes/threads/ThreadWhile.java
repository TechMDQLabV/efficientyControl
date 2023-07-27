package com.garguir.processes.threads;

import com.garguir.models.Person;

public class ThreadWhile extends AbstractThreads{
    private static final String THREAD_WHILE = "Thread While";

    public ThreadWhile(){
    }

    @Override
    public void run(){
        LOGGER.info(EFFICIENCY_CONTROL + THREAD_WHILE);
        long startTime = System.currentTimeMillis();
        Person person = persons.getPerson(randomNumber);
        personToSearch.setLastName(person.getLastName());
        personToSearch.setName(person.getName());

        Person personFound = persons.findPersonWhile(personToSearch);

        lock.lock();
        System.out.println(DOUBLE_LINE);
        System.out.println(EFFICIENCY_CONTROL + THREAD_WHILE + " -> Searching: " + person);
        System.out.print(EFFICIENCY_CONTROL + THREAD_WHILE + " -> ");
        if (personFound!=null) {
            System.out.print("Find with While in ");
        } else {
            System.out.print("Not found with While in ");
        }
        System.out.println(EFFICIENCY_CONTROL + THREAD_WHILE + " -> " + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println(EFFICIENCY_CONTROL + THREAD_WHILE + " -> Persona buscada en posición: " + randomNumber);
        System.out.println(personToSearch);
        System.out.println(EFFICIENCY_CONTROL + THREAD_WHILE + " -> Persona encontrada: ");
        System.out.println(personFound);
        System.out.println(DOUBLE_LINE);
        lock.unlock();
    }
}
