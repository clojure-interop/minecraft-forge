(ns net.minecraft.network.play.server.SPacketChat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketChat]))

(defn ->s-packet-chat
  "Constructor.

  component-in - `net.minecraft.util.text.ITextComponent`
  type-in - `byte`"
  (^SPacketChat [^net.minecraft.util.text.ITextComponent component-in ^Byte type-in]
    (new SPacketChat component-in type-in))
  (^SPacketChat [^net.minecraft.util.text.ITextComponent component-in]
    (new SPacketChat component-in))
  (^SPacketChat []
    (new SPacketChat )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketChat this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketChat this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketChat this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-chat-component
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^SPacketChat this]
    (-> this (.getChatComponent))))

(defn system?
  "returns: `boolean`"
  (^Boolean [^SPacketChat this]
    (-> this (.isSystem))))

(defn get-type
  "returns: `byte`"
  (^Byte [^SPacketChat this]
    (-> this (.getType))))

