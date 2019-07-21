(ns net.minecraft.network.play.server.SPacketTitle
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketTitle]))

(defn ->s-packet-title
  "Constructor.

  type-in - `net.minecraft.network.play.server.SPacketTitle$Type`
  message-in - `net.minecraft.util.text.ITextComponent`
  fade-in-time-in - `int`
  display-time-in - `int`
  fade-out-time-in - `int`"
  (^SPacketTitle [^net.minecraft.network.play.server.SPacketTitle$Type type-in ^net.minecraft.util.text.ITextComponent message-in ^Integer fade-in-time-in ^Integer display-time-in ^Integer fade-out-time-in]
    (new SPacketTitle type-in message-in fade-in-time-in display-time-in fade-out-time-in))
  (^SPacketTitle [^Integer fade-in-time-in ^Integer display-time-in ^Integer fade-out-time-in]
    (new SPacketTitle fade-in-time-in display-time-in fade-out-time-in))
  (^SPacketTitle [^net.minecraft.network.play.server.SPacketTitle$Type type-in ^net.minecraft.util.text.ITextComponent message-in]
    (new SPacketTitle type-in message-in))
  (^SPacketTitle []
    (new SPacketTitle )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketTitle this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketTitle this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketTitle this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-type
  "returns: `net.minecraft.network.play.server.SPacketTitle$Type`"
  (^net.minecraft.network.play.server.SPacketTitle$Type [^SPacketTitle this]
    (-> this (.getType))))

(defn get-message
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^SPacketTitle this]
    (-> this (.getMessage))))

(defn get-fade-in-time
  "returns: `int`"
  (^Integer [^SPacketTitle this]
    (-> this (.getFadeInTime))))

(defn get-display-time
  "returns: `int`"
  (^Integer [^SPacketTitle this]
    (-> this (.getDisplayTime))))

(defn get-fade-out-time
  "returns: `int`"
  (^Integer [^SPacketTitle this]
    (-> this (.getFadeOutTime))))

