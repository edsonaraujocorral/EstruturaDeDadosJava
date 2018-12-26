package Code;

/**
 * @author Edson
 */

/*
   Para um bom estilo:
   Organizar as classes conforme a seguinte ordem:
      1. Constantes;
      2. variaveis de instancias;
      3. construtores.
      4. metodos
 */
public class Student {
   //Constantes
   public static final int MIN_CREDITS = 12;
   public static final int MAX_CREDITS = 24;
   public static final int FRESHMAN = 1;
   public static final int SOPHOMORE = 2;
   public static final int JUNIOR = 3;
   public static final int SENIOR = 4;

   //Variaveis de instancia
   private String nome;
   private String ra;
   private String curso;
   private String cpf;
   private String telefone;

   //Construtores
   /**
    * Construtir e inicializar as variaveis de instancias
    * @param nome
    * @param ra
    * @param curso
    * @param cpf
    * @param telefone
    */
   public Student(String nome, String ra, String curso, String cpf, String telefone) {
      this.nome = nome;
      this.ra = ra;
      this.curso = curso;
      this.cpf = cpf;
      this.telefone = telefone;
   }
   //Construtor padra
   public Student(){}

   //Metodos
   //Getters
   /**
    * Metodos getters
    * @return nome
    * @return ra
    * @return curso
    * @return cpf
    * @return telefone
    */
   public String getNome() { return this.nome; }
   public String getRA() { return this.ra; }
   public String getCurso() { return this.curso; }
   public String getCpf() { return this.cpf; }
   public String getTelefone() { return this.telefone; }

   /**
    * Metodo setDados() permite inserir novos dados no objeto..
    * @param nome
    * @param ra
    * @param curso
    * @param cpf
    * @param telefone
    */
   public void setDados(String nome, String ra, String curso, String cpf, String telefone) {
      this.nome = nome;
      this.ra = ra;
      this.curso = curso;
      this.cpf = cpf;
      this.telefone = telefone;
   }

}
