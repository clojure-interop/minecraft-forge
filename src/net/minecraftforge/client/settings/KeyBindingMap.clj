(ns net.minecraftforge.client.settings.KeyBindingMap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.settings KeyBindingMap]))

(defn ->key-binding-map
  "Constructor."
  (^KeyBindingMap []
    (new KeyBindingMap )))

(defn lookup-active
  "key-code - `int`

  returns: `net.minecraft.client.settings.KeyBinding`"
  (^net.minecraft.client.settings.KeyBinding [^KeyBindingMap this ^Integer key-code]
    (-> this (.lookupActive key-code))))

(defn lookup-all
  "key-code - `int`

  returns: `java.util.List<net.minecraft.client.settings.KeyBinding>`"
  (^java.util.List [^KeyBindingMap this ^Integer key-code]
    (-> this (.lookupAll key-code))))

(defn add-key
  "key-code - `int`
  key-binding - `net.minecraft.client.settings.KeyBinding`"
  ([^KeyBindingMap this ^Integer key-code ^net.minecraft.client.settings.KeyBinding key-binding]
    (-> this (.addKey key-code key-binding))))

(defn remove-key
  "key-binding - `net.minecraft.client.settings.KeyBinding`"
  ([^KeyBindingMap this ^net.minecraft.client.settings.KeyBinding key-binding]
    (-> this (.removeKey key-binding))))

(defn clear-map
  ""
  ([^KeyBindingMap this]
    (-> this (.clearMap))))

