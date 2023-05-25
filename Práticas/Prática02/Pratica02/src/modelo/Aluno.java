
package modelo;

import java.util.Scanner;

        class Aluno {
            int ra;
            String nome;
            String genero;
            String rg;
            String cpf;
            DataNasc data;

        public int getRa() {
            return ra;
        }

        public void setRa(int ra) {
            this.ra = ra;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getRg() {
            return rg;
        }

        public void setRg(String rg) {
            this.rg = rg;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public DataNasc getData() {
            return data;
        }

        public void setData(DataNasc data) {
            this.data = data;
        }

        public Aluno(int ra, String nome, String genero, String rg, String cpf, DataNasc data) {
            this.ra = ra;
            this.nome = nome;
            this.genero = genero;
            this.rg = rg;
            this.cpf = cpf;
            this.data = data;
        }
        
        public void imprimirAluno() {
                System.out.println("R.A.: " + ra);
                System.out.println("Nome: " + nome);
                System.out.println("Genero: " + genero);
                System.out.println("R.G.: " + rg);
                System.out.println("CPF: " + cpf);
                System.out.println("Data de nascimento (dia/mes/ano) : " + data.getDataFormatada());
        }
                  
}
