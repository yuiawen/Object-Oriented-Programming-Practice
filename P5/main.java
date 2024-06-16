import jurusan.prodi_s1;
import jurusan.prodi_d3;

public class main {
    public static void main(String[] args) {
        System.out.println("====== Program Studi/Jurusan ======");
        prodi_s1 prodiS1 = new prodi_s1();
        prodiS1.isiProdi();
        System.out.println();
        prodi_d3 prodiD3 = new prodi_d3();
        prodiD3.isiProdi();
    }
}