(ns net.minecraftforge.fml.common.asm.transformers.TerminalTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers TerminalTransformer]))

(defn ->terminal-transformer
  "Constructor."
  (^TerminalTransformer []
    (new TerminalTransformer )))

(defn transform
  "name - `java.lang.String`
  transformed-name - `java.lang.String`
  basic-class - `byte[]`

  returns: `byte[]`"
  ([^TerminalTransformer this ^java.lang.String name ^java.lang.String transformed-name basic-class]
    (-> this (.transform name transformed-name basic-class))))

