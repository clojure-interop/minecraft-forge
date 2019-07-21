(ns net.minecraft.client.gui.ChatLine
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui ChatLine]))

(defn ->chat-line
  "Constructor.

  update-counter-created-in - `int`
  line-string-in - `net.minecraft.util.text.ITextComponent`
  chat-line-id-in - `int`"
  (^ChatLine [^Integer update-counter-created-in ^net.minecraft.util.text.ITextComponent line-string-in ^Integer chat-line-id-in]
    (new ChatLine update-counter-created-in line-string-in chat-line-id-in)))

(defn get-chat-component
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ChatLine this]
    (-> this (.getChatComponent))))

(defn get-updated-counter
  "returns: `int`"
  (^Integer [^ChatLine this]
    (-> this (.getUpdatedCounter))))

(defn get-chat-line-id
  "returns: `int`"
  (^Integer [^ChatLine this]
    (-> this (.getChatLineID))))

