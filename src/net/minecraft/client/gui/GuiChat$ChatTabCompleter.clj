(ns net.minecraft.client.gui.GuiChat$ChatTabCompleter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiChat$ChatTabCompleter]))

(defn ->chat-tab-completer
  "Constructor.

  p-i-46749-1 - `net.minecraft.client.gui.GuiTextField`"
  (^GuiChat$ChatTabCompleter [^net.minecraft.client.gui.GuiTextField p-i-46749-1]
    (new GuiChat$ChatTabCompleter p-i-46749-1)))

(defn complete
  ""
  ([^GuiChat$ChatTabCompleter this]
    (-> this (.complete))))

(defn get-target-block-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^GuiChat$ChatTabCompleter this]
    (-> this (.getTargetBlockPos))))

