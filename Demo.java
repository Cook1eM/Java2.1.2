public class Demo {
    public static void main(String[] args) {
        int amount = 5200;
        int client = 100;
        client = client + amount;
        if (amount > 1000){
            int bonus = amount / 100;
            client = client + bonus;
            System.out.println(client);
        }


    }
}
