(ns net.minecraftforge.client.event.ClientChatReceivedEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event ClientChatReceivedEvent]))

(defn ->client-chat-received-event
  "Constructor.

  type - `byte`
  message - `net.minecraft.util.text.ITextComponent`"
  (^ClientChatReceivedEvent [^Byte type ^net.minecraft.util.text.ITextComponent message]
    (new ClientChatReceivedEvent type message)))

(defn get-message
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ClientChatReceivedEvent this]
    (-> this (.getMessage))))

(defn set-message
  "message - `net.minecraft.util.text.ITextComponent`"
  ([^ClientChatReceivedEvent this ^net.minecraft.util.text.ITextComponent message]
    (-> this (.setMessage message))))

(defn get-type
  "Introduced in 1.8:
   0 : Standard Text Message
   1 : 'System' message, displayed as standard text.
   2 : 'Status' message, displayed above action bar, where song notifications are.

  returns: `byte`"
  (^Byte [^ClientChatReceivedEvent this]
    (-> this (.getType))))

