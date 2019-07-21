(ns net.minecraftforge.fml.relauncher.IFMLLoadingPlugin
  "The base plugin that provides class name meta information to FML to
  enhance the classloading lifecycle for mods in FML"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher IFMLLoadingPlugin]))

(defn get-asm-transformer-class
  "Return a list of classes that implements the IClassTransformer interface

  returns: a list of classes that implements the IClassTransformer interface - `java.lang.String[]`"
  ([^IFMLLoadingPlugin this]
    (-> this (.getASMTransformerClass))))

(defn get-mod-container-class
  "Return a class name that implements \"ModContainer\" for injection into the mod list
   The \"getName\" function should return a name that other mods can, if need be,
   depend on.
   Trivially, this modcontainer will be loaded before all regular mod containers,
   which means it will be forced to be \"immutable\" - not susceptible to normal
   sorting behaviour.
   All other mod behaviours are available however- this container can receive and handle
   normal loading events

  returns: `java.lang.String`"
  (^java.lang.String [^IFMLLoadingPlugin this]
    (-> this (.getModContainerClass))))

(defn get-setup-class
  "Return the class name of an implementor of \"IFMLCallHook\", that will be run, in the
   main thread, to perform any additional setup this coremod may require. It will be
   run prior to Minecraft starting, so it CANNOT operate on minecraft
   itself. The game will deliberately crash if this code is detected to trigger a
   minecraft class loading
   TODO: implement crash ;)

  returns: `java.lang.String`"
  (^java.lang.String [^IFMLLoadingPlugin this]
    (-> this (.getSetupClass))))

(defn inject-data
  "Inject coremod data into this coremod
   This data includes:
   \"mcLocation\" : the location of the minecraft directory,
   \"coremodList\" : the list of coremods
   \"coremodLocation\" : the file this coremod loaded from,

  data - `java.util.Map`"
  ([^IFMLLoadingPlugin this ^java.util.Map data]
    (-> this (.injectData data))))

(defn get-access-transformer-class
  "Return an optional access transformer class for this coremod. It will be injected post-deobf
   so ensure your ATs conform to the new srgnames scheme.

  returns: the name of an access transformer class or null if none is provided - `java.lang.String`"
  (^java.lang.String [^IFMLLoadingPlugin this]
    (-> this (.getAccessTransformerClass))))

