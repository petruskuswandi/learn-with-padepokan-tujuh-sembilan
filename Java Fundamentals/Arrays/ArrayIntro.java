public class ArrayIntro {
    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        for (String p : planets) {
            System.out.println(p + "\t" + p.toUpperCase());
        }

        System.out.println();
        System.out.println("Akses nilai menggunakan indexing");
        System.out.println(planets[2]);
    }    
}
