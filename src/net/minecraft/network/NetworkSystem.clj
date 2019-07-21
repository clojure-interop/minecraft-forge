(ns net.minecraft.network.NetworkSystem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network NetworkSystem]))

(defn ->network-system
  "Constructor.

  server - `net.minecraft.server.MinecraftServer`"
  (^NetworkSystem [^net.minecraft.server.MinecraftServer server]
    (new NetworkSystem server)))

(def *-server-nio-eventloop
  "Static Constant.

  type: net.minecraft.util.LazyLoadBase<io.netty.channel.nio.NioEventLoopGroup>"
  NetworkSystem/SERVER_NIO_EVENTLOOP)

(def *-server-epoll-eventloop
  "Static Constant.

  type: net.minecraft.util.LazyLoadBase<io.netty.channel.epoll.EpollEventLoopGroup>"
  NetworkSystem/SERVER_EPOLL_EVENTLOOP)

(def *-server-local-eventloop
  "Static Constant.

  type: net.minecraft.util.LazyLoadBase<io.netty.channel.local.LocalEventLoopGroup>"
  NetworkSystem/SERVER_LOCAL_EVENTLOOP)

(defn is-alive
  "Instance Field.

  type: volatile boolean"
  ([^NetworkSystem this]
    (-> this .-isAlive)))

(defn add-lan-endpoint
  "address - `java.net.InetAddress`
  port - `int`

  throws: java.io.IOException"
  ([^NetworkSystem this ^java.net.InetAddress address ^Integer port]
    (-> this (.addLanEndpoint address port))))

(defn add-local-endpoint
  "returns: `java.net.SocketAddress`"
  (^java.net.SocketAddress [^NetworkSystem this]
    (-> this (.addLocalEndpoint))))

(defn terminate-endpoints
  ""
  ([^NetworkSystem this]
    (-> this (.terminateEndpoints))))

(defn network-tick
  ""
  ([^NetworkSystem this]
    (-> this (.networkTick))))

(defn get-server
  "returns: `net.minecraft.server.MinecraftServer`"
  (^net.minecraft.server.MinecraftServer [^NetworkSystem this]
    (-> this (.getServer))))

