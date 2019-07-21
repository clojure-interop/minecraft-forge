(ns net.minecraftforge.fml.relauncher.ServerLaunchWrapper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher ServerLaunchWrapper]))

(defn *main
  "args - `java.lang.String[]`"
  ([args]
    (ServerLaunchWrapper/main args)))

