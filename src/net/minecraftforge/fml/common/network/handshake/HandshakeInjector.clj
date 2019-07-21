(ns net.minecraftforge.fml.common.network.handshake.HandshakeInjector
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.handshake HandshakeInjector]))

(defn ->handshake-injector
  "Constructor.

  network-dispatcher - `net.minecraftforge.fml.common.network.handshake.NetworkDispatcher`"
  (^HandshakeInjector [^net.minecraftforge.fml.common.network.handshake.NetworkDispatcher network-dispatcher]
    (new HandshakeInjector network-dispatcher)))

(defn write
  "ctx - `io.netty.channel.ChannelHandlerContext`
  msg - `java.lang.Object`
  promise - `io.netty.channel.ChannelPromise`

  throws: java.lang.Exception"
  ([^HandshakeInjector this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Object msg ^io.netty.channel.ChannelPromise promise]
    (-> this (.write ctx msg promise))))

