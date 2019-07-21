(ns net.minecraftforge.fml.common.event.FMLPreInitializationEvent
  "Called before FMLInitializationEvent during mod startup.

  This is the first of three commonly called events during mod initialization.

  Recommended activities:
  Setup your logging getModLog()
  Load any configuration data you might have getSuggestedConfigurationFile()
  Search for a version.properties file and load it getVersionProperties()
  Configure your ModMetadata programmatically getModMetadata()
  Register your blocks and items with the GameRegistry
  Discover parts of your mod by using annotation search getAsmData()"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLPreInitializationEvent]))

(defn ->fml-pre-initialization-event
  "Constructor.

  data - `java.lang.Object`"
  (^FMLPreInitializationEvent [^java.lang.Object data]
    (new FMLPreInitializationEvent data)))

(defn get-mod-configuration-directory
  "Get the main configuration directory for this minecraft instance

  returns: the main configuration directory - `java.io.File`"
  (^java.io.File [^FMLPreInitializationEvent this]
    (-> this (.getModConfigurationDirectory))))

(defn get-asm-data
  "Get the ASMDataTable for this instance of Minecraft. This is a special structure containing
   parsing information from FML. It can be searched for annotations parsed out by FML.

  returns: `net.minecraftforge.fml.common.discovery.ASMDataTable`"
  (^net.minecraftforge.fml.common.discovery.ASMDataTable [^FMLPreInitializationEvent this]
    (-> this (.getAsmData))))

(defn get-mod-log
  "Get a logger instance configured to write to the FML Log as a parent, identified by modid. Handy for mod logging!
   Configurations can be applied through the config/logging.properties file, specifying logging levels
   for your ModID. Use this!

  returns: A logger - `org.apache.logging.log4j.Logger`"
  (^org.apache.logging.log4j.Logger [^FMLPreInitializationEvent this]
    (-> this (.getModLog))))

(defn get-version-properties
  "Get a version.properties file as a Properties object from the mod file.
   This can be used to load build-type information
   such as a unique version number from a properties file shipped as part of the distributable.

  returns: A properties object if one exists, else null - `java.util.Properties`"
  (^java.util.Properties [^FMLPreInitializationEvent this]
    (-> this (.getVersionProperties))))

(defn get-mod-state
  "Description copied from class: FMLStateEvent

  returns: The current state of the mod - `net.minecraftforge.fml.common.LoaderState$ModState`"
  (^net.minecraftforge.fml.common.LoaderState$ModState [^FMLPreInitializationEvent this]
    (-> this (.getModState))))

(defn get-fml-signing-certificates
  "Deprecated.

  returns: Certificates used to sign FML and Forge - `java.security.cert.Certificate[]`"
  ([^FMLPreInitializationEvent this]
    (-> this (.getFMLSigningCertificates))))

(defn apply-mod-container
  "active-container - `net.minecraftforge.fml.common.ModContainer`"
  ([^FMLPreInitializationEvent this ^net.minecraftforge.fml.common.ModContainer active-container]
    (-> this (.applyModContainer active-container))))

(defn get-mod-metadata
  "Get the ModMetadata for this mod

  returns: the mod metadata for the mod - `net.minecraftforge.fml.common.ModMetadata`"
  (^net.minecraftforge.fml.common.ModMetadata [^FMLPreInitializationEvent this]
    (-> this (.getModMetadata))))

(defn get-suggested-configuration-file
  "Get a suggested configuration file for this mod. It will be of the form <modid>.cfg

  returns: A suggested configuration file name for this mod - `java.io.File`"
  (^java.io.File [^FMLPreInitializationEvent this]
    (-> this (.getSuggestedConfigurationFile))))

(defn get-source-file
  "Get the File the mod was loaded from

  returns: The file the mod was loaded from - `java.io.File`"
  (^java.io.File [^FMLPreInitializationEvent this]
    (-> this (.getSourceFile))))

