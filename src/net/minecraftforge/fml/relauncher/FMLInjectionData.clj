(ns net.minecraftforge.fml.relauncher.FMLInjectionData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher FMLInjectionData]))

(defn ->fml-injection-data
  "Constructor."
  (^FMLInjectionData []
    (new FMLInjectionData )))

(def *-containers
  "Static Constant.

  type: java.util.List<java.lang.String>"
  FMLInjectionData/containers)

(defn *data
  "returns: `java.lang.Object[]`"
  ([]
    (FMLInjectionData/data )))

