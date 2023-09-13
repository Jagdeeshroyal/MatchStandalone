package org.example;

import org.example.Model.Match;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        loadFiles();
    }


    public static void loadFiles() throws IOException {
        try {
            File[] files = new File("/Users/jagadeeshroyal/Downloads/all_male_csv").listFiles();
            System.out.println(files[0].getPath());
            updateMatch(files[0]);
        } catch (Exception e) {
            System.out.println("The exception is : " + e.getMessage());
        } finally {
            System.out.println("In finally");
        }

        {


        }
    }

    private static void updateMatch(File file) throws IOException {
        Match match = new Match();
        String[] teams = new String[2];
        boolean infoCompleted = false;
        List<String> i = Files.lines(Path.of(file.getPath())).map(x -> x.toString()).collect(Collectors.toList());//.forEach(System.out::println);
        for (String x : i) {
            String[] a = x.split(",");
            if (a[0].equals("info") && !infoCompleted) {
                if (a[1].equals("team")) {
                    if (match.getTeam() != null) {
                        match.setAgainst(a[2]);
                    } else {
                        match.setTeam(a[2]);
                    }
                } else if (a[1].equals("date")) {
                    match.setDate(a[2]);
                } else if (a[1].equals("event")) {
                    match.setEvent(a[2]);
                } else if (a[1].equals("city")) {
                    match.setCity(a[2]);
                } else if (a[1].equals("venue")) {
                    match.setVenue(a[2]);
                } else if (a[1].equals("toss_winner")) {
                    match.setToss(a[2]);
                } else if (a[1].equals("player_of_match")) {
                    match.setMvp(a[2]);
                } else if (a[1].equals("winner")) {
                    match.setWinner(a[2]);
                    infoCompleted = true;
                    break;
                }
            }
        }
        System.out.println(match.toString());

    }
}