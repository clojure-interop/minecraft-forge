(ns net.minecraft.util.TabCompleter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util TabCompleter]))

(defn ->tab-completer
  "Constructor.

  text-field-in - `net.minecraft.client.gui.GuiTextField`
  has-target-block-in - `boolean`"
  (^TabCompleter [^net.minecraft.client.gui.GuiTextField text-field-in ^Boolean has-target-block-in]
    (new TabCompleter text-field-in has-target-block-in)))

(defn complete
  ""
  ([^TabCompleter this]
    (-> this (.complete))))

(defn get-target-block-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^TabCompleter this]
    (-> this (.getTargetBlockPos))))

(defn set-completions
  "new-compl - `java.lang.String`"
  ([^TabCompleter this ^java.lang.String new-compl]
    (-> this (.setCompletions new-compl))))

(defn reset-did-complete
  ""
  ([^TabCompleter this]
    (-> this (.resetDidComplete))))

(defn reset-requested
  ""
  ([^TabCompleter this]
    (-> this (.resetRequested))))

