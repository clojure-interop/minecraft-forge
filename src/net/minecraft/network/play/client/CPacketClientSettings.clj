(ns net.minecraft.network.play.client.CPacketClientSettings
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketClientSettings]))

(defn ->c-packet-client-settings
  "Constructor.

  lang-in - `java.lang.String`
  render-distance-in - `int`
  chat-visibility-in - `net.minecraft.entity.player.EntityPlayer$EnumChatVisibility`
  chat-colors-in - `boolean`
  model-parts-in - `int`
  main-hand-in - `net.minecraft.util.EnumHandSide`"
  (^CPacketClientSettings [^java.lang.String lang-in ^Integer render-distance-in ^net.minecraft.entity.player.EntityPlayer$EnumChatVisibility chat-visibility-in ^Boolean chat-colors-in ^Integer model-parts-in ^net.minecraft.util.EnumHandSide main-hand-in]
    (new CPacketClientSettings lang-in render-distance-in chat-visibility-in chat-colors-in model-parts-in main-hand-in))
  (^CPacketClientSettings []
    (new CPacketClientSettings )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketClientSettings this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketClientSettings this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketClientSettings this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-lang
  "returns: `java.lang.String`"
  (^java.lang.String [^CPacketClientSettings this]
    (-> this (.getLang))))

(defn get-chat-visibility
  "returns: `net.minecraft.entity.player.EntityPlayer$EnumChatVisibility`"
  (^net.minecraft.entity.player.EntityPlayer$EnumChatVisibility [^CPacketClientSettings this]
    (-> this (.getChatVisibility))))

(defn colors-enabled?
  "returns: `boolean`"
  (^Boolean [^CPacketClientSettings this]
    (-> this (.isColorsEnabled))))

(defn get-model-part-flags
  "returns: `int`"
  (^Integer [^CPacketClientSettings this]
    (-> this (.getModelPartFlags))))

(defn get-main-hand
  "returns: `net.minecraft.util.EnumHandSide`"
  (^net.minecraft.util.EnumHandSide [^CPacketClientSettings this]
    (-> this (.getMainHand))))

