package org.example.Model;

public class Match {
    private String team;
    private String Against;
    private String event;
    private String date;
    private String Venue;
    private String city;
    private String toss;
    private String mvp;
    private String winner;

    public Match() {
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getAgainst() {
        return Against;
    }

    public void setAgainst(String against) {
        Against = against;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getVenue() {
        return Venue;
    }

    public void setVenue(String venue) {
        Venue = venue;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getToss() {
        return toss;
    }

    public void setToss(String toss) {
        this.toss = toss;
    }

    public String getMvp() {
        return mvp;
    }

    public void setMvp(String mvp) {
        this.mvp = mvp;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Match{" +
                "team='" + team + '\'' +
                ", Against='" + Against + '\'' +
                ", event='" + event + '\'' +
                ", date='" + date + '\'' +
                ", Venue='" + Venue + '\'' +
                ", city='" + city + '\'' +
                ", toss='" + toss + '\'' +
                ", mvp='" + mvp + '\'' +
                ", winner='" + winner + '\'' +
                '}';
    }
}
