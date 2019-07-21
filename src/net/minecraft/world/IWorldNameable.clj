(ns net.minecraft.world.IWorldNameable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world IWorldNameable]))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^IWorldNameable this]
    (-> this (.getName))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^IWorldNameable this]
    (-> this (.hasCustomName))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^IWorldNameable this]
    (-> this (.getDisplayName))))

