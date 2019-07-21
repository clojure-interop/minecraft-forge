(ns net.minecraftforge.fml.common.asm.FMLSanityChecker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm FMLSanityChecker]))

(defn ->fml-sanity-checker
  "Constructor."
  (^FMLSanityChecker []
    (new FMLSanityChecker )))

(defn *-fml-location
  "Static Field.

  type: java.io.File"
  []
  FMLSanityChecker/fmlLocation)

(defn call
  "returns: `java.lang.Void`

  throws: java.lang.Exception"
  (^java.lang.Void [^FMLSanityChecker this]
    (-> this (.call))))

(defn inject-data
  "Description copied from interface: IFMLCallHook

  data - `java.util.Map`"
  ([^FMLSanityChecker this ^java.util.Map data]
    (-> this (.injectData data))))

