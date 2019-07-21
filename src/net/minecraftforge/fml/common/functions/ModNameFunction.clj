(ns net.minecraftforge.fml.common.functions.ModNameFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.functions ModNameFunction]))

(defn ->mod-name-function
  "Constructor."
  (^ModNameFunction []
    (new ModNameFunction )))

(defn apply
  "input - `net.minecraftforge.fml.common.ModContainer`

  returns: `java.lang.String`"
  (^java.lang.String [^ModNameFunction this ^net.minecraftforge.fml.common.ModContainer input]
    (-> this (.apply input))))

