(ns net.minecraftforge.fml.common.Loader
  "The loader class performs the actual loading of the mod code from disk.


  There are several LoaderStates to mod loading, triggered in two
  different stages from the FML handler code's hooks into the minecraft code.



  LOADING. Scanning the filesystem for mod containers to load (zips, jars,
  directories), adding them to the modClassLoader Scanning, the loaded
  containers for mod classes to load and registering them appropriately.
  PREINIT. The mod classes are configured, they are sorted into a load
  order, and instances of the mods are constructed.
  INIT. The mod instances are initialized. For BaseMod mods, this involves
  calling the load method.
  POSTINIT. The mod instances are post initialized. For BaseMod mods this
  involves calling the modsLoaded method.
  UP. The Loader is complete
  ERRORED. The loader encountered an error during the LOADING phase and
  dropped to this state instead. It will not complete loading from this state,
  but it attempts to continue loading before abandoning and giving a fatal
  error.


  Phase 1 code triggers the LOADING and PREINIT states. Phase 2 code triggers
  the INIT and POSTINIT states."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common Loader]))

(def *-mc-version
  "Static Constant.

  type: java.lang.String"
  Loader/MC_VERSION)

(defn java-8
  "Instance Constant.

  type: boolean"
  (^Boolean [^Loader this]
    (-> this .-java8)))

(defn *instance
  "returns: `net.minecraftforge.fml.common.Loader`"
  (^net.minecraftforge.fml.common.Loader []
    (Loader/instance )))

(defn *inject-data
  "data - `java.lang.Object`"
  ([^java.lang.Object data]
    (Loader/injectData data)))

(defn *mod-loaded?
  "Query if we know of a mod named modname

  modname - `java.lang.String`

  returns: If the mod is loaded - `boolean`"
  (^Boolean [^java.lang.String modname]
    (Loader/isModLoaded modname)))

(defn get-mod-object-list
  "returns: `com.google.common.collect.BiMap<net.minecraftforge.fml.common.ModContainer,java.lang.Object>`"
  (^com.google.common.collect.BiMap [^Loader this]
    (-> this (.getModObjectList))))

(defn get-mc-version-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Loader this]
    (-> this (.getMCVersionString))))

(defn initialize-mods
  ""
  ([^Loader this]
    (-> this (.initializeMods))))

(defn fire-remap-event
  "remap-blocks - `java.util.Map`
  remap-items - `java.util.Map`
  is-freezing - `boolean`"
  ([^Loader this ^java.util.Map remap-blocks ^java.util.Map remap-items ^Boolean is-freezing]
    (-> this (.fireRemapEvent remap-blocks remap-items is-freezing))))

(defn get-callable-crash-information
  "returns: `net.minecraftforge.fml.common.ICrashCallable`"
  (^net.minecraftforge.fml.common.ICrashCallable [^Loader this]
    (-> this (.getCallableCrashInformation))))

(defn get-indexed-mod-list
  "returns: `java.util.Map<java.lang.String,net.minecraftforge.fml.common.ModContainer>`"
  (^java.util.Map [^Loader this]
    (-> this (.getIndexedModList))))

(defn get-mod-class-loader
  "returns: `net.minecraftforge.fml.common.ModClassLoader`"
  (^net.minecraftforge.fml.common.ModClassLoader [^Loader this]
    (-> this (.getModClassLoader))))

(defn active-mod-container
  "returns: `net.minecraftforge.fml.common.ModContainer`"
  (^net.minecraftforge.fml.common.ModContainer [^Loader this]
    (-> this (.activeModContainer))))

(defn runtime-disable-mod
  "mod-id - `java.lang.String`"
  ([^Loader this ^java.lang.String mod-id]
    (-> this (.runtimeDisableMod mod-id))))

(defn has-reached-state?
  "state - `net.minecraftforge.fml.common.LoaderState`

  returns: `boolean`"
  (^Boolean [^Loader this ^net.minecraftforge.fml.common.LoaderState state]
    (-> this (.hasReachedState state))))

(defn in-state?
  "state - `net.minecraftforge.fml.common.LoaderState`

  returns: `boolean`"
  (^Boolean [^Loader this ^net.minecraftforge.fml.common.LoaderState state]
    (-> this (.isInState state))))

(defn get-mod-list
  "returns: `java.util.List<net.minecraftforge.fml.common.ModContainer>`"
  (^java.util.List [^Loader this]
    (-> this (.getModList))))

(defn setup-test-harness
  "Used to setup a testharness with a single dummy mod instance for use with various testing hooks

  containers - A list of dummy containers that will be returned as \"active\" for all queries - `net.minecraftforge.fml.common.ModContainer`"
  ([^Loader this ^net.minecraftforge.fml.common.ModContainer containers]
    (-> this (.setupTestHarness containers))))

