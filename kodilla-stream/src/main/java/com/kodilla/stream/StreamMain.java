package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println("Poem beautifier");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Eci Peci" , (poem) -> poem + 123);
        poemBeautifier.beautify("Eci Peci" , (poem) -> poem.toLowerCase());
        poemBeautifier.beautify("Eci Peci" , (poem) -> poem.toUpperCase());
        poemBeautifier.beautify("Eci Peci" , (poem) -> "AA" + poem + "BB");
        System.out.println("");

        Forum theForum = new Forum();
        LocalDate now = LocalDate.now();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getPostCount() > 0)
                .filter(forumUser -> LocalDate.from(forumUser.getBirthDate()).until(LocalDate.now(), ChronoUnit.YEARS) >= 20)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));


        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);



    }
}