class ConexoesUtil {
    public static Conexao configurar(Conexao conexao){
        conexao.setLogin("admin");
        conexao.setSenha("admin123");

        return conexao;
    }
}