(defn compute-dependencies
  "dependency-string - `java.lang.String`
  requirements - `java.util.Set`
  dependencies - `java.util.List`
  dependants - `java.util.List`"
  ([^Loader this ^java.lang.String dependency-string ^java.util.Set requirements ^java.util.List dependencies ^java.util.List dependants]
    (-> this (.computeDependencies dependency-string requirements dependencies dependants))))

(defn preinitialize-mods
  ""
  ([^Loader this]
    (-> this (.preinitializeMods))))

(defn get-loader-state
  "returns: `net.minecraftforge.fml.common.LoaderState`"
  (^net.minecraftforge.fml.common.LoaderState [^Loader this]
    (-> this (.getLoaderState))))

(defn get-mcp-version-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Loader this]
    (-> this (.getMCPVersionString))))

(defn server-started
  ""
  ([^Loader this]
    (-> this (.serverStarted))))

(defn get-fml-version-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Loader this]
    (-> this (.getFMLVersionString))))

(defn server-stopping
  ""
  ([^Loader this]
    (-> this (.serverStopping))))

(defn get-mod-state
  "selected-mod - `net.minecraftforge.fml.common.ModContainer`

  returns: `net.minecraftforge.fml.common.LoaderState$ModState`"
  (^net.minecraftforge.fml.common.LoaderState$ModState [^Loader this ^net.minecraftforge.fml.common.ModContainer selected-mod]
    (-> this (.getModState selected-mod))))

(defn get-fml-branding-properties
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^Loader this]
    (-> this (.getFMLBrandingProperties))))

(defn loading-complete
  ""
  ([^Loader this]
    (-> this (.loadingComplete))))

(defn server-stopped
  ""
  ([^Loader this]
    (-> this (.serverStopped))))

(defn get-config-dir
  "returns: `java.io.File`"
  (^java.io.File [^Loader this]
    (-> this (.getConfigDir))))

(defn fire-missing-mapping-event
  "Fire a FMLMissingMappingsEvent to let mods determine how blocks/items defined in the world
   save, but missing from the runtime, are to be handled.

  missing-blocks - Map containing the missing block names with their associated id. Remapped blocks will be removed from it. - `java.util.Map`
  missing-items - Map containing the missing block names with their associated id. Remapped items will be removed from it. - `java.util.Map`
  is-local-world - Whether this is executing for a world load (local/server) or a client. - `boolean`
  remap-blocks - Returns a map containing the remapped block names and an array containing the original and new id for the block. - `java.util.Map`
  remap-items - Returns a map containing the remapped item names and an array containing the original and new id for the item. - `java.util.Map`

  returns: List with the names of the failed remappings. - `java.util.List<java.lang.String>`"
  (^java.util.List [^Loader this ^java.util.Map missing-blocks ^java.util.Map missing-items ^Boolean is-local-world ^java.util.Map remap-blocks ^java.util.Map remap-items]
    (-> this (.fireMissingMappingEvent missing-blocks missing-items is-local-world remap-blocks remap-items))))

(defn server-starting
  "server - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Loader this ^java.lang.Object server]
    (-> this (.serverStarting server))))

(defn get-custom-mod-properties
  "mod-id - `java.lang.String`

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^Loader this ^java.lang.String mod-id]
    (-> this (.getCustomModProperties mod-id))))

(defn get-crash-information
  "returns: `java.lang.String`"
  (^java.lang.String [^Loader this]
    (-> this (.getCrashInformation))))

(defn get-minecraft-mod-container
  "returns: `net.minecraftforge.fml.common.MinecraftDummyContainer`"
  (^net.minecraftforge.fml.common.MinecraftDummyContainer [^Loader this]
    (-> this (.getMinecraftModContainer))))

(defn load-mods
  "Called from the hook to start mod loading. We trigger the
   #identifyMods() and Constructing, Preinitalization, and Initalization phases here. Finally,
   the mod list is frozen completely and is consider immutable from then on.

  injected-mod-containers - containers to inject - `java.util.List`"
  ([^Loader this ^java.util.List injected-mod-containers]
    (-> this (.loadMods injected-mod-containers))))

(defn server-about-to-start
  "server - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Loader this ^java.lang.Object server]
    (-> this (.serverAboutToStart server))))

(defn get-active-mod-list
  "returns: `java.util.List<net.minecraftforge.fml.common.ModContainer>`"
  (^java.util.List [^Loader this]
    (-> this (.getActiveModList))))

(defn set-active-mod-container
  "container - `net.minecraftforge.fml.common.ModContainer`"
  ([^Loader this ^net.minecraftforge.fml.common.ModContainer container]
    (-> this (.setActiveModContainer container))))

(defn get-reversed-mod-object-list
  "returns: `com.google.common.collect.BiMap<java.lang.Object,net.minecraftforge.fml.common.ModContainer>`"
  (^com.google.common.collect.BiMap [^Loader this]
    (-> this (.getReversedModObjectList))))

