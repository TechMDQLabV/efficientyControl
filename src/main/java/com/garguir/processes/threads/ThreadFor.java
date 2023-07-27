package com.garguir.processes.threads;

import com.garguir.models.Person;

public class ThreadFor extends AbstractThreads{
    private static final String THREAD_FOR = "Thread For";

    public ThreadFor(){
    }

    @Override
    public void run(){
        LOGGER.info(EFFICIENCY_CONTROL + THREAD_FOR);
        long startTime = System.currentTimeMillis();
        Person person = persons.getPerson(randomNumber);
        personToSearch.setLastName(person.getLastName());
        personToSearch.setName(person.getName());

        Person personFound = persons.findPersonFor(personToSearch);

        lock.lock();
        System.out.println(DOUBLE_LINE);
        System.out.println(EFFICIENCY_CONTROL + THREAD_FOR + " -> Searching: " + person);
        System.out.print(EFFICIENCY_CONTROL + THREAD_FOR + " -> ");
        if (personFound!=null) {
            System.out.print("Find with For in ");
        } else {
            System.out.print("Not found with For in ");
        }
        System.out.println(System.currentTimeMillis() - startTime + "ms");
        System.out.println(EFFICIENCY_CONTROL + THREAD_FOR + " -> Persona buscada en posición: " + randomNumber);
        System.out.println(personToSearch);
        System.out.println(EFFICIENCY_CONTROL + THREAD_FOR + " -> Persona encontrada: ");
        System.out.println(personFound);
        System.out.println(DOUBLE_LINE);
        lock.unlock();
    }
}
