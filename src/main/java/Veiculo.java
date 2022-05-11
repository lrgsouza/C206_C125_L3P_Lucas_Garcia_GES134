public abstract class Veiculo implements Comparable<Veiculo> {
    public String marca;
    public double VelMedia;

    public Veiculo(String marca, double VelMedia) {
        this.marca = marca;
        this.VelMedia = VelMedia;
    }

    @Override
    public int compareTo(Veiculo o) {
        return Double.compare(o.VelMedia,this.VelMedia);
    }
}
