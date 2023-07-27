package com.garguir.processes.threads;

import com.garguir.models.Person;

public class ThreadStream extends AbstractThreads{
    private static final String THREAD_STREAM = "Thread Stream";

    public ThreadStream(){
    }

    @Override
    public void run(){
        LOGGER.info(EFFICIENCY_CONTROL + THREAD_STREAM);
        long startTime = System.currentTimeMillis();
        Person person = persons.getPerson(randomNumber);
        personToSearch.setLastName(person.getLastName());
        personToSearch.setName(person.getName());

        Person personFound = persons.findPersonEnhancedFor(personToSearch);

        lock.lock();
        System.out.println(DOUBLE_LINE);
        System.out.println(EFFICIENCY_CONTROL + THREAD_STREAM + " -> Searching: " + person);
        System.out.print(EFFICIENCY_CONTROL + THREAD_STREAM + " -> ");
        if (personFound!=null) {
            System.out.print("Find with Stream in ");
        } else {
            System.out.print("Not found with Stream in ");
        }
        System.out.println(System.currentTimeMillis() - startTime + "ms");
        System.out.println(EFFICIENCY_CONTROL + THREAD_STREAM + " -> Persona buscada en posición: " + randomNumber);
        System.out.println(personToSearch);
        System.out.println(EFFICIENCY_CONTROL + THREAD_STREAM + " -> Persona encontrada: ");
        System.out.println(personFound);
        System.out.println(DOUBLE_LINE);
        lock.unlock();
    }
}
