(ns net.minecraft.network.handshake.INetHandlerHandshakeServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.handshake INetHandlerHandshakeServer]))

(defn process-handshake
  "packet-in - `net.minecraft.network.handshake.client.C00Handshake`"
  ([^INetHandlerHandshakeServer this ^net.minecraft.network.handshake.client.C00Handshake packet-in]
    (-> this (.processHandshake packet-in))))

