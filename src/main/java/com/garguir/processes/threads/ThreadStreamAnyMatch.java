package com.garguir.processes.threads;

import com.garguir.models.Person;

public class ThreadStreamAnyMatch extends AbstractThreads{
    private static final String THREAD_STREAM_ANY_MATCH = "Thread Stream Any Match";

    public ThreadStreamAnyMatch(){
    }

    @Override
    public void run(){
        LOGGER.info(EFFICIENCY_CONTROL + THREAD_STREAM_ANY_MATCH);
        long startTime = System.currentTimeMillis();
        Person person = persons.getPerson(randomNumber);
        personToSearch.setLastName(person.getLastName());
        personToSearch.setName(person.getName());

        Person personFound = persons.findPersonEnhancedFor(personToSearch);

        lock.lock();
        System.out.println(DOUBLE_LINE);
        System.out.println(EFFICIENCY_CONTROL + THREAD_STREAM_ANY_MATCH + " -> Searching: " + person);
        System.out.print(EFFICIENCY_CONTROL + THREAD_STREAM_ANY_MATCH + " -> ");
        if (personFound!=null) {
            System.out.print("Find with Stream Any Match in ");
        } else {
            System.out.print("Not found with Stream Any Match in ");
        }
        System.out.println(System.currentTimeMillis() - startTime + "ms");
        System.out.println(EFFICIENCY_CONTROL + THREAD_STREAM_ANY_MATCH + " -> Persona buscada en posición: " + randomNumber);
        System.out.println(personToSearch);
        System.out.println(EFFICIENCY_CONTROL + THREAD_STREAM_ANY_MATCH + " -> Persona encontrada: ");
        System.out.println(personFound);
        System.out.println(DOUBLE_LINE);
        lock.unlock();
    }
}
