import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;;
public class EmbeddedJettyMain {
	public static void main(String[] args) throws Exception {
		Server server = new Server(8080);
		ServletContextHandler handler = new ServletContextHandler(server, "/example");
		System.out.println(handler);
	}
	
}
