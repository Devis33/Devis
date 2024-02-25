import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data diri
        System.out.print("nama: ");
        String nama = scanner.nextLine();

        System.out.print(" jenis kelamin(P/L): ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = jenisKelaminInput.equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan";

        System.out.print("tanggal lahir (yyyy-mm-dd): ");
        String tanggalLahirInput = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        // Menghitung umur
        LocalDate currentDate = LocalDate.now();
        int umur = Period.between(tanggalLahir, currentDate).getYears();

        // Output data diri
        System.out.println("\n--- Data Diri ---");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}
