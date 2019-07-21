(ns net.minecraft.network.play.server.SPacketWindowProperty
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketWindowProperty]))

(defn ->s-packet-window-property
  "Constructor.

  window-id-in - `int`
  property-in - `int`
  value-in - `int`"
  (^SPacketWindowProperty [^Integer window-id-in ^Integer property-in ^Integer value-in]
    (new SPacketWindowProperty window-id-in property-in value-in))
  (^SPacketWindowProperty []
    (new SPacketWindowProperty )))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketWindowProperty this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketWindowProperty this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketWindowProperty this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-window-id
  "returns: `int`"
  (^Integer [^SPacketWindowProperty this]
    (-> this (.getWindowId))))

(defn get-property
  "returns: `int`"
  (^Integer [^SPacketWindowProperty this]
    (-> this (.getProperty))))

(defn get-value
  "returns: `int`"
  (^Integer [^SPacketWindowProperty this]
    (-> this (.getValue))))

