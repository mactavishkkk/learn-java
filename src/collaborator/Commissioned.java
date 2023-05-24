package collaborator;

public class Commissioned extends Collaborator {
    private double totalVendas;
    private double comissao;

    public Commissioned(String nome, String departamento, double comissao) {
        super(nome, departamento);
        this.comissao = comissao;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return this.totalVendas;
    }

    public double getComissao() {
        return this.comissao;
    }

    public double salario() {
        return this.totalVendas * (this.comissao / 100.);
    }

    @Override
    public String toString() {
        return String.format("%s\nTotal de Vendas: %s\nComissão por Venda: %.2f\nSalário: %.2f",
                super.toString(), this.getTotalVendas(), this.getComissao(), this.salario());
    }

}
