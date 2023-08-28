public class Main {
    public static void main(String[] args) {
        YouTubeConexao youTube = new YouTubeConexao();
        TikTokConexao tikTok = new TikTokConexao();
        TwitchConexao twitch = new TwitchConexao();

        Conexao conexaoYoutubeConfigurada = ConexoesUtil.configurar(youTube);
        //conexaoYoutubeConfigurada.setCanal("meucanal");

        Conexao conexaoTikTokConfigurada = ConexoesUtil.configurar(tikTok);
        //conexaoTikTokConfigurada.setUsuario("meuusuario");

        Conexao conexaoTwitchConfigurada = ConexoesUtil.configurar(twitch);
        //conexaoTwitchConfigurada.setStream("meustream");
    }
}
