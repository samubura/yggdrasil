package ro.andreiciortea.yggdrasil.http;

import org.apache.http.HttpStatus;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;

public class HttpServerVerticle extends AbstractVerticle {

  public static final String DEFAULT_HOST = "localhost";
  public static final int DEFAULT_PORT = 8080;
  
  @Override
  public void start() {
    HttpServer server = vertx.createHttpServer();
    
    String host = DEFAULT_HOST;
    int port = DEFAULT_PORT;
    JsonObject httpConfig = config().getJsonObject("http-config");
    
    if (httpConfig != null) {
      port = httpConfig.getInteger("port", DEFAULT_PORT);
      host = httpConfig.getString("host", DEFAULT_HOST);
    }
    
    Router router = createRouter();
    server.requestHandler(router::accept).listen(port, host);        
  }
  
  private Router createRouter() {
    Router router = Router.router(vertx);
    
    router.route().handler(BodyHandler.create());
    
    router.get("/").handler((routingContext) -> {
      routingContext.response()
        .setStatusCode(HttpStatus.SC_OK)
        .end("Yggdrasil v0.0");
    });
    
    HttpEntityHandler handler = new HttpEntityHandler();
    
    router.get("/environments/:envid").handler(handler::handleGetEntity);
    router.post("/environments/").handler(handler::handleCreateEntity);
    router.put("/environments/:envid").handler(handler::handleUpdateEntity);
    router.delete("/environments/:envid").handler(handler::handleDeleteEntity);

    router.get("/workspaces/:wkspid").handler(handler::handleGetEntity);
    router.post("/workspaces/").handler(handler::handleCreateEntity);
    router.put("/workspaces/:wkspid").handler(handler::handleUpdateEntity);
    router.delete("/workspaces/:wkspid").handler(handler::handleDeleteEntity);
    
    router.get("/artifacts/:artid").handler(handler::handleGetEntity);
    router.post("/artifacts/").handler(handler::handleCreateEntity);
    router.put("/artifacts/:artid").handler(handler::handleUpdateEntity);
    router.delete("/artifacts/:artid").handler(handler::handleDeleteEntity);
    
    router.post("/hub/").handler(handler::handleEntitySubscription);
    
    return router;
  }
}
