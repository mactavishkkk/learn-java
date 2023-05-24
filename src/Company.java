
// Class
import collaborator.Collaborator;
import collaborator.Horly;
import collaborator.Monthly;
import collaborator.PayRoll;
import collaborator.Commissioned;

import java.util.List;

import collaborator.BaseCommissioned;

public class Company {

    public static void main(String... args) {
        Horly horista = new Horly("Avery Jordan", "Desenvolvimento", 75.5);
        horista.setHorasTrabalhadas(220);

        Commissioned comissionado = new Commissioned("Charlene Butler", "Comercial", 25);
        comissionado.setTotalVendas(350000);

        BaseCommissioned baseComissionado = new BaseCommissioned("Terrance Wallace", "Venda", 5, 3000);
        baseComissionado.setTotalVendas(150000);

        List<Collaborator> colaboradores = List.of(
                horista,
                new Monthly("Christian Cunningham", "Infraestrutura", 7000),
                new Monthly("Taylor Griffin", "Agile", 8500),
                comissionado,
                baseComissionado,
                new Monthly("Brennan Sims", "Engenharia", 15600));

        PayRoll folha = new PayRoll(colaboradores);
        folha.geraRelatorio();
    }
}
