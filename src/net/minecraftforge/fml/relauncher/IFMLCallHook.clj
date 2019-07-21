(ns net.minecraftforge.fml.relauncher.IFMLCallHook
  "This call hook allows for code to execute at the very early stages of
  minecraft initialization. FML uses it to validate that there is a
  safe environment for further loading of FML."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher IFMLCallHook]))

(defn inject-data
  "Injected with data from the FML environment:
   \"classLoader\" : The FML Class Loader

  data - `java.util.Map`"
  ([^IFMLCallHook this ^java.util.Map data]
    (-> this (.injectData data))))

