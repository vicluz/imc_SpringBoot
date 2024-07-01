package com.trabalho.trabalho.service;

import com.trabalho.trabalho.model.Pessoa;
import com.trabalho.trabalho.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa criarPessoa(Pessoa pessoa) {
        Double imc = calcularIMC(pessoa.getPeso(), pessoa.getAltura());
        pessoa.setImc(imc);
        pessoa.setClassificacaoIMC(classificarIMC(imc));
        return pessoaRepository.save(pessoa);
    }

    public Pessoa atualizarPessoa(Pessoa pessoa) {
        Double imc = calcularIMC(pessoa.getPeso(), pessoa.getAltura());
        pessoa.setImc(imc);
        pessoa.setClassificacaoIMC(classificarIMC(imc));
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> listarPessoas() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        for (Pessoa pessoa : pessoas) {
            pessoa.setClassificacaoIMC(classificarIMC(pessoa.getImc()));
        }
        return pessoas;
    }

    public Optional<Pessoa> buscarPessoaPorId(Long id) {
        return pessoaRepository.findById(id)
                .map(pessoa -> {
                    pessoa.setClassificacaoIMC(classificarIMC(pessoa.getImc()));
                    return pessoa;
                });
    }

    public void deletarPessoa(Long id) {
        pessoaRepository.deleteById(id);
    }

    public Double calcularIMC(Double peso, Double altura) {
        return peso / (altura * altura);
    }

    public String classificarIMC(Double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Acima do peso (sobrepeso)";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade II";
        } else {
            return "Obesidade III";
        }
    }
}
