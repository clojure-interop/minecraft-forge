(ns net.minecraftforge.classloading.FMLForgePlugin
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.classloading FMLForgePlugin]))

(defn ->fml-forge-plugin
  "Constructor."
  (^FMLForgePlugin []
    (new FMLForgePlugin )))

(defn *-runtime-deobf
  "Static Field.

  type: boolean"
  []
  FMLForgePlugin/RUNTIME_DEOBF)

(defn *-forge-location
  "Static Field.

  type: java.io.File"
  []
  FMLForgePlugin/forgeLocation)

(defn get-asm-transformer-class
  "Description copied from interface: IFMLLoadingPlugin

  returns: a list of classes that implements the IClassTransformer interface - `java.lang.String[]`"
  ([^FMLForgePlugin this]
    (-> this (.getASMTransformerClass))))

(defn get-mod-container-class
  "Description copied from interface: IFMLLoadingPlugin

  returns: `java.lang.String`"
  (^java.lang.String [^FMLForgePlugin this]
    (-> this (.getModContainerClass))))

(defn get-setup-class
  "Description copied from interface: IFMLLoadingPlugin

  returns: `java.lang.String`"
  (^java.lang.String [^FMLForgePlugin this]
    (-> this (.getSetupClass))))

(defn inject-data
  "Description copied from interface: IFMLLoadingPlugin

  data - `java.util.Map`"
  ([^FMLForgePlugin this ^java.util.Map data]
    (-> this (.injectData data))))

(defn get-access-transformer-class
  "Description copied from interface: IFMLLoadingPlugin

  returns: the name of an access transformer class or null if none is provided - `java.lang.String`"
  (^java.lang.String [^FMLForgePlugin this]
    (-> this (.getAccessTransformerClass))))

