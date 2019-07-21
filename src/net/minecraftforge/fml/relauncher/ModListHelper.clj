(ns net.minecraftforge.fml.relauncher.ModListHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher ModListHelper]))

(defn ->mod-list-helper
  "Constructor."
  (^ModListHelper []
    (new ModListHelper )))

(def *-additional-mods
  "Static Constant.

  type: java.util.Map<java.lang.String,java.io.File>"
  ModListHelper/additionalMods)

