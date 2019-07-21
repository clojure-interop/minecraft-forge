(ns net.minecraft.network.status.server.SPacketServerInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.status.server SPacketServerInfo]))

(defn ->s-packet-server-info
  "Constructor.

  response-in - `net.minecraft.network.ServerStatusResponse`"
  (^SPacketServerInfo [^net.minecraft.network.ServerStatusResponse response-in]
    (new SPacketServerInfo response-in))
  (^SPacketServerInfo []
    (new SPacketServerInfo )))

(def *-gson
  "Static Constant.

  type: com.google.gson.Gson"
  SPacketServerInfo/GSON)

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketServerInfo this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketServerInfo this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.status.INetHandlerStatusClient`"
  ([^SPacketServerInfo this ^net.minecraft.network.status.INetHandlerStatusClient handler]
    (-> this (.processPacket handler))))

(defn get-response
  "returns: `net.minecraft.network.ServerStatusResponse`"
  (^net.minecraft.network.ServerStatusResponse [^SPacketServerInfo this]
    (-> this (.getResponse))))

