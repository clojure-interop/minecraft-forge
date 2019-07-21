(ns net.minecraftforge.fml.common.FMLContainerHolder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common FMLContainerHolder]))

(defn get-fml-container
  "returns: `net.minecraftforge.fml.common.ModContainer`"
  (^net.minecraftforge.fml.common.ModContainer [^FMLContainerHolder this]
    (-> this (.getFMLContainer))))

