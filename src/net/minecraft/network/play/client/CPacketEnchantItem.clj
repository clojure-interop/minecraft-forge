(ns net.minecraft.network.play.client.CPacketEnchantItem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketEnchantItem]))

(defn ->c-packet-enchant-item
  "Constructor.

  window-id-in - `int`
  button-in - `int`"
  (^CPacketEnchantItem [^Integer window-id-in ^Integer button-in]
    (new CPacketEnchantItem window-id-in button-in))
  (^CPacketEnchantItem []
    (new CPacketEnchantItem )))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketEnchantItem this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketEnchantItem this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketEnchantItem this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-window-id
  "returns: `int`"
  (^Integer [^CPacketEnchantItem this]
    (-> this (.getWindowId))))

(defn get-button
  "returns: `int`"
  (^Integer [^CPacketEnchantItem this]
    (-> this (.getButton))))

