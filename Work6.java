package homework;

public class Work6 {
    public static void main(String[] args) {
        int s = 370_000;
        int sec, m, min, h;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        System.out.println(h + " часов " + min + " минут " + sec + " секунд ");
        int d, day, w, hour;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 24;
        w = (d - day) / 7;
        System.out.println(day + " дней " + w + " недель ");
    }
}
