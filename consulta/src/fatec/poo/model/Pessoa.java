package fatec.poo.model;

/* 
@authors Carlos,
@authors Gustavo,
@authors Nataly;
 */
public class Pessoa {

    private String cpf;
    private String nome;
    private String endereco;
    private String cidade;
    private String uf;
    private String cep;
    private String ddd;
    private String telefone;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public static boolean validarCPF(String CPF) {
        char primeiroChar;
        int[] arrayCPFInt = new int[11];
        int indiceCPFRepetido = 0;
        int somaCalcPrimeiroDigito = 0, somaCalcSegundoDigito = 0;
        int primeiroDigitoVerificador = 0, segundoDigitoVerificador = 0;

        CPF = CPF.replaceAll("[.-]", "");
        primeiroChar = CPF.charAt(0);

        while (indiceCPFRepetido < CPF.length() && CPF.charAt(indiceCPFRepetido) == primeiroChar) {
            indiceCPFRepetido++;
        }

        if (indiceCPFRepetido == CPF.length() || CPF.length() != 11) {
            return false;
        } else {
            for (int i = 0; i < arrayCPFInt.length; i++) {
                arrayCPFInt[i] = Character.getNumericValue(CPF.charAt(i));
            }

            for (int aux = 1, indice = 0; aux <= arrayCPFInt.length - 2; aux++, indice++) {
                somaCalcPrimeiroDigito += (arrayCPFInt[indice] * aux);
            }
            primeiroDigitoVerificador = somaCalcPrimeiroDigito % 11;
            if (primeiroDigitoVerificador == 10) {
                primeiroDigitoVerificador = 0;
            }

            for (int i = arrayCPFInt.length, x = 0; i >= 2; i--, x++) {
                somaCalcSegundoDigito += (arrayCPFInt[x] * i);
            }
            segundoDigitoVerificador = somaCalcSegundoDigito * 10 % 11;
            if (segundoDigitoVerificador == 10) {
                segundoDigitoVerificador = 0;
            }

            return (primeiroDigitoVerificador == arrayCPFInt[9] && segundoDigitoVerificador == arrayCPFInt[10]);
        }
    }
}
