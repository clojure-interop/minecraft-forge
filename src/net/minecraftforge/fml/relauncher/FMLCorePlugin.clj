(ns net.minecraftforge.fml.relauncher.FMLCorePlugin
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher FMLCorePlugin]))

(defn ->fml-core-plugin
  "Constructor."
  (^FMLCorePlugin []
    (new FMLCorePlugin )))

(defn get-asm-transformer-class
  "Description copied from interface: IFMLLoadingPlugin

  returns: a list of classes that implements the IClassTransformer interface - `java.lang.String[]`"
  ([^FMLCorePlugin this]
    (-> this (.getASMTransformerClass))))

(defn get-access-transformer-class
  "Description copied from interface: IFMLLoadingPlugin

  returns: the name of an access transformer class or null if none is provided - `java.lang.String`"
  (^java.lang.String [^FMLCorePlugin this]
    (-> this (.getAccessTransformerClass))))

(defn get-mod-container-class
  "Description copied from interface: IFMLLoadingPlugin

  returns: `java.lang.String`"
  (^java.lang.String [^FMLCorePlugin this]
    (-> this (.getModContainerClass))))

(defn get-setup-class
  "Description copied from interface: IFMLLoadingPlugin

  returns: `java.lang.String`"
  (^java.lang.String [^FMLCorePlugin this]
    (-> this (.getSetupClass))))

(defn inject-data
  "Description copied from interface: IFMLLoadingPlugin

  data - `java.util.Map`"
  ([^FMLCorePlugin this ^java.util.Map data]
    (-> this (.injectData data))))

