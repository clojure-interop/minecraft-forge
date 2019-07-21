(ns net.minecraftforge.event.ServerChatEvent
  "ServerChatEvent is fired whenever a C01PacketChatMessage is processed.
  This event is fired via ForgeHooks.onServerChatEvent(NetHandlerPlayServer, String, ITextComponent),
  which is executed by the NetHandlerPlayServer.processChatMessage(CPacketChatMessage)

  username contains the username of the player sending the chat message.
  message contains the message being sent.
  player the instance of EntityPlayerMP for the player sending the chat message.
  component contains the instance of ChatComponentTranslation for the sent message.

  This event is Cancelable.
  If this event is canceled, the chat message is never distributed to all clients.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge#EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event ServerChatEvent]))

(defn ->server-chat-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayerMP`
  message - `java.lang.String`
  component - `net.minecraft.util.text.ITextComponent`"
  (^ServerChatEvent [^net.minecraft.entity.player.EntityPlayerMP player ^java.lang.String message ^net.minecraft.util.text.ITextComponent component]
    (new ServerChatEvent player message component)))

(defn set-component
  "e - `net.minecraft.util.text.ITextComponent`"
  ([^ServerChatEvent this ^net.minecraft.util.text.ITextComponent e]
    (-> this (.setComponent e))))

(defn get-component
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ServerChatEvent this]
    (-> this (.getComponent))))

(defn get-message
  "returns: `java.lang.String`"
  (^java.lang.String [^ServerChatEvent this]
    (-> this (.getMessage))))

(defn get-username
  "returns: `java.lang.String`"
  (^java.lang.String [^ServerChatEvent this]
    (-> this (.getUsername))))

(defn get-player
  "returns: `net.minecraft.entity.player.EntityPlayerMP`"
  (^net.minecraft.entity.player.EntityPlayerMP [^ServerChatEvent this]
    (-> this (.getPlayer))))

