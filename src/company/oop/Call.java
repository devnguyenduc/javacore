package company.oop;

import java.time.LocalDate;
import java.time.LocalTime;

public class Call {
    private Integer id;
    private LocalDate date;
    private LocalTime time;
    private String dialedPhoneNumber ;
    private Double duration;

    public Call(Integer id, LocalDate date, LocalTime time, String dialedPhoneNumber, Double duration) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.dialedPhoneNumber = dialedPhoneNumber;
        this.duration = duration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDialedPhoneNumber() {
        return dialedPhoneNumber;
    }

    public void setDialedPhoneNumber(String dialedPhoneNumber) {
        this.dialedPhoneNumber = dialedPhoneNumber;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Call{" +
                "id=" + id +
                ", date=" + date +
                ", time=" + time +
                ", dialedPhoneNumber='" + dialedPhoneNumber + '\'' +
                ", duration=" + duration +
                '}';
    }

    public void Print(){
        System.out.println(toString());
    }
}
