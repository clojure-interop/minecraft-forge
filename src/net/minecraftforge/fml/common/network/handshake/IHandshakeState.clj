(ns net.minecraftforge.fml.common.network.handshake.IHandshakeState
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.handshake IHandshakeState]))

(defn accept
  "ctx - `io.netty.channel.ChannelHandlerContext`
  msg - `net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage`

  returns: `S`"
  ([^IHandshakeState this ^io.netty.channel.ChannelHandlerContext ctx ^net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage msg]
    (-> this (.accept ctx msg))))

