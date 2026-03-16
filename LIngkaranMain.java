
// public class LIngkaranMain{
// public static void main(String[] args){
// lingkaran l = new lingkaran(3);
//  l.setTinggi(10);
// l.displayMessage();
// lingkaran l2 = new lingkaran(4, 10); l2.displayMessage(); }
// }

public class LIngkaranMain {

    public static void main(String[] args){

        lingkaran l = new lingkaran(3);
        l.setTinggi(10);
        l.displayMessage();

        lingkaran l2 = new lingkaran(4, 10);
        l2.displayMessage();

        // objek dengan constructor String
        lingkaran Lstring = new lingkaran("5", "8");
        Lstring.displayMessage();

    }
}