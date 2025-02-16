import java.util.ArrayList;

public class Kutubxona {
    public ArrayList<Kitob> kitoblar = new ArrayList<>();

    public void kitoblarniChiqarish() {
        System.out.println("Mavjud kitoblar ro'yxati: ");
        kitoblar.forEach(System.out::println);
    }

    public void kitobQoshish(Kitob kitob) {
        kitoblar.add(kitob);
    }

    public void ijara(Kitob kitob){
        if (kitoblar.contains(kitob)) {
            kitoblar.remove(kitob);
            System.out.println(kitob.getName() + " kitobi ijaraga berildi");
        }else {
            System.out.println("Bunday kitob mavjud emas");
        }
    }
}
