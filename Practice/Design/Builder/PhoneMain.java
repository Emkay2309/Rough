package Practice.Design.Builder;

public class PhoneMain {
    public static void main(String[] args) {
        Phone p = Phone.builder().id(1).Processor("i7").Company("Apple").Os("15").Ram("").build();
        System.out.println(p);
    }
}
