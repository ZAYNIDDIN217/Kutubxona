
public class Main {
    public static void main(String[] args) {
        Kutubxona kutubxona = new Kutubxona();
        Kitob birinchiKitob = new Kitob("Raqamlar uchun yaralgan idrok", "Barbara Oukli");
        Kitob ikkinchiKitob = new Kitob("Mantiqiy xato", "Bo Bennet");
        Kitob uchinchiKitob = new Kitob("Jimjitlik", "Said Ahmad");
        Kitob tortinchiKitob = new Kitob("Makro moliya", "Sattor Arman");
        kutubxona.kitobQoshish(birinchiKitob);
        kutubxona.kitobQoshish(ikkinchiKitob);
        kutubxona.kitobQoshish(uchinchiKitob);
        kutubxona.kitoblarniChiqarish();
        System.out.println();
        kutubxona.ijara(birinchiKitob);
        System.out.println();
        kutubxona.ijara(birinchiKitob);
        System.out.println();
        kutubxona.kitoblarniChiqarish();
        System.out.println();
        kutubxona.ijara(new Kitob("Mantiqiy xato", "Bo Bennet"));
        kutubxona.kitoblarniChiqarish();
    }
}