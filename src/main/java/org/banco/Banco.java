package org.banco;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Banco {

    private String nome;

    private List<Conta> contas = new ArrayList<>();

    public List<Cliente> listarClientes() {
        List<Cliente> contasClientes = new ArrayList<>();
        for (Conta conta : contas) {
            Cliente cliente = conta.getCliente();
            if (cliente != null) {
                contasClientes.add(cliente);
            } else {
                System.out.println("Conta sem cliente: " + conta);
            }
        }
        return contasClientes;
    }
}