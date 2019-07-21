(ns net.minecraftforge.fml.common.functions.ModIdFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.functions ModIdFunction]))

(defn ->mod-id-function
  "Constructor."
  (^ModIdFunction []
    (new ModIdFunction )))

(defn apply
  "container - `net.minecraftforge.fml.common.ModContainer`

  returns: `java.lang.String`"
  (^java.lang.String [^ModIdFunction this ^net.minecraftforge.fml.common.ModContainer container]
    (-> this (.apply container))))

