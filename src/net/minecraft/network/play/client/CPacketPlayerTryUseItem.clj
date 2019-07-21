(ns net.minecraft.network.play.client.CPacketPlayerTryUseItem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketPlayerTryUseItem]))

(defn ->c-packet-player-try-use-item
  "Constructor.

  hand-in - `net.minecraft.util.EnumHand`"
  (^CPacketPlayerTryUseItem [^net.minecraft.util.EnumHand hand-in]
    (new CPacketPlayerTryUseItem hand-in))
  (^CPacketPlayerTryUseItem []
    (new CPacketPlayerTryUseItem )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayerTryUseItem this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayerTryUseItem this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketPlayerTryUseItem this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-hand
  "returns: `net.minecraft.util.EnumHand`"
  (^net.minecraft.util.EnumHand [^CPacketPlayerTryUseItem this]
    (-> this (.getHand))))

