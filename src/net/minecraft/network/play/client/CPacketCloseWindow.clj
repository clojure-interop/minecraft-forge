(ns net.minecraft.network.play.client.CPacketCloseWindow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketCloseWindow]))

(defn ->c-packet-close-window
  "Constructor.

  window-id-in - `int`"
  (^CPacketCloseWindow [^Integer window-id-in]
    (new CPacketCloseWindow window-id-in))
  (^CPacketCloseWindow []
    (new CPacketCloseWindow )))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketCloseWindow this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketCloseWindow this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketCloseWindow this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

