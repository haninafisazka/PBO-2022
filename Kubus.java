public class Kubus {
    int sisiKubus = 5;

    public Double hitungVolume() {
        Double volume = 0.0;
        Double volume = this.sisiKubus * this.sisiKubus * this.sisiKubus
        return volume;
    }

    public int hitungLuasPermukaan() {
        int luasPermukaan = 0;
        int luasPermukaan = (this.sisiKubus * this.sisiKubus) * 6
        return luasPermukaan;
    }


    /**
    * buat main method
    * buat objek dari class Kubus
    * tampilkan hasil perhitungan volume kubus
    * tampilkan hasil perhitungan luas permukaan kubus
    */
    public static void main (String[] args){
        Kubus kubus = new Kubus ();
        System.out.println("Sisi : "+Kubus.sisiKubus);
        System.out.println("Volume Kubus : "+Kubus.volume);
        System.out.println("Luas Permukaan Kubus : "+Kubus.luasPermukaan);
    }
}