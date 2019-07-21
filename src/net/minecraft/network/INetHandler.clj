(ns net.minecraft.network.INetHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network INetHandler]))

(defn on-disconnect
  "reason - `net.minecraft.util.text.ITextComponent`"
  ([^INetHandler this ^net.minecraft.util.text.ITextComponent reason]
    (-> this (.onDisconnect reason))))

