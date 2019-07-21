(ns net.minecraft.network.play.server.SPacketCloseWindow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketCloseWindow]))

(defn ->s-packet-close-window
  "Constructor.

  window-id-in - `int`"
  (^SPacketCloseWindow [^Integer window-id-in]
    (new SPacketCloseWindow window-id-in))
  (^SPacketCloseWindow []
    (new SPacketCloseWindow )))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketCloseWindow this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketCloseWindow this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketCloseWindow this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

