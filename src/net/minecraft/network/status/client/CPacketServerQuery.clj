(ns net.minecraft.network.status.client.CPacketServerQuery
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.status.client CPacketServerQuery]))

(defn ->c-packet-server-query
  "Constructor."
  (^CPacketServerQuery []
    (new CPacketServerQuery )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketServerQuery this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketServerQuery this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.status.INetHandlerStatusServer`"
  ([^CPacketServerQuery this ^net.minecraft.network.status.INetHandlerStatusServer handler]
    (-> this (.processPacket handler))))

