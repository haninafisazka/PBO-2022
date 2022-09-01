public class Kubus {
    Double sisiKubus = 5;

    public Double hitungVolume() {
        Double volume = 0.0;
        volume = this.sisiKubus * this.sisiKubus * this.sisiKubus;
        return volume;
    }

    public Double hitungLuasPermukaan() {
        Double luasPermukaan = 0.0;
        luasPermukaan = (this.sisiKubus * this.sisiKubus) * 6;
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
        System.out.println("Sisi : "+kubus.sisiKubus);
        System.out.println("Volume Kubus : "+kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus : "+kubus.hitungLuasPermukaan());
    }
}